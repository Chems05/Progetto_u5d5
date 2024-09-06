package chems.Progetto.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "postazioni")
@Getter
@Setter
@NoArgsConstructor
public class Postazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codiceUnivoco;
    private String descrizione;
    private String tipo; // PRIVATO, OPENSPACE, SALA RIUNIONI
    private int numeroMaxOccupanti;

    @ManyToOne //relazione many to one
    @JoinColumn(name = "edificio_id", referencedColumnName = "id")
    private Edificio edificio;
}