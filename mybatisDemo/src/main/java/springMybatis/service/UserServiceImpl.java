package springMybatis.service;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import springMybatis.mapper.UserMapper;
import springMybatis.vo.User;
 
@Service("userService")
public class UserServiceImpl implements IUserService {  
	@Resource
    private UserMapper userMapper;  
    /** 
     * 根据ID获得USER信息 
     */  
	@Override
    public User findById(int id) {  
        return userMapper.findById(id);  
    }  
    
    @Override
    public User findByName(String name) {
    	return userMapper.findByName(name);
    }
  
}