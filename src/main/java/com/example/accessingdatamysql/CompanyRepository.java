package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;


public interface CompanyRepository extends CrudRepository<Company, Integer> {

}
