package app;

import interfaces.LoaderFactory;
import interfaces.DataBundles;
import interfaces.AirtimeBundles;

public class Application{

    private DataBundles dataBundles;
    private AirtimeBundles airtimeBundles;

    public Application(LoaderFactory factory){
        dataBundles = factory.buyData();
        airtimeBundles = factory.buyAirtime();
    }

    public void loadData(){
        dataBundles.buyData();
    }

    public void loadAirtime(){
        airtimeBundles.buyAirtime();
    }

}
