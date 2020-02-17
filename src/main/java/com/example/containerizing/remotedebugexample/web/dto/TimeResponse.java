package com.example.containerizing.remotedebugexample.web.dto;

public final class TimeResponse {

  private final long time;

  private TimeResponse(long time) {
    this.time = time;
  }

  public long getTime() {
    return this.time;
  }

  public static TimeResponseBuilder builder() {
    return new TimeResponseBuilder();
  }

  public static class TimeResponseBuilder {

    private TimeResponseBuilder() {

    }

    private long time;

    public TimeResponseBuilder time(long time) {
      this.time = time;
      return this;
    }

    public TimeResponse build() {
      return new TimeResponse(time);
    }
  }
}
