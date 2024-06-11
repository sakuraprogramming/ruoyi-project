package com.ruoyi.web.controller.develop;

import java.util.List;

import com.ruoyi.develop.domain.Accounts;
import com.ruoyi.develop.service.IAccountsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2024-06-11
 */
@Api("账号管理")
@Controller
@RequestMapping("/develop/accounts")
public class AccountsController extends BaseController {
    private String prefix = "develop/accounts";

    @Autowired
    private IAccountsService accountsService;

    @RequiresPermissions("develop:accounts:view")
    @GetMapping()
    public String accounts() {
        return prefix + "/accounts";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("develop:accounts:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Accounts accounts) {
        startPage();
        List<Accounts> list = accountsService.selectAccountsList(accounts);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("develop:accounts:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Accounts accounts) {
        List<Accounts> list = accountsService.selectAccountsList(accounts);
        ExcelUtil<Accounts> util = new ExcelUtil<Accounts>(Accounts.class);
        return util.exportExcel(list, "【请填写功能名称】数据");
    }

    /**
     * 新增【请填写功能名称】
     */
    @ApiOperation("新增账号")
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存【请填写功能名称】
     */
    @RequiresPermissions("develop:accounts:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Accounts accounts) {
        return toAjax(accountsService.insertAccounts(accounts));
    }

    /**
     * 修改【请填写功能名称】
     */
    @RequiresPermissions("develop:accounts:edit")
    @GetMapping("/edit/{accountId}")
    public String edit(@PathVariable("accountId") Long accountId, ModelMap mmap) {
        Accounts accounts = accountsService.selectAccountsByAccountId(accountId);
        mmap.put("accounts", accounts);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("develop:accounts:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Accounts accounts) {
        return toAjax(accountsService.updateAccounts(accounts));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("develop:accounts:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(accountsService.deleteAccountsByAccountIds(ids));
    }
}
