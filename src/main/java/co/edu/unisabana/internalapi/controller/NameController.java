package co.edu.unisabana.internalapi.controller;

import co.edu.unisabana.internalapi.entity.Name;
import co.edu.unisabana.internalapi.service.NameService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/internal/names")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class NameController {

    private final NameService nameService;

    @GetMapping
    public List<Name> getNames() {
        return nameService.getAllNames();
    }

    @PostMapping
    public Name saveName(@RequestBody Name name) {
        return nameService.saveName(name);
    }
}
