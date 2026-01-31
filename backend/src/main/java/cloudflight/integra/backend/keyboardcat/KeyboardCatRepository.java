package cloudflight.integra.backend.keyboardcat;

import cloudflight.integra.backend.keyboardcat.model.KeyboardCat;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Repository;

@Repository
public class KeyboardCatRepository {
    private final Map<Long, KeyboardCat> cats = new HashMap<>();
    private final AtomicLong idGen = new AtomicLong(1);

    public List<KeyboardCat> findAll() {
        return new ArrayList<>(cats.values());
    }

    public Optional<KeyboardCat> findById(Long id) {
        return Optional.ofNullable(cats.get(id));
    }

    public KeyboardCat save(KeyboardCat cat) {
        if (cat.getId() == null) {
            cat.setId(idGen.getAndIncrement());
        }
        cats.put(cat.getId(), cat);
        return cat;
    }

    public void deleteById(Long id) {
        cats.remove(id);
    }
}
