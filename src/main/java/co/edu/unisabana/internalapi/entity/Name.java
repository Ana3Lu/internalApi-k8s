package co.edu.unisabana.internalapi.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "nombres") // Asegurar que coincida con PostgreSQL
@Getter
@Setter
@NoArgsConstructor
public class Name {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre") // Asegurar que coincida con PostgreSQL
    private String value;
}
