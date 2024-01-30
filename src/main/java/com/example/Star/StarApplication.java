package com.example.Star;

import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.security.UserGroupInformation;
import org.datanucleus.store.rdbms.datasource.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.io.IOException;
import java.nio.file.Paths;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@SpringBootApplication
@EnableJpaRepositories
public class StarApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(StarApplication.class, args);




	}




}




