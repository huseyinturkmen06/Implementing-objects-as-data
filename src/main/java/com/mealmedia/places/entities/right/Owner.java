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
@Table(name="Owner")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","places"})
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="owner_id")
    private Long ownerId;

    @Column(name="owner_name")
    private String ownerName;

    @Column(name="owner_image_url")
    private String ownerImageUrl;

    @Column(name="owner_des")
    private String wonerDesc;

    //-----------------------------------
    @JsonIgnore
    @OneToMany(mappedBy = "owner")
    private List<Place> places;   //FK





}
