package com.hw15.note.entity;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;
@Data
@Builder
public class Note {
    private UUID id;
    private String title;
    private String content;
}
