package factories;

import interfaces.AirtimeBundles;
import airtimeBundles.GloAirtimeBundles;
import interfaces.DataBundles;
import dataBundles.GloDataBundles;
import interfaces.LoaderFactory;

public class GloLoaderFactory implements LoaderFactory {
    @Override
    public AirtimeBundles buyAirtime() {
        return new GloAirtimeBundles();
    }

    @Override
    public DataBundles buyData() {
        return new GloDataBundles();
    }
}
