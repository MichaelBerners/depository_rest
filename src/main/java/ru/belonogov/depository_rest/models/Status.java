package ru.belonogov.depository_rest.models;

//создание, проверка, оплаты нет, оплата есть, не выполнен
public enum Status {
    BUILD, VERIFICATION, PAYMENT_NO, PAYMENT_YES, NOT_EXECUTED
}
