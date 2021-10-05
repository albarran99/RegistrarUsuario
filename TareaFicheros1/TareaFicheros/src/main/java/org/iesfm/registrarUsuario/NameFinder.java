package org.iesfm.registrarUsuario;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class NameFinder {

    private static final Logger log = LoggerFactory.getLogger(CheckInMain.class);

    public static String readFile(File file) {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader =
                     new BufferedReader(
                             new FileReader(file)
                     )
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line).append("\n");
                }

            } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        return builder.toString();

    }
}
