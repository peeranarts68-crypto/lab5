package com.example.lab3;

public class CheckListNote extends Note {
    private String item;

    public CheckListNote(String title, String createdDate, String item) {
        super(title, createdDate);
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public void getSummary() {
        System.out.println("=== Checklist Note Summary ===");
        System.out.println("Title: " + getTitle());
        System.out.println("Date: " + getCreatedDate());
        System.out.println("Items: " + item);
    }
}