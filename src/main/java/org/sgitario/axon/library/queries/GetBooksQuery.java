package org.sgitario.axon.library.queries;

import lombok.Data;

@Data
public class GetBooksQuery {
	public GetBooksQuery(Integer libraryId) {
		super();
		this.libraryId = libraryId;
	}

	private final Integer libraryId;

	public Integer getLibraryId() {
		return libraryId;
	}
}
