package org.withgoing.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.withgoing.movie.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
