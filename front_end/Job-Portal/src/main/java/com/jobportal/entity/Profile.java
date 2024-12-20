package com.jobportal.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.jobportal.dto.Certification;
import com.jobportal.dto.Experience;
import com.jobportal.dto.ProfileDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "profiles")
public class Profile {
    @Id
    private Long id;
    private String email;
    private String jobTitle;
    private String Company;
    private String location;
    private String about;
    private List<String> skills;
    private List<Experience> experience;
    private List<Certification> certifications;

    public ProfileDTO toDTO() {

        return new ProfileDTO(this.id, this.email, this.jobTitle, this.Company, this.location, this.about,
                this.skills, this.experience, this.certifications);
    }

}
