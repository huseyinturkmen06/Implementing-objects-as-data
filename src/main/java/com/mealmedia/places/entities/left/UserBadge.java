package com.mealmedia.places.entities.left;



import com.mealmedia.places.entities.right.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="UserBadges")
public class UserBadge {



    @Id
    @GeneratedValue
    @Column(name="user_badge_id")
    private Long userBadgeId;

    //--------------
    @NotNull
    @JoinColumn(name="user_id")
    @ManyToOne
    private User user;   //FK

    @NotNull
    @JoinColumn(name="badge_id")
    @ManyToOne
    private Badge badge;   //FK



    













}
