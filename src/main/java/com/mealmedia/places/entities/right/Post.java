package com.mealmedia.places.entities.right;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mealmedia.places.entities.left.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

import static javax.persistence.CascadeType.ALL;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="Post")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","awardsOfPost","comments","postLikes",
        "savedPosts","reports"})
public class Post {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="post_id")
    private Long postId;

    @NotNull
    @Column(name="text")
    private String text;

    @NotNull
    @Column(name="title")
    private String title;

    @NotNull
    @Column(name="creation_date")
    private String creationDate;
    //its gonna be changed with java.time



    //-----------------------------------------


    @JoinColumn(name="user_id")
    @ManyToOne
    private User user;   //FK

    @JoinColumn(name="place_id")
    @ManyToOne
    private Place place;   //FK

    @JsonIgnore
    @OneToMany(cascade=ALL, mappedBy="post")
    private List<Report> reports;

    @JsonIgnore
    @OneToMany(cascade=ALL, mappedBy="post")
    private List<SavedPost> savedPosts;

    @JsonIgnore
    @OneToMany(cascade=ALL, mappedBy="post")
    private List<PostLike> postLikes;

    @JsonIgnore
    @OneToMany(cascade=ALL, mappedBy="post")
    private List<Comment> comments;






}
