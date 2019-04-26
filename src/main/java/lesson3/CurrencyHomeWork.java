package lesson3;

import lesson5.BaseTest;
import org.apache.commons.lang3.ArrayUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.*;

public class CurrencyHomeWork extends BaseTest {

    Map<String, Double> sellCurrencyOfBanks;
    Map<String, Double> buyCurrencyOfBanks;

    public double privateSale, privateBuy, ukrSibSale, ukrSibBuy, universeSale, universeBuy,
            oschadSale, oschadBuy, nbuSale, nbuBuy;


    @Test(priority = 1)
    public void getCountOfPrivatBankCurrency() {
        driver.get("https://www.privat24.ua/");

        String privateCurrency = driver.findElement(By.cssSelector(":first-child .section-content.rate")).getText();
        String asd = privateCurrency.replace("/ ", "");
        privateBuy = Double.parseDouble(asd.replaceAll("^\\w+.\\w+", ""));
        privateSale = Double.parseDouble(asd.replaceAll("\\s(.*)", ""));
        sellCurrencyOfBanks.put("Private", privateBuy);
        buyCurrencyOfBanks.put("Private", privateSale);

    }

    @Test(priority = 2)
    public void getCountOfUkrSibBankCurrency() {
        driver.get("https://my.ukrsibbank.com/ru/personal/operations/currency_exchange/");

        String ukrSibCurrencyBuy = driver.findElement(By.cssSelector("tbody > tr:nth-child(1) > td:nth-child(2)")).getText();
        String ukrSibCurrencySell = driver.findElement(By.cssSelector("tbody > tr:nth-child(1) > td:nth-child(3)")).getText();
        ukrSibBuy = Double.parseDouble(ukrSibCurrencyBuy);
        ukrSibSale = Double.parseDouble(ukrSibCurrencySell);
        sellCurrencyOfBanks.put("Private", ukrSibBuy);
        buyCurrencyOfBanks.put("Private", ukrSibSale);
    }

    @Test(priority = 3)
    public void getCountOfUniversalBankCurrency() {
        driver.get("https://www.universalbank.com.ua/");

        String universeCurrencyBuy = driver.findElement(By.cssSelector("tbody > tr:nth-child(2) > td:nth-child(2)")).getText();
        String universeCurrencySell = driver.findElement(By.cssSelector("tbody > tr:nth-child(2) > td:nth-child(3)")).getText();
        universeBuy = Double.parseDouble(universeCurrencyBuy);
        universeSale = Double.parseDouble(universeCurrencySell);
        sellCurrencyOfBanks.put("Private", universeBuy);
        buyCurrencyOfBanks.put("Private", universeSale);
    }

    @Test(priority = 4)
    public void getCountOfOschadBankCurrency() {
        driver.get("https://www.oschadbank.ua/");

        String oschadCurrencyBuy = driver.findElement(By.cssSelector(".buy-USD")).getText();
        String oschadCurrencySell = driver.findElement(By.cssSelector(".sell-USD")).getText();
        oschadBuy = Double.parseDouble(oschadCurrencyBuy);
        oschadSale = Double.parseDouble(oschadCurrencySell);
        sellCurrencyOfBanks.put("Private", oschadBuy);
        buyCurrencyOfBanks.put("Private", oschadSale);
    }

    @Test(priority = 5)
    public void getCountOfNbuCurrency() {
        driver.get("https://www.bank.gov.ua");

        String nbuCurrencyBuy = driver.findElement(By.cssSelector("div:nth-child(4) div > table > tbody > tr:nth-child(1) > td:nth-child(2)")).getText();
        String nbuCurrencySell = driver.findElement(By.cssSelector("div:nth-child(4) div > table > tbody > tr:nth-child(1) > td:nth-child(3)")).getText();

        String buy = nbuCurrencyBuy.substring(0, 4);
        String sell = nbuCurrencySell.substring(0, 4);

        StringBuffer buyString = new StringBuffer(buy);
        StringBuffer sellString = new StringBuffer(sell);

        nbuBuy = Double.valueOf(buyString.insert(2, ".").toString());
        nbuSale = Double.valueOf(sellString.insert(2, ".").toString());

        sellCurrencyOfBanks.put("Private", nbuBuy);
        buyCurrencyOfBanks.put("Private", nbuSale);
    }

    @Test(priority = 6)
    public void averageOfSellCurrencies() {
        Set<Map.Entry<String, Double>> sellBanks = sellCurrencyOfBanks.entrySet();
        System.out.println(sellBanks.size());
        final int[] count = {0};

        double average;
        double sum = 0;
        for (Map.Entry<String, Double> sellOfBank : sellBanks) {
            count[0]++;
            sum += sellOfBank.getValue();
            System.out.println(sellOfBank.getValue());
        }
        average = sum / count.length;
        System.out.println("Sell average: " + average);
        System.out.println("count sell: " + count.length);
    }


    @Test(priority = 7)
    public void averageOfBuyCurrencies() {
        System.out.println(sellCurrencyOfBanks.size() + "________________");
        Set<Map.Entry<String, Double>> buyBanks = buyCurrencyOfBanks.entrySet();
        final int[] count = {0};

        double average;
        double sum = 0;
        for (Map.Entry<String, Double> buyOfBank : buyBanks) {
            count[0]++;
            sum += buyOfBank.getValue();
            System.out.println(buyOfBank.getValue());
        }
        average = sum / count.length;
        System.out.println("Buy average: " + average);
    }

    @Test(priority = 8)
    public void MinAndMaxValueOfCurrencies() {
        double[] arrBuy = {privateSale, privateBuy, ukrSibSale, ukrSibBuy, universeSale, universeBuy,
                oschadSale, oschadBuy, nbuSale, nbuBuy};

        List list = Arrays.asList(ArrayUtils.toObject(arrBuy));


        System.out.println("Min currency: " + Collections.min(list));
        System.out.println("Max currency: " + Collections.max(list));
    }
}
