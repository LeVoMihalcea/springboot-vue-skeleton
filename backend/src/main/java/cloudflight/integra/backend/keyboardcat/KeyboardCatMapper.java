package cloudflight.integra.backend.keyboardcat;

import cloudflight.integra.backend.keyboardcat.model.KeyboardCat;
import cloudflight.integra.backend.keyboardcat.model.KeyboardCatDto;
import org.springframework.stereotype.Component;

@Component
public class KeyboardCatMapper {
    public KeyboardCatDto toDto(KeyboardCat cat) {
        return new KeyboardCatDto(cat.getId(), cat.getName(), cat.getFavoriteSong(), cat.getAge());
    }

    public KeyboardCat toEntity(KeyboardCatDto dto) {
        return new KeyboardCat(dto.id(), dto.name(), dto.favoriteSong(), dto.age());
    }
}
