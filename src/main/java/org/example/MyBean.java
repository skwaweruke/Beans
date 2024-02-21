package org.example;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


// Define an event class (can be any POJO representing the event)
class BeanEvent {
    private String message;

    public BeanEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

// Define an interface for listeners
interface BeanEventListener {
    void onBeanEvent(BeanEvent event);
}
public class MyBean implements Serializable {


    private String firstname;
    private String lastname;
    private int age;
    private Float salary;
    private String resident;
    private List<BeanEventListener> listeners = new ArrayList<BeanEventListener>();

    public MyBean(){

        //Default constructor

    }

    // Getter and Setter for firstname
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
        // Trigger an event when the firstname is set
        fireEvent(new BeanEvent("First name changed to: " + firstname));
    }

    // Getter and Setter for lastname
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
        // Trigger an event when the lastname is set
        fireEvent(new BeanEvent("Last name changed to: " + lastname));
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        // Trigger an event when the age is set
        fireEvent(new BeanEvent("Age changed to: " + age));
    }

    // Getter and Setter for salary
    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
        // Trigger an event when the salary is set
        fireEvent(new BeanEvent("Salary changed to: " + salary));
    }

    // Getter and Setter for resident
    public String getResident() {
        return resident;
    }

    public void setResident(String resident) {
        this.resident = resident;
        // Trigger an event when the resident is set
        fireEvent(new BeanEvent("Resident changed to: " + resident));
    }


        // Method to add listeners
        public void addBeanEventListener(BeanEventListener listener) {
            listeners.add(listener);
        }
    
        // Method to remove listeners
        public void removeBeanEventListener(BeanEventListener listener) {
            listeners.remove(listener);
        }
    
        // Method to trigger an event
        private void fireEvent(BeanEvent event) {
            for (BeanEventListener listener : listeners) {
                listener.onBeanEvent(event);
            }
        }

}

