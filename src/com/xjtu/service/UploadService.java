package com.xjtu.service;

import com.xjtu.pojo.UploadRecord;

import java.util.List;

public interface UploadService {
    //将上传记录插入到数据库中
    int insUploadRecord(int uid,String oldName,String newName,String contentType);
    //查询所有的上传记录
    List<UploadRecord> selUploadRecords();
}
