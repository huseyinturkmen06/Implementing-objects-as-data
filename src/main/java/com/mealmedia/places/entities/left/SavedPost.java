package com.mealmedia.places.entities.left;


import com.mealmedia.places.entities.right.Post;
import com.mealmedia.places.entities.right.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="saved_posts")
public class SavedPost {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="saved_post_id")
    private Long savedPostId;

    //------------------------------
    @JoinColumn(name="user_id")
    @ManyToOne
    private User user;   //FK

    @JoinColumn(name="post_id")
    @ManyToOne
    private Post post;   //FK

















}
