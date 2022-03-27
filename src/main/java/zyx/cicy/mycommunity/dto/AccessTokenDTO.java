package zyx.cicy.mycommunity.dto;

import lombok.Data;

/**
 * Created by Cicy  at 2022/3/23 11:35
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;


}
