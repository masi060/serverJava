package com.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try{
            System.out.println("Server Acceso");
            ServerSocket server = new ServerSocket(3000);
            
            Socket s = server.accept();

            System.out.println("un client si e' connesso");
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            
            System.out.println(" Creati input ed output");

            String str = in.readLine();
            System.out.println("stringa ricevuta");
            str = str.toUpperCase();

            out.writeBytes(str + "\n");
            System.out.println("stringa inviata");
            server.close();
        
        }   

        catch(Exception e){
            
        }
    }
}
