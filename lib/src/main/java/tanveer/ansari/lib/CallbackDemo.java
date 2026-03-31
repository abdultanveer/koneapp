package tanveer.ansari.lib;

public class CallbackDemo {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
       int sum =  calculator.praveenAdd(10,20);
        System.out.println("sum is"+sum);
        PhoneNumberListener secratarPhno = new MySecratary();
        new Thread(){
            @Override
            public void run() {
                super.run();
                calculator.sureshMul(123,456,secratarPhno);
            }
        }.start();
        System.out.println("abdul is continuing with the class while suresh is multiplying ");
    }
}