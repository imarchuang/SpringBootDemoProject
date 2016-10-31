package com.imarchuang.repositories;

import com.imarchuang.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mhuang on 8/24/2016.
 */
public interface AccountRepository extends JpaRepository<Account, Long> {
}
