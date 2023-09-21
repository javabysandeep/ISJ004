package ObjectClassDemos;

public class Demo11ShallowCopying {
    public static void main(String[] args) throws CloneNotSupportedException {
        class Address {
            String street;
            String state;
            String country;

            public Address() {
            }

            public Address(String street, String state, String country) {
                this.street = street;
                this.state = state;
                this.country = country;
            }

            @Override
            public String toString() {
                return "Address{" +
                        "street='" + street + '\'' +
                        ", state='" + state + '\'' +
                        ", country='" + country + '\'' +
                        '}';
            }
        }
        class Student implements Cloneable{
            int id;
            String name;
            Address address;

            public Student() {
            }

            public Student(int id, String name, Address address) {
                this.id = id;
                this.name = name;
                this.address = address;
            }

            @Override
            public String toString() {
                return "Student{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", address=" + address +
                        '}';
            }

            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        }

        Address address = new Address("NS","MH","IND");
        Student student1 = new Student(1,"sachin",address);
        Student student2 = (Student) student1.clone();
        System.out.println(student1);
        System.out.println(student2);
        System.out.println("After changes");
        student1.address.country = "Bharat";
        System.out.println(student1);
        System.out.println(student2);


    }
}
