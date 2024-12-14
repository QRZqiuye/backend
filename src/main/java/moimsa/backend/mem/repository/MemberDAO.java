package moimsa.backend.mem.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import moimsa.backend.mem.model.MemberVO;

@Mapper
public interface MemberDAO {

	List<MemberVO> getAllMembers();
}
