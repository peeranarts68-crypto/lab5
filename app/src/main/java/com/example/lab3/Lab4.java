package com.example.lab3;

public class Lab4 extends Note {
    private String content;

    public Lab4(String title, String createdDate, String content) {
        super(title, createdDate);
        this.content = content;
    }

    @Override
    public void getSummary() {
        System.out.println(content);
    }
}