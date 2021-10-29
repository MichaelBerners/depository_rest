package ru.belonogov.depository_rest.models;

import lombok.Getter;
import lombok.Setter;

//тип пользователя, роль
//клиент, кладовщик, бухгалтер, поставщик
@Getter @Setter
public class UserType {

    //user_type_pk;
    private int id;

    private String type;



}
