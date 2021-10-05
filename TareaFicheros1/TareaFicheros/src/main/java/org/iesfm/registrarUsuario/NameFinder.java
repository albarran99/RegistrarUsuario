package org.iesfm.registrarUsuario;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class NameFinder {

    private static final Logger log = LoggerFactory.getLogger(CheckInMain.class);

    public static void readFile(String text, File file) {
        try (BufferedReader reader =
                     new BufferedReader(
                             new FileReader(file)
                     )
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(text)) {
                    log.error("Usuario ya exixtente " + text);

                }

            }
            NameWrite write = new NameWrite();
            write.writeToFile(file, text);
            log.info("Usuario Registrado");


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
