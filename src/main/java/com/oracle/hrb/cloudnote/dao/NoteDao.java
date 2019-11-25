package com.oracle.hrb.cloudnote.dao;

import com.oracle.hrb.cloudnote.entity.Note;

import java.util.List;

public interface NoteDao {
	void add(Note note);
	void upddate(Note note);
	void delete(String id);
	void move(String noteId, String notebookId);
	List<Note> findByNotebookId(String id);
}
