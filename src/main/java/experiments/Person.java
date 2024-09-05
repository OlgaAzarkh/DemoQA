package experiments;

public  class Person {
    private String name;
    private String lastName;


    public Person(String name, String lastName) {
        this.lastName = lastName;
        this.name = name;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("Name: " + name + " " + "LastName: " + lastName);

    }


}
