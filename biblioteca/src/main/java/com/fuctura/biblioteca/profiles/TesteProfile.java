package com.fuctura.biblioteca.profiles;

import com.fuctura.biblioteca.services.DBService;

import java.beans.BeanProperty;

@Configuration
@Profile("teste")
public class TesteProfile {

    @Autowired
    private DBService dbService;

    @Bean
    public void instanciaDB(){
        this.dbService.instaciaDB();
    }
}
