package com.mealmedia.places.entities.right;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="Notes")

public class Note {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="note_id")
    private Long noteId;

    @Column(name="note_title")
    private String noteTitle;

    @Column(name="note_text")
    private String noteText;

    @Column(name="note_update_date")
    private String noteUpdateDate;

    @Column(name="note_creation_date")
    private String noteCreationDate;

//----------------------------------------------------------------


    @JoinColumn(name="user_id")
    @ManyToOne
    private User user;   //FK

    @JoinColumn(name="place_id")
    @ManyToOne
    private Place place;   //FK













}
