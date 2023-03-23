package com.mealmedia.places.entities.right;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="Tag")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="tag_id")
    private Long tagId;

    @NotNull
    @Column(name="tag_name")
    private String tagName;

    //----------------------------------


    @JsonIgnore
    @OneToMany(mappedBy = "tag")
    private List<PlaceTag> placeTags;   //FK





}
