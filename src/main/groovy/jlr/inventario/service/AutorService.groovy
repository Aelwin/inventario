package jlr.inventario.service

import jlr.inventario.model.Autor
import jlr.inventario.repository.AutorRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AutorService implements AutorRepository {

    @Autowired
    AutorRepository autorRepository


    @Override
    <S extends Autor> S save(S entity) {
        autorRepository.save(entity)
    }

    @Override
    <S extends Autor> Iterable<S> saveAll(Iterable<S> entities) {
        autorRepository.saveAll(entities)
    }

    @Override
    Optional<Autor> findById(Long aLong) {
        autorRepository.findById(aLong)
    }

    @Override
    boolean existsById(Long aLong) {
        autorRepository.existsById(aLong)
    }

    @Override
    Iterable<Autor> findAll() {
        autorRepository.findAll()
    }

    @Override
    Iterable<Autor> findAllById(Iterable<Long> longs) {
        autorRepository.findAllById(longs)
    }

    @Override
    long count() {
        autorRepository.count()
    }

    @Override
    void deleteById(Long aLong) {
        autorRepository.deleteById(aLong)
    }

    @Override
    void delete(Autor entity) {
        autorRepository.delete(entity)
    }

    @Override
    void deleteAllById(Iterable<? extends Long> longs) {
        autorRepository.deleteAllById(longs)
    }

    @Override
    void deleteAll(Iterable<? extends Autor> entities) {
        autorRepository.deleteAll(entities)
    }

    @Override
    void deleteAll() {
        autorRepository.deleteAll()
    }
}
