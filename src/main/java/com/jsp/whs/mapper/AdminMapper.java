package com.jsp.whs.mapper;

import org.springframework.stereotype.Component;

import com.jsp.whs.moduls.Admin;
import com.jsp.whs.requestdto.AdminRequest;
import com.jsp.whs.responsedto.AdminResponse;
@Component
public class AdminMapper {
	
	public Admin mapToAdminRequest(AdminRequest adminRequest,Admin admin) {
		admin.setAdminName(adminRequest.getName());
		admin.setAdminEmail(adminRequest.getEmail());
		admin.setAdminPassword(adminRequest.getPassword());
	
		return admin;
	}
	
	public AdminResponse mapToAdminResponse(Admin admin) {
		return AdminResponse.builder()
				.adminId(admin.getAdminId())
				.email(admin.getAdminEmail())
				.name(admin.getAdminName())
				.adminType(admin.getAdminType())
				.build();
	}

}
