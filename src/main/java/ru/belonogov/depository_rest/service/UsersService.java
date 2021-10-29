package ru.belonogov.depository_rest.service;

import ru.belonogov.depository_rest.models.User;

import java.util.List;

public interface UsersService {

    //создать нового пользователя
    void create(User user);

    //прочитать данные пользователя по id
    User read(int id);

    //вывести весь список пользователей
    List<User> readAll();

    //изменить пользователя с id
    void update(User client, int id);

    //удалить пользовател с id
    void delete(int id);


}
