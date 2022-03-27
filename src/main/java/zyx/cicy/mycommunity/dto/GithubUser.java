package zyx.cicy.mycommunity.dto;

import lombok.Data;

/**
 * Created by Cicy  at 2022/3/23 13:30
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatarUrl;
}
