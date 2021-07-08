package com.tncet.demo.enums;



/**
 * 状态码
 */
public enum StdStatus
{
    STATUS_200(200, "ok"),

    STATUS_1010(1010, "用户不存在"),
    STATUS_1011(1011, "用户名或密码错误"),
    STATUS_1012(1012, "用户名已注册"),
    STATUS_1013(1013, "用户已冻结"),
    STATUS_1014(1014, "用户数据准备中"),
    STATUS_1015(1015, "用户已删除"),
    STATUS_1017(1017, "验证码发送失败"),
    STATUS_1018(1018, "验证码错误"),
    STATUS_1019(1019, "手机号格式不正确"),
    STATUS_1020(1020, "请勿重复发送验证码"),
    STATUS_1021(1021, "邮箱格式不正确"),
    STATUS_1022(1022, "口令过期"),
    STATUS_1023(1023, "用户等级权限低"),
    STATUS_1024(1024, "参数不存在"),

    STATUS_1101(1101, "版本过低"),
    STATUS_1103(1103, "用户非正常操作"),

    STATUS_1201(1201, "数据错误"),

    STATUS_1301(1301, "文件错误"),

    STATUS_1401(1401, "仪器错误"),

    STATUS_1501(1501, "非法操作"),
    STATUS_1601(1601, "查询未知异常"),
    STATUS_1701(1701, "日志记录异常"),
    ;

    private int status;
    private String statusInfo;

    StdStatus(int status, String statusInfo) {
        this.status = status;
        this.statusInfo = statusInfo;
    }

    public int getStatus() {
        return status;
    }

    public String getStatusInfo() {
        return statusInfo;
    }

    public static StdStatus valueOf(int index) {
        for (StdStatus s : values()) {
            if (s.getStatus() == index) {
                return s;
            }
        }
        return null;
    }
}
