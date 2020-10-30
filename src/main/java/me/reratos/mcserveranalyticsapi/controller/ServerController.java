package me.reratos.mcserveranalyticsapi.controller;

import io.swagger.annotations.Api;
import me.reratos.mcserveranalyticsapi.repository.ServerRepository;
import me.reratos.mcserverlogger.model.ServerModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/server")
public class ServerController extends GenericController<ServerRepository, ServerModel, Long> {

//    @Autowired
//    ServerRepository serverRepository;
//
//    @GetMapping
//    @ApiOperation(value = "Retorna uma lista de servidores")
//    public List<ServerModel> listServers() {
//        return serverRepository.findAll();
//    }
//
//    @GetMapping("/{id}")
//    @ApiOperation(value = "Retorna um servidor pelo id")
//    public ResponseEntity<ServerModel> findServerById(@PathVariable(name = "id") Long id) {
//        Optional<ServerModel> serverModel = serverRepository.findById(id);
//
//        if(!serverModel.isPresent()) {
//            return ResponseEntity.notFound().build();
//        }
//
//        return ResponseEntity.ok(serverModel.get());
//    }
//
//    @PostMapping
//    @ApiOperation(value = "Cria um novo servidor")
//    public ServerModel saveServer(@RequestBody ServerModel serverModel) {
//        return serverRepository.save(serverModel);
//    }


//    @PutMapping
//    @ApiOperation(value = "Atualiza um servidor")
//    public ServerModel updateServer(@RequestBody ServerModel serverModel) {
//        return serverRepository.save(serverModel);
//    }
//
//    @DeleteMapping
//    @ApiOperation(value = "Deleta um servidor")
//    public void deleteServer(@RequestBody ServerModel serverModel) {
//        serverRepository.delete(serverModel);
//    }
}
