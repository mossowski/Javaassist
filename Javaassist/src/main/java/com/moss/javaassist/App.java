package com.moss.javaassist;

import java.io.IOException;
import java.util.Random;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class App {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        int time = random.nextInt(500 - 1) + 1;
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target("http://localhost:8080/rest/").path("resources/" + time);
        Invocation.Builder builder = webTarget.request();
        Response response = builder.get();
        int sleepTime = response.readEntity(Integer.class);
        TimeRequest timeRequest = new TimeRequest();
        timeRequest.doSomething(sleepTime);
    }
}
