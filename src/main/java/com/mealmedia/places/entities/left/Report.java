package com.mealmedia.places.entities.left;



import com.mealmedia.places.entities.right.Post;
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
@Table(name="Reports")
public class Report {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="report_id")
    private Long reportId;

    //-------------------------------

    @NotNull
    @JoinColumn(name="user_id")
    @ManyToOne
    private User user;   //FK

    @NotNull
    @JoinColumn(name="post_id")
    @ManyToOne
    private Post post;   //FK

















}
