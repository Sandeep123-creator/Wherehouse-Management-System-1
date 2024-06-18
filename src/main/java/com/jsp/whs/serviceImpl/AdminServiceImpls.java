package com.jsp.whs.serviceImpl;

import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.whs.enums.AdminType;
import com.jsp.whs.exception.IllegalOperationException;
import com.jsp.whs.mapper.AdminMapper;
import com.jsp.whs.moduls.Admin;
import com.jsp.whs.repository.AdminRepository;
import com.jsp.whs.requestdto.AdminRequest;
import com.jsp.whs.responsedto.AdminResponse;
import com.jsp.whs.service.AdminService;
import com.jsp.whs.util.ResponseStructure;
@Service
public class AdminServiceImpls implements AdminService{
	@Autowired
	private AdminRepository repository;

	@Autowired
	private AdminMapper mapper;

	@Override
	public ResponseEntity<ResponseStructure<AdminResponse>> saveSuperAdmin(AdminRequest request) {

		if(repository.existsByAdminType(AdminType.SUPER_ADMIN)) 
			throw new IllegalOperationException("Super admin already exists");

		Admin admin = mapper.mapToAdminRequest(request, new Admin());
		admin.setAdminType(AdminType.SUPER_ADMIN);
		admin=repository.save(admin);

		return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseStructure<AdminResponse>()
				.setStatus(HttpStatus.CREATED.value())
				.setMessage("Admin Created")
				.setBody(mapper.mapToAdminResponse(admin)));
	}

	@Override
	public ResponseEntity<ResponseStructure<AdminResponse>> saveAdmin(AdminRequest request) {
		Admin admin = repository.save(mapper.mapToAdminRequest(request, new Admin()));	

		return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseStructure<AdminResponse>()
				.setStatus(HttpStatus.CREATED.value())
				.setMessage("Super Admin created")
				.setBody(mapper.mapToAdminResponse(admin)));

	}
}

