package me.reratos.mcserveranalyticsapi.controller;

import me.reratos.mcserveranalyticsapi.repository.PlayerRepository;
import me.reratos.mcserverlogger.model.PlayerModel;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/player")
public class PlayerController extends GenericController<PlayerRepository, PlayerModel, Long> {

    @PostMapping("/search")
    public ResponseEntity<Page<PlayerModel>> search(@RequestBody PlayerModel playerModel,
                                                            Pageable pageable) {
        Example<PlayerModel> example = null;

        example = Example.of(playerModel);

        return ResponseEntity.ok().body(service.findAll(example, pageable));
    }

}
