package me.reratos.mcserveranalyticsapi.repository;

import me.reratos.mcserverlogger.model.PlayerModel;
import me.reratos.mcserverlogger.model.ServerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlayerRepository extends JpaRepository<PlayerModel, Long> {

//    @Query("SELECT * FROM player p INNER JOIN server s ON s.id = p.fke_server WHERE s.id = :server_id")
//    public List<PlayerModel> findByServerId(@Param("server_id") Long id);
}
