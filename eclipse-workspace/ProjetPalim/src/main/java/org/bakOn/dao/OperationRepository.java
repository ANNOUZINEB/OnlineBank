package org.bakOn.dao;

import org.bakOn.entities.Compte;
import org.bakOn.entities.Operation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OperationRepository extends JpaRepository<Operation, Long> {
	@Query("select o from Operation o where o.compte=:x order by o.dateOperation asc")
	Page<Operation> findByCompte(@Param("x")Compte codeCpte,Pageable pageable);

}
