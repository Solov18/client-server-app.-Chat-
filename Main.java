package com.javacurse.ce.JavaDevKitSeminar1;



public class Main {
    public static void main(String[] args) {


        WindowServer windowServer = new WindowServer();
        new ClientGUI(windowServer);
        new ClientGUI(windowServer);


        
    }

}
