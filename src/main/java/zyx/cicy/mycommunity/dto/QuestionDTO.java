package zyx.cicy.mycommunity.dto;

import lombok.Data;
import zyx.cicy.mycommunity.model.User;

/**
 * Created by Cicy  at 2022/3/27 17:41
 */
@Data
public class QuestionDTO {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private long gmtCreate;
    private long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;
}
