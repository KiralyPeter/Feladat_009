/*
* File: Controller.java
* Author: Király Péter
* Copyright: 2023, Király Péter
* Group: Szoft II/1/E
* Date: 2023-11-26
* Github: https://github.com/KiralyPeter/Feladat_009.git
* Licenc: GNU GPL
*/

/* 

Feladat 009

Adott a követkeő interfész:

public interface Controllable {
    void start();
    void stop();
    void restart();
}

Készítsen osztályt Controller néven, amely megvalósítja az interfészt. 
Az egyes metódusok, csak egy szöveg kiíratásával küldjenek üzenetet, hogy 
az adott funkció elindult. 

*/

public class Controller implements Controllable { 
    

    @Override
    public void start() {
        System.out.println("A \"start()\" funkció elindult");
    }

    @Override
    public void stop() {
        System.out.println("A \"stop()\" funkció elindult");
    }

    @Override
    public void restart() {
        System.out.println("A \"restart()\" funkció elindult");
    }

   
}
