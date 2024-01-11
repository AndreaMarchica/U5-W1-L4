package andreamarchica.U5W1L2.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import andreamarchica.U5W1L2.entities.Drink;

import java.util.List;
import java.util.Optional;

@Repository
public interface DrinksDAO extends JpaRepository<Drink, Long>{

}
