package springMybatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import springMybatis.vo.User;

public interface UserMapper {
	@Select("SELECT * FROM user WHERE userid = #{userId}")
	public User findById(@Param("userId")int userId);
	
	@Select("SELECT * FROM user WHERE username=#{username}")
	public User findByName(@Param("username")String name);

}
