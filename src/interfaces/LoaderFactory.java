package interfaces;

import interfaces.AirtimeBundles;
import interfaces.DataBundles;

public interface LoaderFactory {
    AirtimeBundles buyAirtime();
    DataBundles buyData();
}
