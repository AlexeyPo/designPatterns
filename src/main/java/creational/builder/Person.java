package creational.builder;

public class Person {

    private String name;
    private String surname;
    private int age;
    private int height;
    private int weight;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public static Builder builder() {
        return new Person().new Builder();
    }

    public class Builder {
        private Builder() {}

        public Builder setName(String name) {
            Person.this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            Person.this.surname = surname;
            return this;
        }

        public Builder setAge(int age) {
            Person.this.age = age;
            return this;
        }

        public Builder setHeight(int height) {
            Person.this.height = height;
            return this;
        }

        public Builder setWeight(int weight) {
            Person.this.weight = weight;
            return this;
        }

        public Person build() {
            return Person.this;
        }
    }
}
