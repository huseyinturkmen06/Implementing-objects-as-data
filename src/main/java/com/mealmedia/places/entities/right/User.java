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

//@JsonIgnoreProperties
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="users")
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler","notes","awards",
//"comments","commentLikes","postLikes","savedPosts","reports","userBadges","pollVotes","followings","followers","activeBooks"})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_id")
    private Long userId;

    @NotNull
    @Column(name="picture_url")
    private String pictureUrl;

    @NotNull
    @Column(name="profile_name")
    private String profileName;

    @NotNull
    @Column(name="e_mail")
    private String email;

    @NotNull
    @Column(name="password")
    private String password;

    @NotNull
    @Column(name="name")
    private String name;

    @NotNull
    @Column(name="surname")
    private String surname;

    @NotNull
    @Column(name="follower_count")
    private int followerCount;

    @NotNull
    @Column(name="following_count")
    private int followingCount;



///////////////////////////////////////////////////////////

    @JsonIgnore
    @OneToMany(cascade=ALL,mappedBy = "user" )
    private List<Note> notes;   //FK

    @JsonIgnore
    @OneToMany(cascade=ALL,mappedBy = "follower_user")
    private List<Follow> followers;

    @JsonIgnore
    @OneToMany(cascade=ALL,mappedBy = "following_user")
    private List<Follow> followings;

    @JsonIgnore
    @OneToMany(cascade=ALL,mappedBy = "user")
    private List<Post> posts;


    @JsonIgnore
    @OneToMany(cascade=ALL,mappedBy = "user")
    private List<Poll> polls;

    @JsonIgnore
    @OneToMany(cascade=ALL,mappedBy = "user")
    private List<UserBadge> userBadges;

    @JsonIgnore
    @OneToMany(cascade=ALL,mappedBy = "user")
    private List<Report> reports;

    @JsonIgnore
    @OneToMany(cascade=ALL,mappedBy = "user")
    private List<SavedPost> savedPosts;

    @JsonIgnore
    @OneToMany(cascade=ALL,mappedBy = "user")
    private List<PostLike> postLikes;

    @JsonIgnore
    @OneToMany(cascade=ALL,mappedBy = "user")
    private List<CommentLike> commentLikes;

    @JsonIgnore
    @OneToMany(cascade=ALL,mappedBy = "user")
    private List<Comment> comments;













}
