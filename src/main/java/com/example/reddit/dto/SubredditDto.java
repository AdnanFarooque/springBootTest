package com.example.reddit.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubredditDto {
    private Long id;
    private String name;
    private String description;
    private String username;
    private String createdDate;
    private Integer numberOfPosts;
}
