package net.softsociety.personal.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reply {

	int replynum;
	int boardnum;
	String userid;
	String replytext;
	String inputdate;
	
}
