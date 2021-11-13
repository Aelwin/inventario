package jlr.inventario.dto

import groovy.transform.MapConstructor
import jlr.inventario.enumerado.Formato
import jlr.inventario.enumerado.Idioma
import jlr.inventario.model.Autor
import jlr.inventario.model.Libro
import jlr.inventario.model.Prestamo

@MapConstructor(excludes = ['autores', 'prestamos'])
class LibroDTO {

    Long id
    String titulo
    String duenyo
    Date fechaInicioLectura
    Date fechaFinLectura
    String isbn
    String sinopsis
    int valoracion
    String imagen
    String editorial
    Date fechaCompra
    String observaciones
    String categoria
    Formato formato
    Idioma idioma

    List<AutorDTO> autores
    List<Prestamo> prestamos

    static LibroDTO getLibroDTOFromLibro(Libro libro) {
        LibroDTO libroDTO = new LibroDTO(libro.properties)
        libro.autores.each { Autor autor ->
            /*AutorDTO autorDTO = new AutorDTO()
            autorDTO.id = autor.id
            autorDTO.nombre = autor.nombre*/
            AutorDTO autorDTO = new AutorDTO(autor.properties)
            libroDTO.addToAutores(autorDTO)
        }
        libroDTO
    }

    void addToAutores(AutorDTO autor) {
        if (!autores) {
            autores = new ArrayList<>()
        }
        autores << autor
    }
}
