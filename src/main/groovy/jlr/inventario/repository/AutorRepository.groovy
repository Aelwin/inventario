package jlr.inventario.repository

import jlr.inventario.model.Autor
import org.springframework.data.repository.CrudRepository

interface AutorRepository extends CrudRepository<Autor, Long> {

}