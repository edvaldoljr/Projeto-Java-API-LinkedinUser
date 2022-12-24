package com.linkedin.api.apilinkedin.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Users implements Serializable {

    private static final long attachments = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date birthDate;
    private String title;
    private String localization;
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Telephone> telephones;
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Post> posts;

    public Users(String name, Date birthDate, String title, String localization, List<Telephone> telephones, List<Post> posts) {
        this.name = name;
        this.birthDate = birthDate;
        this.title = title;
        this.localization = localization;
        this.telephones = telephones;
        this.posts = posts;
    }
}
