package moimsa.backend.mem;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import moimsa.backend.common.CommonJson;
import moimsa.backend.mem.model.MemberVO;
import moimsa.backend.mem.service.MemberService;

@RestController
@RequestMapping("/member")
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberService memberService;

	@GetMapping("/getAllMembers")
	public CommonJson<List<MemberVO>> getAllMembers() {
		logger.info("#########Start getAllMembers#########");
		List<MemberVO> members = memberService.getAllMembers();
		CommonJson<List<MemberVO>> response = new CommonJson<>(members);
		logger.info("#########response######### {}", response);
		
		
		logger.info("#########End getAllMembers#########");
		return response;
	}
}
