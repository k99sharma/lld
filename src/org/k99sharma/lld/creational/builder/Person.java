package org.k99sharma.lld.creational.builder;

public class Person {
    // Mandatory fields
    private String firstName;
    private String lastName;

    // Optional fields
    private Integer age;
    private String email;
    private String phone;
    private String sex;

    // Private constructor to enforce the use of the builder
    private Person(PersonBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.email = builder.email;
        this.phone = builder.phone;
        this.sex = builder.sex;
    }

    public static class PersonBuilder {
        private final String firstName;
        private final String lastName;
        private Integer age;
        private String email;
        private String phone;
        private String sex;

        // Constructor for mandatory fields
        public PersonBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        // Setter methods for optional fields (chaining)
        public PersonBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public PersonBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public PersonBuilder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        // Build method to create the Person object
        public Person build() {
            return new Person(this);
        }
    }

    // Getters for fields
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}