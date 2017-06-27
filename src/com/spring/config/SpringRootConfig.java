package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc //<mvc:annotation-driven />
@Configuration
@EnableTransactionManagement
@ComponentScans(value = { @ComponentScan("com.spring.dao"),
		@ComponentScan("com.spring.service") })
public class SpringRootConfig extends WebMvcConfigurerAdapter{
	
//	@Bean
//	public LocalEntityManagerFactoryBean geEntityManagerFactoryBean() {
//		LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
//		factoryBean.setPersistenceUnitName("LOCAL_PERSISTENCE");
//		return factoryBean;
//	}

//	@Bean
//	public JpaTransactionManager geJpaTransactionManager() {
//		JpaTransactionManager transactionManager = new JpaTransactionManager();
//		transactionManager.setEntityManagerFactory(geEntityManagerFactoryBean().getObject());
//		return transactionManager;
//	}
	
}