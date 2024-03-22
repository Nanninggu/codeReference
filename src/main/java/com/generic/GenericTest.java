package com.generic;

public class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public static void main(String[] args) {
        // Creating a Box for Integer
        Box<Integer> intBox = new Box<>();
        intBox.setContent(10);
        System.out.println("Integer value: " + intBox.getContent());

        // Creating a Box for String
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello, Generics!");
        System.out.println("String value: " + stringBox.getContent());

        // Creating a Box for Double
        Box<Double> doubleBox = new Box<>();
        doubleBox.setContent(3.14);
        System.out.println("Double value: " + doubleBox.getContent());
    }
}
