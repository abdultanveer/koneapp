package tanveer.ansari.lib;

public class CallbackDemo {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
       int sum =  calculator.praveenAdd(10,20);
        System.out.println("sum is"+sum);
        PhoneNumberListener secratarPhno = new MySecratary();
        int product = calculator.sureshMul(123,456,secratarPhno);
        System.out.println("product is "+product);
    }
}