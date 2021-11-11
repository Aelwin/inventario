package jlr.inventario.service

import jlr.inventario.model.Libro
import jlr.inventario.repository.LibroRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LibroService implements LibroRepository {

    @Autowired
    LibroRepository libroRepository

    @Override
    <S extends Libro> S save(S entity) {
        libroRepository.save(entity)
    }

    @Override
    <S extends Libro> Iterable<S> saveAll(Iterable<S> entities) {
        libroRepository.saveAll(entities)
    }

    @Override
    Optional<Libro> findById(Long aLong) {
        libroRepository.findById(aLong)
    }

    @Override
    boolean existsById(Long aLong) {
        libroRepository.existsById(aLong)
    }

    @Override
    Iterable<Libro> findAll() {
        libroRepository.findAll()
    }

    @Override
    Iterable<Libro> findAllById(Iterable<Long> longs) {
        libroRepository.findAllById(longs)
    }

    @Override
    long count() {
        libroRepository.count()
    }

    @Override
    void deleteById(Long aLong) {
        libroRepository.deleteById(aLong)
    }

    @Override
    void delete(Libro entity) {
        libroRepository.delete(entity)
    }

    @Override
    void deleteAllById(Iterable<? extends Long> longs) {
        libroRepository.deleteAllById(longs)
    }

    @Override
    void deleteAll(Iterable<? extends Libro> entities) {
        libroRepository.deleteAll(entities)
    }

    @Override
    void deleteAll() {
        libroRepository.deleteAll()
    }
}
