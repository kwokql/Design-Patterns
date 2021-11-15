package com.kwokql;

import java.util.HashMap;

/**
 * @author ql kwok
 * @date 2021年11月12日 16:56
 * 用户类
 */

public class UserInfo implements Cloneable {

    private String name;
    private Job job;

    public UserInfo(String name) {
        this.name = name;
        this.job = new Job(name+"的工作");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public Object clone() {
        UserInfo userInfo = null;
        try {
            userInfo = (UserInfo) super.clone();

            // 将复杂属性也重新构建 就是深拷贝
            userInfo.setJob((Job) this.job.clone());

        } catch (CloneNotSupportedException e) {
            System.out.println("拷贝失败!");
        }
        return userInfo;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", job=" + job +
                '}';
    }
}
