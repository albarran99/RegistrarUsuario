package org.iesfm.registrarUsuario;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Scanner;

public class CheckInMain {

    private static final Logger log = LoggerFactory.getLogger(CheckInMain.class);
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        PathFinder path = new PathFinder();

        log.info("Introduce su nombre para registrase");
        String nameUser = scan.nextLine();

        log.info("1.Introduce la ruta al fichero");
        File registerPath = path.findPath();

        NameFinder.readFile(nameUser, registerPath);

    }
}
