package com.xjtu.mapper;

import com.xjtu.pojo.UploadRecord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UploadMapper {
    //将上传记录存储到数据库中
    @Insert("insert into upload_record values(default,#{0},#{1},#{2},#{3},now())")
    int insUploadRecord(int uid,String oldName,String newName,String contentType);
    //查询所有的上传记录
    @Select("select * from upload_record")
    List<UploadRecord> selUploadRecords();
}
