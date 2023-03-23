package com.mealmedia.places.entities.left;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mealmedia.places.entities.right.Post;
import com.mealmedia.places.entities.right.User;
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
@Table(name="comments")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","commentLikes"})
public class Comment {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="comment_id")
    private Long commentId;

    @NotNull
    @Column(name="text")
    private String text;

    @NotNull
    @Column(name="creation_date")
    private String creationDate;

    //---------------------------------------------

    @JoinColumn(name="user_id")
    @ManyToOne
    private User user;   //FK

    @JoinColumn(name="post_id")
    @ManyToOne
    private Post post;   //FK

    @JsonIgnore
    @OneToMany(cascade=ALL, mappedBy="comment")
    private List<CommentLike> commentLikes;






















}
