package com.example.callRest.config;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class hibernetConfig {

	
	@Bean
	public DataSource getpayDbDataSource() throws PropertyVetoException {

		HikariConfig config = new HikariConfig();
//		config.setDriverClassName(env.getProperty("getepay.database.driver"));
//		config.setJdbcUrl(env.getProperty("getepaydb.database.url"));
//		config.setUsername(env.getProperty("getepaydb.database.username"));
//		config.setPassword(env.getProperty("getepaydb.database.password"));
//		
		config.setMaximumPoolSize(1);
		config.setMinimumIdle(1);
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "250");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
		config.addDataSourceProperty("maximumPoolSize", "100");
		config.addDataSourceProperty("poolName", "getepayDbPool");
		

		HikariDataSource ds = new HikariDataSource(config);
		return ds;

	}
	
}

