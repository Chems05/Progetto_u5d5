package chems.Progetto.repositories;

import chems.Progetto.entities.Prenotazione;
import chems.Progetto.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
    List<Prenotazione> findByUtenteAndDataPrenotazione(Utente utente, LocalDate dataPrenotazione);
}
