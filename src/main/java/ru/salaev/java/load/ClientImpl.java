package ru.salaev.java.load;

import org.springframework.stereotype.Component;

@Component
public class ClientImpl implements ClientApi {

    @Override

    public String sendOne(int sleepTimeout) throws InterruptedException {
        if (sleepTimeout > 0) {
            Thread.sleep(sleepTimeout);
            return "Request One degradation: " + sleepTimeout;
        } else {
            return "Request One";
        }
    }

    @Override
    public String sendTwo() {
        return "Request Two";
    }
}
