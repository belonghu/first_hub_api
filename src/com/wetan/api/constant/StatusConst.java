package com.wetan.api.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by CosWind on 2015/7/18.
 */
public class StatusConst {

    public final static String OK = "0000";
    /**
     * 业务逻辑错误
     **/
    public final static String BUS_EXCEPTION = "0201";
    /**
     * 服务器异常
     **/
    public final static String SERVER_EXCEPTION = "0202";
    /**
     * Session失效
     **/
    public final static String SESSION_EXPIRE = "0203";
    /**
     * 参数错误
     **/
    public final static String PAR_EXCEPTION = "0204";
    /**
     * 此用户名已存在
     **/
    public final static String USERNAME_IS_EXIST = "0102";
    /**
     * 账号或密码错误
     **/
    public final static String NAME_OR_PASSWORD_ERROR = "0103";
    /**
     * 邮箱已存在
     **/
    public final static String EMAIL_IS_EXIST = "0104";
    /**
     * 账号或密码多次错误，与凯盛法务(@compliance.list@capvision.com)确认您的密码
     **/
    public final static String MANY_NAME_OR_PASSWORD_ERROR = "0110";
    /**
     * 错误的原始密码
     **/
    public final static String INCORRECT_ORIGIN_PASSWD = "0111";
    /**
     * 已存在该客户联系人的账号
     */
    public final static String CLIENT_CONTACT_ACCOUNT_IS_EXIST_ERROR = "0112";
    /**
     * 客户联系人不存在
     */
    public final static String CLIENT_CONTACT_NOT_EXIST_ERROR = "0113";
    /**
     * 客户联系人邮箱不存在
     */
    public final static String CLIENT_CONTACT_EMAIL_NOT_EXIST_ERROR = "0114";
    /**
     * 认证approved的职位信息不存在
     */
    public final static String APPROVED_POSITION_NOT_EXIST_ERROR = "0115";

    /**
     * approved的公司信息不存在
     */
    public final static String APPROVED_COMPANY_NOT_EXIST_ERROR = "0116";

    /**
     * 专家填写的IdentityCard已经被其他专家占用
     */
    public final static String CONSULTANT_IDENTITY_CARD_IS_EXIST_ERROR = "0117";

    /**
     * 项目不允许关闭，因为存在complete的task
     */
    public final static String PROJECT_SHOULD_NOT_CLOSE_AS_EXIST_COMPLETE_TASK = "0118";

    /**
     * 短信发送错误
     */
    public final static String SMS_SEND_ERROR = "0119";

    /**
     * 项目不存在
     */
    public final static String PROJECT_NOT_EXIST_ERROR = "0120";
    /**
     * task不存在
     */
    public final static String TASK_NOT_EXIST_ERROR = "0121";

    /** 专家没有银行卡信息 **/
    public final static String CLT_HAS_NO_BANK_INFO = "0122";

    /** 专家没有身份证信息 **/
    public final static String CLT_HAS_NO_IDENTITY_CARD = "0123";

    /** 专家不存在 **/
    public final static String CONSULTANT_NOT_EXISTS = "0124";

    /**
     * 短信模板已存在
     */
    public final static String SMS_TEMPLATE_EXISTS = "0125";

    private final static Map<String, String> STATUS_TIP_MAP = new HashMap<>();

    static {
        STATUS_TIP_MAP.put(SESSION_EXPIRE, "Session失效，请重新登录");
        STATUS_TIP_MAP.put(PAR_EXCEPTION, "参数错误");
        STATUS_TIP_MAP.put(USERNAME_IS_EXIST, "用户名已存在");
        STATUS_TIP_MAP.put(EMAIL_IS_EXIST, "邮箱已存在");
        STATUS_TIP_MAP.put(CLT_HAS_NO_BANK_INFO, "Please make sure the consultant has Bank Card information.");
        STATUS_TIP_MAP.put(CLT_HAS_NO_IDENTITY_CARD, "Please make sure the consultant has identity information.");
        STATUS_TIP_MAP.put(CONSULTANT_NOT_EXISTS, "专家不存在");
    }

    public static String getTip(String status) {
        return STATUS_TIP_MAP.get(status);
    }
}
