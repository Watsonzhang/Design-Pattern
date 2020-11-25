package com.zhang.designpattern.prototype;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/24 上午9:25
 */
public class Resume implements Cloneable {
    private String name;
    private WorkExperience work;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", work=" + work +
                '}';
    }

    public WorkExperience getWork() {
        return work;
    }

    public void setWork(WorkExperience work) {
        this.work = work;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Resume clone = (Resume) super.clone();
        WorkExperience workExperience = new WorkExperience(this.getWork().getCompanyName(), this.getWork().getCode());
        clone.setWork(workExperience);
        return clone;
    }
}
