package jlr.inventario.model

import jlr.inventario.enumerado.Formato
import jlr.inventario.enumerado.Idioma

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Enumerated
import javax.persistence.EnumType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.JoinTable
import javax.persistence.ManyToMany
import javax.persistence.OneToMany
import javax.persistence.CascadeType
import javax.persistence.FetchType


@Entity
class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id
    @Column(nullable = false)
    String titulo
    @Column(nullable = false)
    String duenyo
    Date fechaInicioLectura
    Date fechaFinLectura
    String isbn
    String sinopsis
    @Column(precision = 1, scale = 0)
    int valoracion
    String imagen
    String editorial
    Date fechaCompra
    String observaciones
    String categoria
    @Enumerated(EnumType.STRING)
    Formato formato
    @Enumerated(EnumType.STRING)
    Idioma idioma

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "libro_autor",
            joinColumns = @JoinColumn(name = "libro_id"),
            inverseJoinColumns = @JoinColumn(name = "autor_id"))
    List<Autor> autores

    @OneToMany(targetEntity = Prestamo.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    List<Prestamo> prestamos

    void addToAutores(Autor autor) {
        if (!autores) {
            autores = new ArrayList<>()
        }
        autores << autor
    }

    @Override
    String toString() {
        "Libro[id: ${id}, titulo: ${titulo}, autor: ${autores[0].nombre}]"
    }
}
