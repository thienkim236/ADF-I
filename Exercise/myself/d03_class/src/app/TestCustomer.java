
package app;

public class TestCustomer {

    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.accept();
        c1.display();
        
        Customer c2 = new Customer();
        c2.display();
        
        Customer c3 = new Customer("C03","Dung","dung@gmail.com",2000, false);
        c3.display();
    }
}
