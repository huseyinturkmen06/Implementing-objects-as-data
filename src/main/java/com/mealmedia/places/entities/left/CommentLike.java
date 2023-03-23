package com.mealmedia.places.entities.left;


import com.mealmedia.places.entities.right.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="comment_likes")
public class CommentLike {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="comment_like_id")
    private Long commentLikeId;

    //---------------------------
    @JoinColumn(name="user_id")
    @ManyToOne
    private User user;   //FK

    @JoinColumn(name="comment_id")
    @ManyToOne
    private Comment comment;   //FK



















}
