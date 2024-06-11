package com.ruoyi.develop.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.develop.mapper.AccountsMapper;
import com.ruoyi.develop.domain.Accounts;
import com.ruoyi.develop.service.IAccountsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-06-11
 */
@Service
public class AccountsServiceImpl implements IAccountsService 
{
    @Autowired
    private AccountsMapper accountsMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param accountId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Accounts selectAccountsByAccountId(Long accountId)
    {
        return accountsMapper.selectAccountsByAccountId(accountId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param accounts 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Accounts> selectAccountsList(Accounts accounts)
    {
        return accountsMapper.selectAccountsList(accounts);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param accounts 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertAccounts(Accounts accounts)
    {
        accounts.setCreateTime(DateUtils.getNowDate());
        return accountsMapper.insertAccounts(accounts);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param accounts 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateAccounts(Accounts accounts)
    {
        accounts.setUpdateTime(DateUtils.getNowDate());
        return accountsMapper.updateAccounts(accounts);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param accountIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteAccountsByAccountIds(String accountIds)
    {
        return accountsMapper.deleteAccountsByAccountIds(Convert.toStrArray(accountIds));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param accountId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteAccountsByAccountId(Long accountId)
    {
        return accountsMapper.deleteAccountsByAccountId(accountId);
    }
}
