package tanveer.ansari.lib;

public class MySecratary implements PhoneNumberListener{
    @Override
    public void onSuccess(int product) {
        System.out.println("suresh gave the result as -"+product);
    }
}
