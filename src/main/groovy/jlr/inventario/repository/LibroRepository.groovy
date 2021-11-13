package jlr.inventario.repository

import jlr.inventario.model.Libro
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface LibroRepository extends CrudRepository<Libro, Long> {

}