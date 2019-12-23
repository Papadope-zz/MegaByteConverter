/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package megabytesconverter;

/**
 *
 * @author User
 */
public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes >= 0) {
            int megaBytes = (kiloBytes / 1024);
            int kiloBytesRemainder = (kiloBytes - (megaBytes * 1024));
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloBytesRemainder + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }

}
