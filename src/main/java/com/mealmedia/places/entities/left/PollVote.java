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
@Table(name="PollVotes")
public class PollVote {



    @Id
    @GeneratedValue
    @Column(name="poll_vote_id")
    private Long pollVoteId;

    @JoinColumn(name="poll_id")
    @ManyToOne
    private Poll pollId;   //FK

    @JoinColumn(name="user_id")
    @ManyToOne
    private User user;   //FK

    //----------------------------------------------------------------
    @Column(name="option_name")
    private String optionName;













}
