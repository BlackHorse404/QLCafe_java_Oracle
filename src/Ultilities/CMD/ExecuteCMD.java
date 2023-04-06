/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ultilities.CMD;

import GUI.Dashboard;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phatl
 */
public class ExecuteCMD {
    
    public static boolean runCommand(String cmd){
        final ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", cmd);
        try {
            Process p = builder.start();
            
            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            
//            System.out.println("Command Result:");
//            while (true) {
//                line = r.readLine();
//                if (line == null) { break; }
//                System.out.println(line);
//            }
        } catch (IOException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }finally {
            return true;
        }
    }
}
