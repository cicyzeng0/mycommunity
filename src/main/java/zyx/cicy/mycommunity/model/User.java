package zyx.cicy.mycommunity.model;

import lombok.Data;

/**
 * Created by Cicy  at 2022/3/25 10:32
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;
}
