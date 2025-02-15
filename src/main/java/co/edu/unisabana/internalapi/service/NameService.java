package co.edu.unisabana.internalapi.service;

import co.edu.unisabana.internalapi.entity.Name;
import co.edu.unisabana.internalapi.repository.NameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NameService {
    private final NameRepository nameRepository;

    public List<Name> getAllNames() { return nameRepository.findAll(); }

    public Name saveName(Name name) {
        return nameRepository.save(name);
    }
}
