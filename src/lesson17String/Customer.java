package lesson17String;

public class Customer {
    private String firstName;
    private String lastName;
    private String city;
    private Integer age;
    private final int ID;
    private static int numberOdClients;

    static {
        numberOdClients = 0;
    }// blok statyczny, bez statycznego blok inicjacyjny

    {
        numberOdClients++;
        ID = 100 + numberOdClients;
    }

//    public Customer(){
//        firstName = new String();
//        lastName = new String();
//        city = new String();
//        age = new String();
//    }

    public Customer(String firstName, String lastName, String city, Integer age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.age = age;
    }

    public Customer(String data){
        String[] split = data.split(",");
        this.firstName = split[0];
        this.lastName = split[1];
        this.city = split[2];
        this.age = Integer.valueOf(split[3]);
    }

    public int getID() {
        return ID;
    }

    public static int getNumberOdClients() {
        return numberOdClients;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "First name = " + firstName + "\nLast name = " + lastName
                + "\nCity = " + city + "\nAge = " + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Customer)){
            return false;
        }
        Customer customer = (Customer)obj;
        return this.ID == customer.ID;
//        return this.firstName.equalsIgnoreCase(customer.firstName) &&
//                this.lastName.equalsIgnoreCase(customer.lastName)&&
//                this.city.equalsIgnoreCase(customer.city)
//                this.age.equalsIgnoreCase(customer.age);
    }
}
