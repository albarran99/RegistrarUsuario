package org.iesfm.registrarUsuario;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NameWrite {

    private static final Logger log = LoggerFactory.getLogger(CheckInMain.class);

    public void writeToFile(File file, String conten, String user) {
        if (!conten.contains(user) || conten.isEmpty()) {
            try (FileWriter write = new FileWriter(file, true)) {
                write.write(user + "\n");
                log.info("Usuario registrado");
            } catch (IOException e) {
                log.error("Error escribiendo en el archivo " + file.getName());
            }
        } else {
            log.info("El usuario ya esta registrado");
        }

    }
}
