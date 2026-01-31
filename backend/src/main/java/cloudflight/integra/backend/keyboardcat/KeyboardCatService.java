package cloudflight.integra.backend.keyboardcat;

import cloudflight.integra.backend.keyboardcat.model.KeyboardCat;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class KeyboardCatService {
    private final KeyboardCatRepository repository;

    public KeyboardCatService(KeyboardCatRepository repository) {
        this.repository = repository;
    }

    public List<KeyboardCat> getAll() {
        return repository.findAll();
    }

    public Optional<KeyboardCat> getById(Long id) {
        return repository.findById(id);
    }

    public KeyboardCat create(KeyboardCat cat) {
        return repository.save(cat);
    }

    public Optional<KeyboardCat> update(Long id, KeyboardCat cat) {
        if (repository.findById(id).isPresent()) {
            cat.setId(id);
            return Optional.of(repository.save(cat));
        }
        return Optional.empty();
    }

    public boolean delete(Long id) {
        if (repository.findById(id).isPresent()) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
