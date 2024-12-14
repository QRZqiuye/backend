package moimsa.backend.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/*
 * 공통 : JSON 데이터 리턴
 */
public class CommonJson<T> {

    private T data;
    
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public CommonJson(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    
    // JSON 문자열로 변환하는 메서드
    @Override
    public String toString() {
        try {
            return objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            return "{}";
        }
    }
}
