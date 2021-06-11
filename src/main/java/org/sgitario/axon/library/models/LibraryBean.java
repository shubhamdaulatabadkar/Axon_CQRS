package org.sgitario.axon.library.models;

import lombok.Data;

@Data
public class LibraryBean {
	private int libraryId;
	private String name;
	public int getLibraryId() {
		return libraryId;
	}
	public void setLibraryId(int libraryId) {
		this.libraryId = libraryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
