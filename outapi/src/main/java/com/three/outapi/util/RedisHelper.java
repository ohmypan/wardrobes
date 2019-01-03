package com.three.outapi.util;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * File：RedisHelper <br>
 * Created on 2019/1/3.
 * Title:  <br>
 * Description: <br>
 * Company: wondersgroup.com <br>
 *
 * @author 潘国忠
 * @version 1.0
 */
@Component
public class RedisHelper {
    public static RedisTemplate<String, Object> redisTemplate;
//    public static final String KEY_PREFIX_VALUE = "three:cache:value:";
//    public static final String KEY_PREFIX_SET = "three:cache:set:";
//    public static final String KEY_PREFIX_LIST = "three:cache:list:";
//    public static final String KEY_PREFIX_MAP = "three:cache:map:";
//    public static final String KEY_PREFIX_OBJ = "three:data:obj:";
//    public static final long DEFAULT_TIMEOUT = 600L;
}
