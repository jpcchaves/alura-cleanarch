package com.alura.infra.dto.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serial;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response<T> implements Serializable {

  @Serial private static final long serialVersionUID = 6185667832459155516L;

  private T data;

  private String message;

  public Response() {}

  public Response(T dUserata, String message) {
    this.data = data;
    this.message = message;
  }

  public Response(T data) {
    this.data = data;
  }

  public static <T> Response<T> withData(T data) {

    return new Response<>(data);
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
