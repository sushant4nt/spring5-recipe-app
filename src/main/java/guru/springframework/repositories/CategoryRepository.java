package guru.springframework.repositories;

import guru.springframework.domain.*;
import java.util.*;
import org.springframework.data.repository.*;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
