package jlr.inventario.model

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToMany

@Entity
class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id
    @Column(nullable = false, unique = true)
    String nombre

    @ManyToMany(mappedBy = "autores", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    List<Libro> libros
}
