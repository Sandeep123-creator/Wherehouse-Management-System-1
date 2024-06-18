package com.jsp.whs.service;

import org.springframework.http.ResponseEntity;

import com.jsp.whs.requestdto.AdminRequest;
import com.jsp.whs.responsedto.AdminResponse;
import com.jsp.whs.util.ResponseStructure;

public interface AdminService {

	ResponseEntity<ResponseStructure<AdminResponse>> saveSuperAdmin(AdminRequest request);

	ResponseEntity<ResponseStructure<AdminResponse>> saveAdmin(AdminRequest request);

}
