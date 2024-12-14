package moimsa.backend.mem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import moimsa.backend.mem.model.MemberVO;
import moimsa.backend.mem.repository.MemberDAO;
import moimsa.backend.mem.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAO memberDAO;
	
	@Override
	public List<MemberVO> getAllMembers() {
        return memberDAO.getAllMembers();
    }
}
