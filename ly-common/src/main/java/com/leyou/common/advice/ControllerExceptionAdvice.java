package com.leyou.common.advice;

import com.leyou.common.exception.LyException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionAdvice {
    /*
     * 统一异常处理方法，@ExceptionHandler（RuntimeException.class）声明这个方法处理
     * RuntimeException这样的异常
     * @param e 捕获到的议程
     * @return 返回给页面的状态码和信息
     * */
    @ExceptionHandler(LyException.class)
    public ResponseEntity<String> handleLyException(LyException e) {
        return ResponseEntity.status(e.getStatus()).body(e.getMessage());
    }
}
