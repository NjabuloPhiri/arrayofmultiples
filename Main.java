package arrayofmultiples;


public class Main {
    public static void main(String[] args) {
        var arr = new arrayOfMultiplesImpl();
        var message = arr.allMultiples(12, 10);
        System.out.println("The final output is " + message);
    }
}
