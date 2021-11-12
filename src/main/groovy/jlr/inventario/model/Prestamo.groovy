package jlr.inventario.model

import jlr.inventario.enumerado.SiNo

import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id
    String nombre
    Date fecha
    @Enumerated(EnumType.STRING)
    SiNo devuelto
}
