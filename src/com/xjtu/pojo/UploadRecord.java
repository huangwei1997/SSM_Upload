package com.xjtu.pojo;

public class UploadRecord {
    private int upid;
    private int uid;
    private String oldName;
    private String newName;
    private String contentType;
    private String uploadTime;

    public UploadRecord(){}

    public UploadRecord(int upid, int uid, String oldName, String newName, String contentType, String uploadTime) {
        this.upid = upid;
        this.uid = uid;
        this.oldName = oldName;
        this.newName = newName;
        this.contentType = contentType;
        this.uploadTime = uploadTime;
    }

    @Override
    public String toString() {
        return "UploadRecord{" +
                "upid=" + upid +
                ", uid=" + uid +
                ", oldName='" + oldName + '\'' +
                ", newName='" + newName + '\'' +
                ", contentType='" + contentType + '\'' +
                ", uploadTime='" + uploadTime + '\'' +
                '}';
    }

    public int getUpid() {
        return upid;
    }

    public void setUpid(int upid) {
        this.upid = upid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }
}
