package com.mealmedia.places.entities.right;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="Follow")
public class Follow {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="follow_id")
    private Long followId;

    @JoinColumn(name="follower_id")
    @ManyToOne
    private User follower_user;

    @JoinColumn(name="following_id")
    @ManyToOne
    private User following_user;


}
