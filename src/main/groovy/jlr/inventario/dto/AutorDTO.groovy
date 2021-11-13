package jlr.inventario.dto

import groovy.transform.MapConstructor
import jlr.inventario.model.Autor
import jlr.inventario.model.Libro

@MapConstructor(excludes = 'libros')
class AutorDTO {

    Long id
    String nombre

    List<LibroDTO> libros

    static AutorDTO getAutorDTOFromAutor(Autor autor) {
        AutorDTO autorDTO = new AutorDTO(autor.properties)
        autor.libros.each { Libro libro ->
            LibroDTO libroDTO = new LibroDTO(libro.properties)
            autorDTO.addToLibros(libroDTO)
        }
        autorDTO
    }

    void addToLibros(LibroDTO libroDTO) {
        if (!libros) {
            libros = new ArrayList<>()
        }
        libros << libroDTO
    }

}
