package me.reratos.mcserveranalyticsapi.service;

import me.reratos.mcserveranalyticsapi.repository.ServerRepository;
import me.reratos.mcserverlogger.model.ServerModel;
import org.springframework.stereotype.Service;

@Service
public class ServerService extends GenericService<ServerRepository, ServerModel, Long>{
}
