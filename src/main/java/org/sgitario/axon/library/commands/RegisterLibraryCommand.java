package org.sgitario.axon.library.commands;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import lombok.Data;

@Data
public class RegisterLibraryCommand {
	public RegisterLibraryCommand(Integer libraryId, String name) {
		super();
		this.libraryId = libraryId;
		this.name = name;
	}

	@TargetAggregateIdentifier
	private final Integer libraryId;

	private final String name;

	public Integer getLibraryId() {
		return libraryId;
	}

	public String getName() {
		return name;
	}
}
