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
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("atrackLog.txt", true));){
            bw.write(LocalDate.now() + " " + LocalTime.now() + ": " + trama);
            bw.newLine();
            //bw.flush();
            bw.close();
        } catch (IOException e){
            System.out.println("Error E/S: " + e);
        }
    }
}
