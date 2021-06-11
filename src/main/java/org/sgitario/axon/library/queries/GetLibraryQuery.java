package org.sgitario.axon.library.queries;

import lombok.Data;

@Data
public class GetLibraryQuery {
	public GetLibraryQuery(Integer libraryId) {
		super();
		this.libraryId = libraryId;
	}

	private final Integer libraryId;

	public Integer getLibraryId() {
		return libraryId;
	}
}
