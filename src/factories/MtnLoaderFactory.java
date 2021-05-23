package factories;

import interfaces.AirtimeBundles;
import airtimeBundles.MtnAirtimeBundles;
import interfaces.DataBundles;
import dataBundles.MtnDataBundles;
import interfaces.LoaderFactory;

public class MtnLoaderFactory implements LoaderFactory {
    @Override
    public AirtimeBundles buyAirtime() {
        return new MtnAirtimeBundles();
    }

    @Override
    public DataBundles buyData() {
        return new MtnDataBundles();
    }
}
