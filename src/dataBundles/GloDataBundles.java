package dataBundles;

import interfaces.DataBundles;

public class GloDataBundles implements DataBundles {
    @Override
    public void buyData() {
        System.out.println("You have bought Glo data \n Thank you");
    }
}
