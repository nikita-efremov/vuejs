package example.vuejs.springboot.repositories;

import example.vuejs.springboot.entity.Tariff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nefremov on 25.05.2018.
 *
 * @author Nikita Efremov
 */
@Repository
public interface TariffRepository extends JpaRepository<Tariff, Long> {
}
