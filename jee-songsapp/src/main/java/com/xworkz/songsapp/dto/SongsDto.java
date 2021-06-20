package com.xworkz.songsapp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "songs_table")
@NamedQueries ({ @NamedQuery(name = "getAllRecord", query = "from SongsDto") })
public class SongsDto implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "S_ID")
	private int id;
	@NonNull
	@Column(name = "S_NAME")
	private String songsName;
	@NonNull
	@Column(name = "S_FEATURING")
	private String featuring;
	@NonNull
	@Column(name = "S_SINGER")
	private String singer;
	@NonNull
	@Column(name = "S_DURATION")
	private String duration;
	@NonNull
	@Column(name = "S_LANGUAGE")
	private String language;
	@NonNull
	@Column(name = "S_LYRICIST")
	private String lyricist;

	@NonNull
	public SongsDto() {

		System.out.println("Object Created --> " + getClass().getSimpleName());
	}

}
