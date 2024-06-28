package br.com.kumabe.profin.repositories;

import br.com.kumabe.profin.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
