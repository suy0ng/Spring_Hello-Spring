package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
