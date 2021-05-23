package dataBundles;

import interfaces.DataBundles;

public class AirtelDataBundles implements DataBundles {
    @Override
    public void buyData() {
        System.out.println("You have bought Airtel data \n Thank you");
    }
}
