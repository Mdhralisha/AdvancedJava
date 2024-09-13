package client;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import server.Calculator;
import java.rmi.Naming;
import java.rmi.NotBoundException;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            // creating client i.e stub object to invoke remote method
            Calculator stub = (Calculator) Naming.lookup("rmi://localhost/CalculatorServer") ;
            
            // invoking remote method
            double sum = stub.add(12, 45);
            double difference = stub.subtract(56, 20);
            double product = stub.multiply(12, 6);
            double division = stub.divide(99, 3);
            
            System.out.println("Sum of two number: " + sum);
            System.out.println("Difference of two number: " + difference);
            System.out.println("Product of two number: " + product);
            System.out.println("Division of two number: " + division);
        } catch (NotBoundException | MalformedURLException | RemoteException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


// question tu ko board wala ma xa
//what is rmi ? explaiin its components (interface, registry, stub obj, skeleton obj)
// Rmi ko ques ko lagi
//1. remote interfae -> Implemenatation class  calculatorImpl wala yesle Calculator vanne 
//interface laii implement gareko xa
//yesma calculator interface class xa
// calculator interface ma method 4 ota add sub multiply division

// ques anusar price interface banaune method chaii calculate selling price


// 2. Remote server
// 3. client 
// yesle stub obj banaunxa lookup vanne le objcet khojxa exist garxa vane invoke method dinxa