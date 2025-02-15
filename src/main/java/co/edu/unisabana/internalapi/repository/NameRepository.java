package co.edu.unisabana.internalapi.repository;

import co.edu.unisabana.internalapi.entity.Name;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NameRepository extends JpaRepository<Name, Long> {
}
