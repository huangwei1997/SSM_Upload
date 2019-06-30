package com.xjtu.service;

import com.xjtu.mapper.UploadMapper;
import com.xjtu.pojo.UploadRecord;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UploadServiceImpl implements UploadService {
    @Resource
    private UploadMapper uploadMapper;
    @Override
    public int insUploadRecord(int uid, String oldName, String newName, String contentType) {
        return uploadMapper.insUploadRecord(uid,oldName,newName,contentType);
    }

    @Override
    public List<UploadRecord> selUploadRecords() {
        return uploadMapper.selUploadRecords();
    }
}
