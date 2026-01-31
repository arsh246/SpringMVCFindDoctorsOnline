package com.doctors.dao;

import java.sql.SQLException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.doctors.beans.Doctor;

public class DoctorDao {
    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public Doctor getDoctorsByName(String doctorName) throws SQLException {
        String sql = "SELECT * FROM DoctorsDetails WHERE doctorName = ?";
        return template.queryForObject(sql, new Object[]{doctorName},
                new BeanPropertyRowMapper<>(Doctor.class));
    }

    public Doctor getDoctorsByRegistrationNumber(String registrationNumber) throws SQLException {
        String sql = "SELECT * FROM DoctorsDetails WHERE doctorRegistrationNumber = ?";
        return template.queryForObject(sql, new Object[]{registrationNumber},
                new BeanPropertyRowMapper<>(Doctor.class));
    }
}