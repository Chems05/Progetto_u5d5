package chems.Progetto.services;

import chems.Progetto.entities.Postazione;
import chems.Progetto.repositories.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostazioneService {

    @Autowired
    private PostazioneRepository postazioneRepository;

    public List<Postazione> getAllPostazioni() {
        return postazioneRepository.findAll();
    }

    public Postazione getPostazioneById(Long id) {
        return postazioneRepository.findById(id).orElse(null);
    }

    public List<Postazione> searchPostazioniByTipoAndCitta(String tipo, String citta) {
        return postazioneRepository.findByTipoAndEdificio_Citta(tipo, citta);
    }

    public Postazione savePostazione(Postazione postazione) {
        return postazioneRepository.save(postazione);
    }

    public void deletePostazione(Long id) {
        postazioneRepository.deleteById(id);
    }
}
