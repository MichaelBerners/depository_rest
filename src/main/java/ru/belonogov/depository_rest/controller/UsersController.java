package ru.belonogov.depository_rest.controller;

import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.belonogov.depository_rest.models.User;
import ru.belonogov.depository_rest.service.UsersService;

import javax.validation.Valid;
import javax.validation.constraints.Positive;
import java.util.List;

@Validated
@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UsersController {

    private UsersService usersService;

    //получить список всех клиентов
    @GetMapping()
    public List<User> readAll() {
        return  usersService.readAll();
    }

    //получить конкретного клиента по id
    @GetMapping("/{id}")
    public User read(@PathVariable("id") @Positive int id) {
        return usersService.read(id);
    }

    //создать клиента
    @PostMapping("/new")
    public void create(@RequestBody @Valid User user) {

        usersService.create(user);
    }

    //редактировать клиента
    @PutMapping("/{id}")
    public void update(@RequestBody @Valid User user, @PathVariable("id") @Positive int id) {

        usersService.update(user, id);
    }

    //удалить клиента по конкретному id
    @DeleteMapping("/{id}/delete")
    public void delete(@PathVariable("id") @Positive int id) {
        usersService.delete(id);
    }


}
