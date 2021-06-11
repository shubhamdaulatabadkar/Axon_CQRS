package org.sgitario.axon.library.events;

import lombok.Data;

@Data
public class LibraryCreatedEvent {
	public LibraryCreatedEvent(Integer libraryId, String name) {
		super();
		this.libraryId = libraryId;
		this.name = name;
	}
	private final Integer libraryId;
	private final String name;
	public Integer getLibraryId() {
		return libraryId;
	}
	public String getName() {
		return name;
	}
}
