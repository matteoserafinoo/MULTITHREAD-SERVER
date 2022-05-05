/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadedservers_java_serafino;

/**
 *
 * @author Studente
 */
public class AvvioServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Server srv = new Server(2000);
        srv.ascolto();
        srv.scrivi("Benvenuto client");
    }
    
}
