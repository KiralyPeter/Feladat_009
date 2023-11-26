/*
* File: App.java
* Author: Király Péter
* Copyright: 2023, Király Péter
* Group: Szoft II/1/E
* Date: 2023-11-26
* Github: https://github.com/KiralyPeter/Feladat_009.git
* Licenc: GNU GPL
*/


public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Controller controll = new Controller();

        controll.start();
        controll.stop();
        controll.restart();
    }
}
