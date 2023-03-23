package com.mealmedia.places.entities.left;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="Badge")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","userBadges"})
public class Badge {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="badge_id")
    private Long badgeId;

    @Column(name="badge_name")
    private String badgeName;

    @Column(name="badge_icon_url")
    private String badgeIconUrl;

    @Column(name="badge_desc")
    private String badgeDesc;

    //--------------------------------------
    @JsonIgnore
    @OneToMany(mappedBy = "badge")
    List<UserBadge> userBadges;





}
