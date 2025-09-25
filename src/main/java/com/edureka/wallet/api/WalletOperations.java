package com.edureka.wallet.api;

public interface WalletOperations {
    void addMoney(double amount);
    void withdrawMoney(double amount);
    double checkBalance();
}
