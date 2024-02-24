package com.hw15.note.service;

import com.hw15.note.entity.Note;
import com.hw15.note.exception.NoteNotFoundException;

import java.util.List;
import java.util.UUID;

public interface NoteService {
    Note add(Note note);

    List<Note> listAll();

    Note getById(UUID id) throws NoteNotFoundException;

    void deleteById(UUID id) throws NoteNotFoundException;

    void update(Note note) throws NoteNotFoundException;
}
