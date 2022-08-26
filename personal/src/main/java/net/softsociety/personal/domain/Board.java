package net.softsociety.personal.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Board {

	int boardnum;
	String userid;
	String title;
	String contents;
	String inputdate;
	int hits;
	String originalfile;
	String savedfile;
}
