package Factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[])throws IOException {
        GetPriceProduct planFactory = new GetPriceProduct();

        System.out.print("Enter the name of product: ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String planName=br.readLine();
        System.out.print("Enter the weight: ");
        int units=Integer.parseInt(br.readLine());

        Price p = planFactory.getPlan(planName);
        //call getRate() method and calculateBill()method of DomesticPaln.

        System.out.print("Factory.Price for "+planName+" of  "+units+" is: ");
        p.setPrice();
        p.calculatePrice(units);
    }
}