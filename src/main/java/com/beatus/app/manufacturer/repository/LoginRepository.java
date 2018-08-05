package com.beatus.app.manufacturer.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Component;

import com.beatus.app.manufacturer.model.User;
import com.beatus.app.manufacturer.utils.Constants;

@Component("loginRepository")
public class LoginRepository {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoginRepository.class);

	@Autowired
	@Qualifier(value = "driverManagerDataSource")
	private DataSource dataSource;

	public String addUser(User user) throws ClassNotFoundException, SQLException {
		PreparedStatement statement = null;
		Connection conn = null;
		try {
			LOGGER.info("In adduser");
			String sql = "INSERT INTO users (username, password, firstname, lastname, email, phone, company_id, company_name, address, city, state, user_type, uid, isVerified) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			conn = dataSource.getConnection();
			statement = conn.prepareStatement(sql);
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());
			statement.setString(3, user.getFirstname());
			statement.setString(4, user.getLastname());
			statement.setString(5, user.getEmail());
			statement.setString(6, user.getPhone());
			statement.setString(7, user.getCompanyId());
			statement.setString(8, user.getCompanyName());
			statement.setString(9, user.getAddress());
			statement.setString(10, user.getCity());
			statement.setString(11, user.getState());
			statement.setString(12, user.getUserType());
			statement.setString(13, user.getUid());
			statement.setString(14, user.getIsVerified());

			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				LOGGER.info("A new user was inserted successfully!");
				return Constants.USER_CREATED;
			} else {
				return Constants.ERROR_USER_CREATION;
			}
		} finally {
			if (statement != null) {
				statement.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}

	public User getUserByUsername(String username) throws ClassNotFoundException, SQLException {
		PreparedStatement statement = null;
		Connection conn = null;
		try {
			String sql = "SELECT * FROM users WHERE username = ?";
			conn = dataSource.getConnection();
			statement = conn.prepareStatement(sql);
			statement.setString(1, username);
			User user = new User();

			ResultSet result = statement.executeQuery();
			while (result.next()) {
				user.setUsername(result.getString("username"));
				user.setPassword(result.getString("password"));
				user.setFirstname(result.getString("firstname"));
				user.setLastname(result.getString("lastname"));
				user.setEmail(result.getString("email"));
				user.setPhone(result.getString("phone"));
				user.setCompanyId(result.getString("company_id"));
				user.setCompanyName(result.getString("company_name"));
				user.setUid(result.getString("uid"));
			}
			return user;
		} finally {
			if (statement != null) {
				statement.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}

	public String addUserToCompany(User user) throws SQLException {
		PreparedStatement statement = null;
		Connection conn = null;
		try {
			LOGGER.info("In adduserToCompany");
			String sql = "INSERT INTO company_users (username, company_id, user_type, uid) VALUES (?, ?, ?, ?)";
			conn = dataSource.getConnection();
			statement = conn.prepareStatement(sql);
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getCompanyId());
			statement.setString(3, user.getUserType());
			statement.setString(4, user.getUid());

			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				LOGGER.info("A new user was inserted successfully!");
				return Constants.USER_CREATED;
			} else {
				return Constants.ERROR_USER_CREATION;
			}
		} finally {
			if (statement != null) {
				statement.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}

	public User isUserRegistered(String username) throws SQLException {
		PreparedStatement statement = null;
		Connection conn = null;
		try {
			String sql = "SELECT * FROM company_users WHERE username = ?";
			conn = dataSource.getConnection();
			statement = conn.prepareStatement(sql);
			statement.setString(1, username);
			User user = null;

			ResultSet result = statement.executeQuery();
			while (result.next()) {
				user = new User();
				user.setUsername(result.getString("username"));
				user.setCompanyId(result.getString("company_id"));
				user.setUserType(result.getString("user_type"));
				user.setUid(result.getString("uid"));
			}
			return user;
		} finally {
			if (statement != null) {
				statement.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}

	public User getUserByPhone(String phone) throws SQLException {
		PreparedStatement statement = null;
		Connection conn = null;
		try {
			String sql = "SELECT * FROM users WHERE phone = ?";
			conn = dataSource.getConnection();
			statement = conn.prepareStatement(sql);
			statement.setString(1, phone);
			User user = new User();

			ResultSet result = statement.executeQuery();
			while (result.next()) {
				user.setUsername(result.getString("username"));
				user.setPassword(result.getString("password"));
				user.setFirstname(result.getString("firstname"));
				user.setLastname(result.getString("lastname"));
				user.setEmail(result.getString("email"));
				user.setPhone(result.getString("phone"));
				user.setCompanyId(result.getString("company_id"));
				user.setCompanyName(result.getString("company_name"));
				user.setUid(result.getString("uid"));
			}
			return user;
		} finally {
			if (statement != null) {
				statement.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}
}
