package jlr.inventario.repository

import jlr.inventario.model.Autor
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface AutorRepository extends CrudRepository<Autor, Long> {

}