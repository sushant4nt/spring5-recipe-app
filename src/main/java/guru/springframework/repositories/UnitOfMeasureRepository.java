package guru.springframework.repositories;

import guru.springframework.domain.*;
import java.util.*;
import org.springframework.data.repository.*;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
