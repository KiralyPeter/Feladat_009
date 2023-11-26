/*
* File: Controllable.java
* Author: Király Péter
* Copyright: 2023, Király Péter
* Group: Szoft II/1/E
* Date: 2023-11-26
* Github: https://github.com/janos/
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
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    @Override
    public void start() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stop'");
    }

    @Override
    public void restart() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'restart'");
    }

   
}
