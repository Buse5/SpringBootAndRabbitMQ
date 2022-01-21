package com.example.RabbitMQ.listeners;

import com.example.RabbitMQ.entities.CallerPerson;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class CallerPersonListener {
    //kuyruktan surekli çağrıları dinliyecek alacak işleyecek
    @RabbitListener(queues = "buse-queue") //message'ı bu kuyruktan dinliyecek
    public void handleMessage(CallerPerson callerPerson){ //çağrıyı alıp process eder
        System.out.println("call received..");
        System.out.println(callerPerson.toString()); //aldıgı her msjı ekrana yazack

    }
}
