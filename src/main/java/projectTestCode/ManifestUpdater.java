package projectTestCode;

import java.io.*;
import java.util.jar.*;

public class ManifestUpdater {
    public static void main(String[] args) {
        // Specify the JAR file to update and the updated JAR file
        String inputJarPath = "D:/AGENT/APPD_INSTALL_PATH/ReformIdToNamePopupExpression.jar";  // Existing JAR file
        String outputJarPath = "D:/AGENT/APPD_INSTALL_PATH/ReformIdToNamePopupExpressionUpdate.jar"; // New JAR with updated manifest

        try (JarFile jarFile = new JarFile(inputJarPath)) {
            // Read the existing manifest
            Manifest manifest = jarFile.getManifest();

            if (manifest == null) {
                System.out.println("No MANIFEST.MF found in the JAR.");
                return;
            }

            // Update the manifest attributes
            Attributes attributes = manifest.getMainAttributes();
            String classPath = attributes.getValue("Class-Path");
            if (classPath != null) {
                // Replace ReformReporterTemplate_lib with lib
                classPath = classPath.replace("ReformIdToNamePopupExpression_lib", "lib");
                attributes.putValue("Class-Path", classPath);
            }
            // Write the updated JAR
            try (JarOutputStream jos = new JarOutputStream(new FileOutputStream(outputJarPath), manifest)) {
                // Copy all entries from the original JAR to the new JAR, except MANIFEST.MF
                jarFile.stream().forEach(entry -> {
                    try {
                        if (!entry.getName().equals("META-INF/MANIFEST.MF")) {
                            jos.putNextEntry(entry);
                            try (InputStream is = jarFile.getInputStream(entry)) {
                                is.transferTo(jos);
                            }
                            jos.closeEntry();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
            }

            System.out.println("JAR file updated successfully: " + outputJarPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
