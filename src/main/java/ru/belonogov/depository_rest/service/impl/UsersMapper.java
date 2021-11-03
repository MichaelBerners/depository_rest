package ru.belonogov.depository_rest.service.impl;

import org.springframework.jdbc.core.RowMapper;
import ru.belonogov.depository_rest.models.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UsersMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();

        user.setId(rs.getInt("id"));
        user.setLastName(rs.getString("last_name"));
        user.setFirstName(rs.getString("first_name"));
        user.setPatronymic(rs.getString("patronymic"));
        user.setPhoneNumber((rs.getString("phone_number")));
        user.setEmail(rs.getString("email"));
        user.setPassword(rs.getString("password"));
        user.setUserType(rs.getInt("user_types_id"));
        return user;

    }
}
