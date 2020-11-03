package ch.zhaw.gpi.erp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zhaw.gpi.erp.entities.Creditor;

public interface CreditorRepository extends JpaRepository<Creditor, Long> {
    
}
