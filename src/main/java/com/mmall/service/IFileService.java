package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by 15295 on 2018/4/25.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
