package com.xworkz.songsapp.dao;

import java.util.List;

import com.xworkz.songsapp.dto.SongsDto;

public interface SongsDao {
	
	
	void saveSongs(SongsDto dto);
	
	public List<SongsDto> getAllSongs();
//	void getAllSongs();

}
