package com.example.finalproject.utils;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import java.util.Map;

public class CloudinaryManager {
    private static Cloudinary cloudinary;

    public static Cloudinary getInstance() {
        if (cloudinary == null) {
            cloudinary = new Cloudinary(ObjectUtils.asMap(
                    "cloud_name", "dwgjleqne",
                    "api_key", "537997491285898",
                    "api_secret", "55GfywFOlI7bnUpw3rFJvHFpOFk"
            ));
        }
        return cloudinary;
    }
}
