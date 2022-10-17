package com.ridho.chat.chatapps.repositories;

import com.ridho.chat.chatapps.entities.Pengguna;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PenggunaRepository extends JpaRepository<Pengguna, String> {
    Optional<Pengguna> findByUsername(String username);
}
