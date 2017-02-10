package springMybatis.service;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import springMybatis.mapper.AccountMapper;
import springMybatis.vo.Account;
 
@Service("accountService")
public class AccountServiceImpl implements IAccountService {  
	@Resource
    private AccountMapper accountMapper;  
    /** 
     * 根据ID获得USER信息 
     */  
	@Override
    public Account findById(int id) {  
        return accountMapper.findById(id);  
    }  
    
    @Override
    public Account findByName(String name) {
    	return accountMapper.findByName(name);
    }
  
}