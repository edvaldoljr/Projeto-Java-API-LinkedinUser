package com.linkedin.api.apilinkedin.enuns;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {

    COMMERCIAL("commercial"),
    CELULLAR("celullar"),
    RESIDENTIAL("residential");

    private final String description;

}
