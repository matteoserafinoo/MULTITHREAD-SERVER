/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadedservers_java_serafino;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Studente
 */
public class Client {
    
    Socket so;
    BufferedWriter bw;
    BufferedReader br;
    public Client(InetAddress ip, int porta) {
        
        try {
            Socket socket = new Socket("localhost", 1234);
            PrintWriter out = new PrintWriter(
                socket.getOutputStream(), true);
  
            // reading from server
            BufferedReader in
                = new BufferedReader(new InputStreamReader(
                    socket.getInputStream()));
  
            // object of scanner class
            Scanner sc = new Scanner(System.in);
            String line = null;
            bw = new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
            while (!"exit".equalsIgnoreCase(line)) {
                
                // reading from user
                line = sc.nextLine();
  
                // sending the user input to server
                out.println(line);
                out.flush();
  
                // displaying server reply
                System.out.println("Server replied "
                                   + in.readLine());
            }
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

}
