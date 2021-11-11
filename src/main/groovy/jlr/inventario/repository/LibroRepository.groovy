package jlr.inventario.repository

import jlr.inventario.model.Libro
import org.springframework.data.repository.CrudRepository

interface LibroRepository extends CrudRepository<Libro, Long> {

}