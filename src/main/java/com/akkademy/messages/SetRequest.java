package com.akkademy.messages;

/**
 * @author amarinv@psl.com.co on 4/28/2017.
 */
public class SetRequest {
  private final String key;
  private final Object value;

  public SetRequest(String key, Object value) {
    this.key = key;
    this.value = value;
  }

  public String getKey() {
    return key;
  }

  public Object getValue() {
    return value;
  }
}
