package me.reratos.mcserveranalyticsapi.repository;

import me.reratos.mcserverlogger.model.ServerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepository extends JpaRepository<ServerModel, Long> {
}
