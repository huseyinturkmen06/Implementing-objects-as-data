package com.mealmedia.places.entities.right;



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
@Table(name="places")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","placeTags","notes","activeBooks","posts"})
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="place_id")
    private Long placeId;


    @Column(name="place_name")
    private String placeName;

    @Column(name="place_picture_url")
    private String placePictureUrl;

    @Column(name="place_desc")
    private String placeDesc;

    @Column(name="place_active_tiem")
    private String placeActiveTime;



    //----------------------------------------------

    @JsonIgnore
    @OneToMany(mappedBy = "place")
    private List<PlaceTag> placeTags;

    @JsonIgnore
    @OneToMany(mappedBy = "place")
    private List<Note> notes;

    @JsonIgnore
    @OneToMany(mappedBy = "place")
    private List<Post> posts;

    @JoinColumn(name="owner_id")
    @ManyToOne
    private Owner owner;   //FK









}
