package com.example.bankaccontprogram

class BankAccount(var accountHolder: String,var balance: Double) {
    private val transactionHistory= mutableListOf<String>()
    fun deposit(amount:Double){
        balance += amount
        transactionHistory.add("$accountHolder is deposited $$amount")
    }
    fun withdraw(amount: Double){
        if (amount<=balance){
            balance -= amount
            transactionHistory.add("$accountHolder is withdrew $$amount")
        }else{
            println("you don't have a exact amount in your account. your have $amount")
        }
    }
    fun displayTransactionHistory(){
        println("Transaction History for $accountHolder")
        for (transaction in transactionHistory){
            println(transaction)
        }
        println("You have $balance in your Account")
    }
}