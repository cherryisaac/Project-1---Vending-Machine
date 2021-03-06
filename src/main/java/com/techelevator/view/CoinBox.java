package com.techelevator.view;

public class CoinBox {
    public Double balance;

    public CoinBox() {
        balance = 0.0;
    }

    public void addMoney(Double amountToDeposit) {
        balance += amountToDeposit * 100;
    }

    public void withdrawMoney(Double amountToWithdraw) {
        balance -= amountToWithdraw;
    }

    public Double getBalanceInPennies() {
        return balance;
    }

    public String getBalanceAsString() {
        return "$" + String.format("%.2f", balance/100.00);

    }

    public String returnChangeAsCoins(Double balance) {
        Double tracker = balance;

        int totalQuartersToReturn = 0;
        int totalDimesToReturn = 0;
        int totalNickelsToReturn = 0;

        int quarter = 25;
        int dime = 10;
        int nickel = 5;

        while (tracker > 0) {
            if (tracker >= quarter) {
                totalQuartersToReturn++;
                tracker -= quarter;
            } else if (tracker >= dime) {
                totalDimesToReturn++;
                tracker -= dime;
            } else if (tracker >= nickel) {
                totalNickelsToReturn++;
                tracker -= nickel;

            }
        }
        this.balance = 0.0;

        return "Your change is " + totalQuartersToReturn + " quarters, " + totalDimesToReturn
                + " dimes, " + "and " + totalNickelsToReturn + " nickels.";
    }

}
