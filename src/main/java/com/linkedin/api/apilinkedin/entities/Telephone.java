package com.linkedin.api.apilinkedin.entities;

import com.linkedin.api.apilinkedin.enuns.PhoneType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Telephone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private PhoneType type;
    private String telephone;

    public Telephone(PhoneType type, String telephone) {
        this.type = type;
        this.telephone = telephone;
    }
}
