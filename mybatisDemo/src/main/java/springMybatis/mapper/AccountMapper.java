package springMybatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import springMybatis.vo.Account;

public interface AccountMapper {
	@Select("SELECT * FROM account WHERE id = #{id}")
	public Account findById(@Param("id")int id);
	
	@Select("SELECT * FROM account WHERE username = #{username}")
	public Account findByName(@Param("username")String accountName);

}
