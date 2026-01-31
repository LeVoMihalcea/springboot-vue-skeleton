package cloudflight.integra.backend.keyboardcat;

import cloudflight.integra.backend.keyboardcat.model.KeyboardCatDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/keyboardcats")
public class KeyboardCatController {
    private final KeyboardCatService service;
    private final KeyboardCatMapper mapper;

    public KeyboardCatController(KeyboardCatService service, KeyboardCatMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping
    public List<KeyboardCatDto> getAll() {
        return service.getAll().stream().map(mapper::toDto).toList();
    }

    @GetMapping("/{id}")
    public KeyboardCatDto getById(@PathVariable Long id) {
        return service.getById(id).map(mapper::toDto).orElse(null);
    }

    @PostMapping
    public KeyboardCatDto create(@RequestBody KeyboardCatDto dto) {
        return mapper.toDto(service.create(mapper.toEntity(dto)));
    }

    @PutMapping("/{id}")
    public KeyboardCatDto update(@PathVariable Long id, @RequestBody KeyboardCatDto dto) {
        return service.update(id, mapper.toEntity(dto)).map(mapper::toDto).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
