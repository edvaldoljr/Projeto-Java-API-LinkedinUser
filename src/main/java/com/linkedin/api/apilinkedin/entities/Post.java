package com.linkedin.api.apilinkedin.entities;

import com.linkedin.api.apilinkedin.enuns.Attachment;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Attachment attachment;
    private String postText;

    public Post(Attachment attachment, String postText) {
        this.attachment = attachment;
        this.postText = postText;
    }
}
