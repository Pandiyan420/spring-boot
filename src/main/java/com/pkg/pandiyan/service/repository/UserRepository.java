/**
 * 
 */
package com.pkg.pandiyan.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pkg.pandiyan.entiry.User;

/**
 * @author Pandiyan
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
