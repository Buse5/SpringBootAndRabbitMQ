package com.example.RabbitMQ.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
public class CallerPerson implements Serializable {
    @Id
    private String callerPersonId;

    private String callerPerson;
    private Date createdAt;
    private  Boolean seen;
    private String message;
    @Override
    public String toString() {
        return "CallerPerson{" +
                "callerPersonId='" + callerPersonId + '\'' +
                ", callerPerson='" + callerPerson + '\'' +
                ", createdAt=" + createdAt +
                ", seen=" + seen +
                ", message='" + message + '\'' +
                '}';
    }
}
