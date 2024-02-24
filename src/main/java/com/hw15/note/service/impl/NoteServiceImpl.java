package com.hw15.note.service.impl;

import com.hw15.note.entity.Note;
import com.hw15.note.exception.NoteNotFoundException;
import com.hw15.note.service.NoteFakeRepository;
import com.hw15.note.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class NoteServiceImpl implements NoteService {

    private NoteFakeRepository noteRepository;
    @Autowired
    public NoteServiceImpl(NoteFakeRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public Note add(Note note) {
        return noteRepository.add(note);
    }

    @Override
    public List<Note> listAll() {
        return noteRepository.listAll();
    }

    @Override
    public Note getById(UUID id) throws NoteNotFoundException {
        return noteRepository.getById(id);
    }

    @Override
    public void deleteById(UUID id) throws NoteNotFoundException {
        noteRepository.deleteById(id);
    }

    @Override
    public void update(Note note) throws NoteNotFoundException{
        noteRepository.update(note);
    }
}
