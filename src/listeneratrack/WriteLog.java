/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeneratrack;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
/**
 *
 * @author SISPC-0100
 */
public class WriteLog {
    public static void WriteFrames(String trama){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\SISPC-0100\\Documents\\Logs\\AtrackUDP.txt", true));){
            bw.write("Fecha: " + LocalDate.now() + " hora: " + LocalTime.now());
            bw.newLine();
            bw.write(trama);
            bw.newLine();
            bw.newLine();
            //bw.flush();
            bw.close();
        } catch (IOException e){
            System.out.println("Error E/S: " + e);
        }
    }
}
