package com.zhengjian.sample.springboot.controlleradvice.pojo;

/**
 * @Author zhengjian
 * @Date 2019-07-24 14:53
 */
public class Author {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
