package dataBundles;

import interfaces.DataBundles;

public class MtnDataBundles implements DataBundles {
    @Override
    public void buyData() {
        System.out.println("You have bought MTN data \n Thank you");
    }
}
