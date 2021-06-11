package org.sgitario.axon.library.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class BookEntity {
	public BookEntity() {
		super();
		this.isbn = isbn;
		this.libraryId = libraryId;
		this.title = title;
	}
	@Id
	private String isbn;
	@Column
	private int libraryId;
	@Column
	private String title;
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getLibraryId() {
		return libraryId;
	}
	public void setLibraryId(int libraryId) {
		this.libraryId = libraryId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
