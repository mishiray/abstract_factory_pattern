import app.Application;
import factories.*;
import interfaces.LoaderFactory;

import java.util.Scanner;

public class testClass {
    private static Application configureApp(){
        Application application;
        LoaderFactory factory;
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome\n");
        System.out.println("WHat network are you using today ? ");
        System.out.println("1. MTN \n2. Glo \n3. Airtel");
        System.out.println("Enter 1, 2 or 3");
        int isp = input.nextInt();
        switch (isp) {
            case 1:
                factory = new MtnLoaderFactory();
                application = new Application(factory);
                break;
            case 2:
                factory = new GloLoaderFactory();
                application = new Application(factory);
                break;
            case 3:
                factory = new AirtelLoaderFactory();
                application = new Application(factory);
                break;
            default:
                factory = new MtnLoaderFactory();
                application = new Application(factory);
                break;
        }

        return application;
    }

    public static void main(String[] args) {

        while (true){
            Application app = new testClass().configureApp();
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want ...");
            System.out.println("1. Airtime Bundle \n2. Data Bundles");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    app.loadAirtime();
                    break;
                case 2:
                    app.loadData();
                    break;
                default:
                    app.loadData();
                    break;
            }
        }
    }
}
