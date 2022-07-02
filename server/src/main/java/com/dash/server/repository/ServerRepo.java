package com.dash.server.repository;

import com.dash.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<Server, Long> {
    Server findByIpAddress(String idAddress);
    Server findByName(String name);
}
