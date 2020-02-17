package com.company;

import java.io.*;
import java.net.Socket;

public class Main {

    public static void main(String[] args) throws IOException {
        String host = "localhost";
        int puerto = 44444;

        BufferedReader lee = new BufferedReader(new InputStreamReader(System.in));

        Socket cliente = new Socket(host, puerto);

        //flujos de entrada y salida con el servidor
        DataOutputStream fSalida = new DataOutputStream(cliente.getOutputStream());
        DataInputStream fEntrada = new DataInputStream(cliente.getInputStream());
        String cadena = "";
        String cadenaMayus = "";

        do {
            System.out.println("Teclea una cadena:");
            cadena = lee.readLine();
            fSalida.writeUTF(cadena);

            if (!cadena.equals("*")) {
                //Recibo la cadena en mayusculas
                cadenaMayus = fEntrada.readUTF();
                System.out.println("La cadena recibida es " + cadenaMayus);
            }
        }while(!cadena.equals("*"));

        fSalida.close();
        fEntrada.close();
        cliente.close();

    }
}
