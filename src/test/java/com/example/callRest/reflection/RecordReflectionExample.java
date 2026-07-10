package com.example.callRest.reflection;

public class RecordReflectionExample {
    record Person(String name, int age) {}
 
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);
 
        for (var component : person.getClass().getRecordComponents()) {
            try {
                var value = component.getAccessor().invoke(person);
                System.out.println(component.getName() + ": " + value);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}