package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired //memberService를 스프링 컨테이너와 연결시켜준다
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
