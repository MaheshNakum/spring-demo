package com.codedurance.tesco.bootcamp.springboot;

import java.util.Objects;

/**
 * Created by maheshnakum on 03/01/2017.
 */
public class Message {

    private String text;

    public Message (String text){

        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(text, message.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    public String getText() {
        return text;
    }
}
