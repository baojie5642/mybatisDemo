package springMybatis.service;
  
import springMybatis.vo.Account;
  
public interface IAccountService {  
    /** 
     * 根据ID获得User信息 
     * @param id 
     * @return 
     */  
    public Account findById(int id);  
    
    public Account findByName(String name);
  
}