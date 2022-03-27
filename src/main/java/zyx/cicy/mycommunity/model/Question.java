package zyx.cicy.mycommunity.model;

import lombok.Data;

/**
 * Created by Cicy  at 2022/3/26 10:46
 */
@Data//用来自动添加get set方法（Lombok插件）
public class Question {
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
}
