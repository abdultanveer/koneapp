package tanveer.ansari.lib;

public class Calculator {

    int praveenAdd(int a, int b){
        return  a + b;
    }

    void sureshMul(int a, int b, PhoneNumberListener secratarPhno){
        try {
            Thread.sleep(5000);
            secratarPhno.onSuccess(a*b);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
