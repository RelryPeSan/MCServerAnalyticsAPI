package me.reratos.mcserveranalyticsapi.service;

import me.reratos.mcserverlogger.model.IdGenericModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public abstract class GenericService<R extends JpaRepository<M, ID>, M extends IdGenericModel, ID> {

    @Autowired
    R repository;

    public Page<M> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public ResponseEntity<M> findById(ID id) {
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    public M save(@RequestBody M genericModel) {
        return (M) repository.save(genericModel);
    }

    public M update(@RequestBody M genericModel) {
        return (M) repository.save(genericModel);
    }

    public void delete(@RequestBody M genericModel) {
        repository.delete(genericModel);
    }
}
