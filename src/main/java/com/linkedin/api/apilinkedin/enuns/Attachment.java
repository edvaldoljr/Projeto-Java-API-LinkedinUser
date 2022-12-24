package com.linkedin.api.apilinkedin.enuns;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Attachment {

    IMAGE("Image"),
    VIDEO("Video"),
    DOCUMENT("Document");

    private final String description;
}
