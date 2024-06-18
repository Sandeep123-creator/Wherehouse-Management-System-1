package com.jsp.whs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.whs.enums.AdminType;
import com.jsp.whs.moduls.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{

	boolean existsByAdminType(AdminType superAdmin);

}
