package com.lab.labDCP.dto;

import lombok.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseTo {
    private Long id;
    private String login;
    private String firstname;
    private String lastname;
    private List<Long> storyIds;

}