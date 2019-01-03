package com.three.outapi.model.pub;

import lombok.*;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * File：ReturnObject <br>
 * Created on 2019/1/3.
 * Title:  <br>
 * Description: <br>
 * Company: wondersgroup.com <br>
 *
 * @author 潘国忠
 * @version 1.0
 */
@Data
@Getter
@Setter
@NoArgsConstructor
public class ReturnObject<T> implements Serializable {
    /**
     * 状态码
     */
    private int code = 0;
    /**
     * 错误信息
     */
    private String errMsg;
    /**
     * 返回结果
     */
    private T result;
    /**
     * 返回结果集
     */
    private List<T> resultList;
    /**
     * 返回map
     */
    private Map<String,Object> resultMap;
    /**
     * 异常
     */
    private Exception exception;

    public ReturnObject(T obj) {
        this.result = obj;
    }

    public ReturnObject<T> putObj(T obj) {
        this.result = obj;
        return this;
    }
}
