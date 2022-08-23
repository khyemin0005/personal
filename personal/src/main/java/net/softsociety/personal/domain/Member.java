package net.softsociety.personal.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {

	String userid;
	String password;
	String name;
	String birth;
	String gender; // String?
	String email;
	String phone;
}
