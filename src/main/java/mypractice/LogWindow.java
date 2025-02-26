package mypractice;

import java.io.*;
import java.util.concurrent.*;
import javax.swing.*;

public class LogWindow {
    private JTextArea textArea;
    private JFrame frame;

    public LogWindow() {
        frame = new JFrame("Live Log Window");
        textArea = new JTextArea(20, 50);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void updateLog(String log) {
        // Ensure thread-safe UI updates
        SwingUtilities.invokeLater(() -> textArea.append(log + "\n"));
    }

    public void processLogs() throws InterruptedException, IOException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // First process log
        Future<?> process1 = executor.submit(() -> {
            try {
                readAndDisplayLog("D:/TestGit/process1.log", 0, 5);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        // Second process log (every 10 lines)
        Future<?> process2 = executor.submit(() -> {
            try {
                readAndDisplayLog("D:/TestGit/process2.log", 10, 10);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        // Wait for the second process to complete before appending the rest of the first process log
        process2.get();
        process1.get();  // Wait until first process is done

        executor.shutdown();
    }

    private void readAndDisplayLog(String filePath, int batchSize, int linesToShow) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        int lineCount = 0;
        StringBuilder logBatch = new StringBuilder();

        while ((line = reader.readLine()) != null) {
            logBatch.append(line).append("\n");
            lineCount++;

            // Display logs in the UI in batches
            if (lineCount == linesToShow) {
                updateLog(logBatch.toString());
                logBatch.setLength(0);  // Clear the batch
                lineCount = 0;
            }
        }

        // Display remaining logs
        if (logBatch.length() > 0) {
            updateLog(logBatch.toString());
        }

        reader.close();
    }

    public static void main(String[] args) throws InterruptedException, IOException, ExecutionException {
        LogWindow window = new LogWindow();
        window.processLogs();
    }
}

