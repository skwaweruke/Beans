package org.example;

public class Main {
    public static void main(String[] args) {
        MyBean bean = new MyBean();

        // Add a listener to handle bean events
        bean.addBeanEventListener(event -> {
            System.out.println("Event received: " + event.getMessage());
        });

        // Set properties
        bean.setFirstname("Simon");

        bean.setLastname("Waweru");

        bean.setAge(30);

        bean.setSalary(70000f);

        bean.setResident("Nairobi");
    }
}
