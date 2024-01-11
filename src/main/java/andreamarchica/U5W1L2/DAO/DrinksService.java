package andreamarchica.U5W1L2.DAO;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import andreamarchica.U5W1L2.entities.Drink;

@Service
@Slf4j
public class DrinksService {
    @Autowired
    private DrinksDAO drinksDAO;
}
