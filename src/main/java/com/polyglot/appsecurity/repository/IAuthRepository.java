package com.polyglot.appsecurity.repository;

import com.polyglot.appsecurity.model.AccessModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthRepository extends CrudRepository<AccessModel, Long> {

}
