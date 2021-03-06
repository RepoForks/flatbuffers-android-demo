package com.example.flatbuffersdemo.flatbuffer;// automatically generated by the FlatBuffers compiler, do not modify

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Event extends Table {
  public static Event getRootAsEvent(ByteBuffer _bb) { return getRootAsEvent(_bb, new Event()); }
  public static Event getRootAsEvent(ByteBuffer _bb, Event obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public Event __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public long id() { int o = __offset(4); return o != 0 ? bb.getLong(o + bb_pos) : 0; }
  public String name() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public String location() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer locationAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public String date() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer dateAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }

  public static int createEvent(FlatBufferBuilder builder,
      long id,
      int nameOffset,
      int locationOffset,
      int dateOffset) {
    builder.startObject(4);
    Event.addId(builder, id);
    Event.addDate(builder, dateOffset);
    Event.addLocation(builder, locationOffset);
    Event.addName(builder, nameOffset);
    return Event.endEvent(builder);
  }

  public static void startEvent(FlatBufferBuilder builder) { builder.startObject(4); }
  public static void addId(FlatBufferBuilder builder, long id) { builder.addLong(0, id, 0); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(1, nameOffset, 0); }
  public static void addLocation(FlatBufferBuilder builder, int locationOffset) { builder.addOffset(2, locationOffset, 0); }
  public static void addDate(FlatBufferBuilder builder, int dateOffset) { builder.addOffset(3, dateOffset, 0); }
  public static int endEvent(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

