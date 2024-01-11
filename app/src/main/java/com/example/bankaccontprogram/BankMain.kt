package com.example.bankaccontprogram

fun main(){

    val saiBankAccount=BankAccount("sai",2500.0)
    saiBankAccount.deposit(500.0)
    saiBankAccount.withdraw(500.00)
    saiBankAccount.displayTransactionHistory()
}