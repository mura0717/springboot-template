package dat3.springboottemplate.repository;

import dat3.springboottemplate.entity.NameHereEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NameHereRepository extends JpaRepository<NameHereEntity, Long>{
}
