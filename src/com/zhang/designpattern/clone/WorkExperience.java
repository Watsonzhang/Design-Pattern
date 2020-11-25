package com.zhang.designpattern.clone;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/24 上午9:26
 */
public class WorkExperience {
    private String companyName;
    private int code;


    public WorkExperience(String companyName, int code) {
        this.companyName = companyName;
        this.code = code;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
