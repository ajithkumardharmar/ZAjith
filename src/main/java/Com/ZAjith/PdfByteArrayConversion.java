package Com.ZAjith;

import java.io.*;
import java.util.Base64;

public class PdfByteArrayConversion {
    public static void main(String[] args) {
        try {
            // Step 1: Read the PDF file and convert it to a byte array
            File inputFile = new File("C:\\Users\\ajit2903\\Desktop\\Backup\\Husaner\\04-01-2024\\HeaderTestOneTomany_5000.pptx");
            byte[] pdfByteArray = convertPdfToByteArray(inputFile);

            // Step 2: Encode the byte array to Base64
            String base64String = encodeToBase64(pdfByteArray);

            // Step 3: Store the Base64 string to a text file
            File outputBase64File = new File("C:\\Users\\ajit2903\\Desktop\\Backup\\Husaner\\04-01-2024\\ByteArray\\HeaderTestOneTomany_5000.pptx");
            storeBase64ToFile(base64String, outputBase64File);

            System.out.println("PDF to Base64 conversion completed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static byte[] convertPdfToByteArray(File file) throws IOException {
        try (FileInputStream fis = new FileInputStream(file);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            return baos.toByteArray();
        }
    }

    private static String encodeToBase64(byte[] pdfByteArray) {
        return Base64.getEncoder().encodeToString(pdfByteArray);
    }

    private static void storeBase64ToFile(String base64String, File outputFile) throws IOException {
        try (PrintWriter writer = new PrintWriter(outputFile)) {
            writer.println(base64String);
        }
    }
}
