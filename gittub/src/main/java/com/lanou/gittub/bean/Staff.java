package com.lanou.gittub.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Staff {
    private Integer sid;//员工id
    private String name;//员工姓名
    private String password;//员工密码
    private String department;//所属部门
    private Integer telephone;//员工手机号
}
