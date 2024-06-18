package com.jsp.whs.responsedto;

import java.util.List;

import com.jsp.whs.enums.AdminType;
import com.jsp.whs.enums.Privilege;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdminResponse {
	
	private int adminId;
	private String name;
	private String email;
	AdminType  adminType;	
	List<Privilege> privileges;

}
