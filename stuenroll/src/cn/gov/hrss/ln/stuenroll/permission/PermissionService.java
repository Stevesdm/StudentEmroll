package cn.gov.hrss.ln.stuenroll.permission;

import java.util.List;

import com.jfinal.plugin.activerecord.Record;

import cn.gov.hrss.ln.stuenroll.db.I_PermissionDao;


/**
 * 权限模块业务类
 * 
 * @author Administrator
 *
 */
public class PermissionService implements I_PermissionService{

	private I_PermissionDao i_PermissionDao;
	@Override
	public List<Record> searchPermission(String username) {
		List<Record> list = i_PermissionDao.searchPermission(username);
		return list;
	}
	public I_PermissionDao getI_PermissionDao() {
		return i_PermissionDao;
	}
	public void setI_PermissionDao(I_PermissionDao i_PermissionDao) {
		this.i_PermissionDao = i_PermissionDao;
	}
	@Override
	public List<Record> searchAllPermissions() {
		List<Record> list = i_PermissionDao.searchAllPermissions();
		return list;
	}
	
	

}
