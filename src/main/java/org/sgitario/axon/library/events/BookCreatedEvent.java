package org.sgitario.axon.library.events;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import lombok.Data;

@Data
public class BookCreatedEvent {
	public BookCreatedEvent(Integer libraryId, String isbn, String title) {
		super();
		this.libraryId = libraryId;
		this.isbn = isbn;
		this.title = title;
	}
	@TargetAggregateIdentifier
	private final Integer libraryId;
	private final String isbn;
	private final String title;
	public Integer getLibraryId() {
		return libraryId;
	}
	public String getIsbn() {
		return isbn;
	}
	public String getTitle() {
		return title;
	}
}
