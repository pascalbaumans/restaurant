package application;

import application.entity.Plat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatRepository
        extends JpaRepository<Plat,Long> {


}
