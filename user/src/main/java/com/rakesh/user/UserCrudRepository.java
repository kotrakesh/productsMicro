package com.rakesh.user;

import com.rakesh.user.User;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<User,Integer> {

}
