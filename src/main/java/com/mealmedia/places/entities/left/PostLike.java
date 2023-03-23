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
@Table(name="post_likes")
public class PostLike {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="post_like")
    private Long postLike;

    //----------------------------
    @JoinColumn(name="post_id")
    @ManyToOne
    private Post post;   //FK

    @JoinColumn(name="user_id")
    @ManyToOne
    private User user;   //FK



















}
