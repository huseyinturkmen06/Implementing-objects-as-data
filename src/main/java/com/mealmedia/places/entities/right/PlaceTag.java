package com.mealmedia.places.entities.right;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="BookTags")
public class PlaceTag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="place_tag_id")
    private Long placeTagId;

    //----------------------

    @NotNull
    @JoinColumn(name="tag_id")
    @ManyToOne
    private Tag tag;   //FK

    @NotNull
    @JoinColumn(name="place_id")
    @ManyToOne
    private Place place;   //FK





}
