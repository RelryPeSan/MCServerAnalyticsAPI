package me.reratos.mcserveranalyticsapi.controller;

import io.swagger.annotations.ApiOperation;
import me.reratos.mcserverlogger.model.IdGenericModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

public abstract class GenericController<R extends JpaRepository<M, ID>, M extends IdGenericModel, ID> {

    @Autowired
    R service;

    @GetMapping
    @ApiOperation(value = "Retorna uma lista de entidades")
    public ResponseEntity<Page<M>> listAll(Pageable pageable) {
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll(pageable));
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Retorna uma entidade pelo id")
    public ResponseEntity<M> findById(@PathVariable(value = "id") ID id) {
        Optional<M> m = service.findById(id);

        return m.map(value -> ResponseEntity.status(HttpStatus.OK).body(value))
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PostMapping
    @ApiOperation(value = "Cria uma nova entidade")
    public ResponseEntity<M> save(@RequestBody M genericModel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(genericModel));
    }

    @PutMapping
    @ApiOperation(value = "Atualiza uma entidade")
    public ResponseEntity<M> update(@RequestBody M genericModel) {
        ResponseEntity<M> m = findById((ID) genericModel.getId());

        if(m.getStatusCode().is2xxSuccessful()) {

        }

        return ResponseEntity.status(HttpStatus.OK).body(service.save(genericModel));
    }

    @DeleteMapping
    @ApiOperation(value = "Deleta uma entidade")
    public ResponseEntity delete(@RequestBody M genericModel) {
        service.delete(genericModel);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
