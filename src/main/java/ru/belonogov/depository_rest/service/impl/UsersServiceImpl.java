package ru.belonogov.depository_rest.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import ru.belonogov.depository_rest.models.User;
import ru.belonogov.depository_rest.service.UsersService;

import java.util.List;

@Service
@AllArgsConstructor
public class UsersServiceImpl implements UsersService {

    JdbcTemplate jdbcTemplate;

    @Override
    public void create(User user) {
        jdbcTemplate.update("insert into users value (?, ?, ?, ?, ?, ?)",
                user.getLastName(), user.getFirstName(), user.getPatronymic(), user.getPhoneNumber(),
                user.getEmail(), user.getPassword(), 1);
    }

    @Override
    public User read(int id) {
        return jdbcTemplate.queryForObject("select * from users where id = ?", new UsersMapper(), id);
    }

    @Override
    public List<User> readAll() {

        return jdbcTemplate.query("select * from users where user_types_id = 1", new UsersMapper());
    }

    @Override
    public void update(User user, int id) {
        jdbcTemplate.update("UPDATE users SET last_name = ?, first_name = ?, patronymic = ?," +
                        "phone_number = ?, email = ?, password = ? WHERE id = ?", user.getLastName(),
                user.getFirstName(), user.getPatronymic(), user.getPhoneNumber(),
                user.getEmail(), user.getPassword(), id);
    }

    @Override
    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM users WHERE id = ?", id);
    }
}
