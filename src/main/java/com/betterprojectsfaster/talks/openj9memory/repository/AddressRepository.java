package com.betterprojectsfaster.talks.openj9memory.repository;

import com.betterprojectsfaster.talks.openj9memory.domain.Address;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data  repository for the Address entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

    @Query("select address from Address address where address.user.login = ?#{principal.username}")
    List<Address> findByUserIsCurrentUser();
}
