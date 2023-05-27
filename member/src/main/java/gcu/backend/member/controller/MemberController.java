package gcu.backend.member.controller;

import gcu.backend.member.domain.Member;
import gcu.backend.member.repository.MemberRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@CrossOrigin("http://localhost:3000")
@RestController
public class MemberController {
    private final MemberRepository memberRepository;

    public MemberController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @GetMapping("/api/member/{id}")
    public Optional<Member> getMemberById(@PathVariable("id") Long id) {
        return memberRepository.findById(id);
    }

    @RequestMapping(value = "/api/login", method = RequestMethod.POST)
    public Long checkMemberExists(@RequestBody Member member) {
        Member existingMember = memberRepository.findByStudentid(
                member.getStudentid()
        );
        System.out.println(existingMember);
        if (existingMember != null) {
            return existingMember.getId();
        } else {
            Member savedMember = memberRepository.save(member);
            return savedMember.getId();
        }
    }
}
