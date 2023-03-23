package com.mealmedia.places.entities.left;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mealmedia.places.entities.right.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="Polls")
public class Poll {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="poll_id")
    private Long pollId;

    @Column(name="title")
    private String title;

    @Column(name="text")
    private String text;

    @NotNull
    @Column(name="option_one")
    private String optionOne;

    @NotNull
    @Column(name="option_two")
    private String optionTwo;

    @NotNull
    @Column(name="option_three")
    private String optionThree;

    //nulable
    @Column(name="option_four")
    private String optionFour;

    //nulable
    @Column(name="option_five")
    private String optionFive;


    @NotNull
    @Column(name="creation_date")
    private String creationDate;


    //----------------------------------------------

    @JoinColumn(name="user_id")
    @ManyToOne
    private User user;    //FK







}
