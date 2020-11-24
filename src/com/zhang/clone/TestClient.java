package com.zhang.clone;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/24 上午9:27
 */
public class TestClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resume1 = new Resume();
        resume1.setName("a");
        WorkExperience bj = new WorkExperience("北京云上", 10011);
        resume1.setWork(bj);
        Resume resume2 = (Resume)resume1.clone();
        System.out.println(resume1);
        System.out.println(resume2);



    }
}
