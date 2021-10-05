package org.iesfm.registrarUsuario;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Scanner;

public class PathFinder {

    private static final Logger log = LoggerFactory.getLogger(CheckInMain.class);
    private static final Scanner scan = new Scanner(System.in);

    public File findPath() {
        log.info("Introduce la ruta");
        String path = scan.nextLine();

        return new File(path);
    }
}
