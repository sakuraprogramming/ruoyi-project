package com.ruoyi.develop.service;

import java.util.List;
import com.ruoyi.develop.domain.Accounts;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2024-06-11
 */
public interface IAccountsService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param accountId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Accounts selectAccountsByAccountId(Long accountId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param accounts 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Accounts> selectAccountsList(Accounts accounts);

    /**
     * 新增【请填写功能名称】
     * 
     * @param accounts 【请填写功能名称】
     * @return 结果
     */
    public int insertAccounts(Accounts accounts);

    /**
     * 修改【请填写功能名称】
     * 
     * @param accounts 【请填写功能名称】
     * @return 结果
     */
    public int updateAccounts(Accounts accounts);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param accountIds 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteAccountsByAccountIds(String accountIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param accountId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteAccountsByAccountId(Long accountId);
}
