package com.example.callRest.reflection;
import java.lang.reflect.Field;
 
public class FieldReflectionExample {
    static class Person {
        String name;
        int age;
 
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
 
    public static void main(String[] args) {
        Person person = new Person("Jane Doe", 25);
 
        for (Field field : person.getClass().getDeclaredFields()) {
            field.setAccessible(true); // Ensure private fields are accessible
            try {
                Object value = field.get(person);
                System.out.println(field.getName() + ": " + value);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}