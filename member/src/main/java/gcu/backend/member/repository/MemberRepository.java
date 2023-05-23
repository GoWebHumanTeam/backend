package gcu.backend.member.repository;

import gcu.backend.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "member", path="member")
public interface MemberRepository extends JpaRepository<Member, Long>, CrudRepository<Member, Long> {
    Member findByNameAndStudentId(String name, int studentId);
}
