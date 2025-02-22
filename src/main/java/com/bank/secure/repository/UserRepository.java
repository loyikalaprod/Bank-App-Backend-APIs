package com.bank.secure.repository;

import com.bank.secure.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    /*
    * 1.verifier par email si l'utilisateur existe
    * */

    Boolean existsByEmail(String email);

    Boolean existsByAccountNumber(String AccountNumber);

    User findByAccountNumber(String accountNumber);

}
