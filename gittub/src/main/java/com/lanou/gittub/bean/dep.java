package com.lanou.gittub.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@EqualsAndHashCode
@ToString
public class dep {
    private Integer id;//部门id
    private String department;//部门
    private Integer sid;//员工id

}
