package com.wuhu.meizubeans.vo;

import com.wuhu.meizubeans.constant.SystemConstant;
import lombok.Data;


@Data
public class ResultVO {
    /**：0表示成功。1表示失败
     * 状态码：
     */
    private int code;
    /**
     * 提示信息
     */
    private String message;
    /**
     * 具体数据
     */
    private Object data;
    /**
     * 构造方法
     */
    private ResultVO() {

    }
    /**
     * 成功，且有数据
     */
    public static com.wuhu.meizubeans.vo.ResultVO getSuccessVo(String msg, Object data){
        com.wuhu.meizubeans.vo.ResultVO resultVO = new com.wuhu.meizubeans.vo.ResultVO();
        resultVO.code = SystemConstant.SUCCESS_FLAG;
        resultVO.message = msg;
        resultVO.data = data;
        return resultVO;
    }
    /**
     * 失败，且有数据
     */
    public static com.wuhu.meizubeans.vo.ResultVO getFailVo(String msg, Object data){
        com.wuhu.meizubeans.vo.ResultVO resultVO = new com.wuhu.meizubeans.vo.ResultVO();
        resultVO.code = SystemConstant.FAIL_FLAG;
        resultVO.message = msg;
        resultVO.data = data;
        return resultVO;
    }
    /**
     * 成功，且无数据
     */
    public static com.wuhu.meizubeans.vo.ResultVO getSuccessVo(String msg){
        com.wuhu.meizubeans.vo.ResultVO resultVO = new com.wuhu.meizubeans.vo.ResultVO();
        resultVO.code = SystemConstant.SUCCESS_FLAG;
        resultVO.message = msg;
        resultVO.data = null;
        return resultVO;
    }



    /**
     * 失败，且无数据
     */
    public static com.wuhu.meizubeans.vo.ResultVO getFailVo(String msg){
        com.wuhu.meizubeans.vo.ResultVO resultVO = new com.wuhu.meizubeans.vo.ResultVO();
        resultVO.code = SystemConstant.FAIL_FLAG;
        resultVO.message = msg;
        resultVO.data = null;
        return resultVO;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
