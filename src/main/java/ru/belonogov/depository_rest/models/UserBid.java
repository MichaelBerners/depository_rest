package ru.belonogov.depository_rest.models;

//сводная таблица для связи многие ко многим пользователь/заявка
public class UserBid {

    int orderId;
    int goodsId;
    private double price; //цена
    private int amount; //количество
}
