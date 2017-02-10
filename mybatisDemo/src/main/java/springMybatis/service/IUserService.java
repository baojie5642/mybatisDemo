package springMybatis.service;
  
import springMybatis.vo.User;
  
public interface IUserService {  
    /** 
     * 根据ID获得User信息 
     * @param id 
     * @return 
     */  
    public User findById(int id);  
    
    public User findByName(String name);
  
}