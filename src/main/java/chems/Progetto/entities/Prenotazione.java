package chems.Progetto.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "prenotazioni")
@Getter
@Setter
@NoArgsConstructor
public class Prenotazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "utente_id", referencedColumnName = "id")
    private Utente utente;

    @ManyToOne
    @JoinColumn(name = "postazione_id", referencedColumnName = "id")
    private Postazione postazione;

    private LocalDate dataPrenotazione;

    // Controllo per non permettere doppie prenotazioni nella stessa data
}
