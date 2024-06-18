package com.jsp.whs.serviceImpl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.whs.moduls.Wherehouse;
import com.jsp.whs.service.WherehouseService;
import com.jsp.whs.util.ResponseStructure;

@Service
public class WherehouseImpls implements WherehouseService {

	@Override
	public ResponseEntity<ResponseStructure<Wherehouse>> saveWherehouse(Wherehouse wherehouse) {
		// TODO Auto-generated method stub
		return null;
	}

}
