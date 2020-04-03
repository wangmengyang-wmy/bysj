package com.kd.bysj.stushop.entity;

public class UserLock {
    private Integer id;
    private Integer count;
    private Integer user_id;
    private String lock_time;
    private Integer lock;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getLock_time() {
        return lock_time;
    }

    public void setLock_time(String lock_time) {
        this.lock_time = lock_time;
    }

    public Integer getLock() {
        return lock;
    }

    public void setLock(Integer lock) {
        this.lock = lock;
    }

    @Override
    public String toString() {
        return "UserLock{" +
                "id=" + id +
                ", count=" + count +
                ", user_id=" + user_id +
                ", lock_time='" + lock_time + '\'' +
                ", lock=" + lock +
                '}';
    }
}
