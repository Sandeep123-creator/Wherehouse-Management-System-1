package com.jsp.whs.service;

import org.springframework.http.ResponseEntity;

import com.jsp.whs.moduls.Wherehouse;
import com.jsp.whs.util.ResponseStructure;

public interface WherehouseService {

	ResponseEntity<ResponseStructure<Wherehouse>> saveWherehouse(Wherehouse wherehouse);
	

}
