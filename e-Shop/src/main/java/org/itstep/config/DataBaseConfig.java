package org.itstep.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DataBaseConfig {
	
	@Autowired
	JpaVendorAdapter jpaVendorAdapter;

	@Bean
	public DataSource dataSource() {

		HikariConfig config = new HikariConfig();

		HikariDataSource ds;

		config.addDataSourceProperty("spring.datasource.type", "com.zaxxer.hikari.HikariDataSource");
		
		config.setJdbcUrl("jdbc:h2:~/e-shop");
		config.setUsername("alex");
		config.setPassword("12345");
		config.setDriverClassName("org.h2.Driver");
		
		ds = new HikariDataSource(config);

		return ds.getDataSource();
	}

	@Bean
	public EntityManager entityManager() {
		return entityManagerFactory().createEntityManager();
	}

	@Bean
	public EntityManagerFactory entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean lef = new LocalContainerEntityManagerFactoryBean();
		lef.setDataSource(dataSource());
		lef.setJpaVendorAdapter(jpaVendorAdapter);
		lef.setPackagesToScan("org.itstep.*");
		return lef.getObject();
	}

	@Bean
	public PlatformTransactionManager transactionManager() {
		return new JpaTransactionManager(entityManagerFactory());
	}

}
