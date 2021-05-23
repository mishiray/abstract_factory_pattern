package factories;

import airtimeBundles.AirtelAirtimeBundles;
import interfaces.AirtimeBundles;
import dataBundles.AirtelDataBundles;
import interfaces.DataBundles;
import interfaces.LoaderFactory;

public class AirtelLoaderFactory implements LoaderFactory {
    @Override
    public AirtimeBundles buyAirtime() {
        return new AirtelAirtimeBundles();
    }

    @Override
    public DataBundles buyData() {
        return new AirtelDataBundles();
    }
}
