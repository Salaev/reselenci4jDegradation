package ru.salaev.java.load;

public interface ClientApi {

    String sendOne(int sleepTimeout) throws InterruptedException;

    String sendTwo();
}
