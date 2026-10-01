package com.github.r_sneto.NoticeBoard.repository;

import com.github.r_sneto.NoticeBoard.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
