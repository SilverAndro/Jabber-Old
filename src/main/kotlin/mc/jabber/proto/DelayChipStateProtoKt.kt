//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: mc/jabber/proto/protos/delayChipStateBuffer.proto

package mc.jabber.proto;

@kotlin.jvm.JvmSynthetic
inline fun delayChipStateProto(block: mc.jabber.proto.DelayChipStateProtoKt.Dsl.() -> Unit): mc.jabber.proto.DelayChipStateBuffer.DelayChipStateProto =
  mc.jabber.proto.DelayChipStateProtoKt.Dsl._create(mc.jabber.proto.DelayChipStateBuffer.DelayChipStateProto.newBuilder()).apply { block() }._build()
object DelayChipStateProtoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: mc.jabber.proto.DelayChipStateBuffer.DelayChipStateProto.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: mc.jabber.proto.DelayChipStateBuffer.DelayChipStateProto.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): mc.jabber.proto.DelayChipStateBuffer.DelayChipStateProto = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class EntriesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .mc.jabber.proto.DelayChipStateProto.entry entries = 1;</code>
     */
     val entries: com.google.protobuf.kotlin.DslList<mc.jabber.proto.DelayChipStateBuffer.DelayChipStateProto.entry, EntriesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getEntriesList()
      )
    /**
     * <code>repeated .mc.jabber.proto.DelayChipStateProto.entry entries = 1;</code>
     * @param value The entries to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addEntries")
    fun com.google.protobuf.kotlin.DslList<mc.jabber.proto.DelayChipStateBuffer.DelayChipStateProto.entry, EntriesProxy>.add(value: mc.jabber.proto.DelayChipStateBuffer.DelayChipStateProto.entry) {
      _builder.addEntries(value)
    }/**
     * <code>repeated .mc.jabber.proto.DelayChipStateProto.entry entries = 1;</code>
     * @param value The entries to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignEntries")
    inline operator fun com.google.protobuf.kotlin.DslList<mc.jabber.proto.DelayChipStateBuffer.DelayChipStateProto.entry, EntriesProxy>.plusAssign(value: mc.jabber.proto.DelayChipStateBuffer.DelayChipStateProto.entry) {
      add(value)
    }/**
     * <code>repeated .mc.jabber.proto.DelayChipStateProto.entry entries = 1;</code>
     * @param values The entries to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllEntries")
    fun com.google.protobuf.kotlin.DslList<mc.jabber.proto.DelayChipStateBuffer.DelayChipStateProto.entry, EntriesProxy>.addAll(values: kotlin.collections.Iterable<mc.jabber.proto.DelayChipStateBuffer.DelayChipStateProto.entry>) {
      _builder.addAllEntries(values)
    }/**
     * <code>repeated .mc.jabber.proto.DelayChipStateProto.entry entries = 1;</code>
     * @param values The entries to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllEntries")
    inline operator fun com.google.protobuf.kotlin.DslList<mc.jabber.proto.DelayChipStateBuffer.DelayChipStateProto.entry, EntriesProxy>.plusAssign(values: kotlin.collections.Iterable<mc.jabber.proto.DelayChipStateBuffer.DelayChipStateProto.entry>) {
      addAll(values)
    }/**
     * <code>repeated .mc.jabber.proto.DelayChipStateProto.entry entries = 1;</code>
     * @param index The index to set the value at.
     * @param value The entries to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setEntries")
    operator fun com.google.protobuf.kotlin.DslList<mc.jabber.proto.DelayChipStateBuffer.DelayChipStateProto.entry, EntriesProxy>.set(index: kotlin.Int, value: mc.jabber.proto.DelayChipStateBuffer.DelayChipStateProto.entry) {
      _builder.setEntries(index, value)
    }/**
     * <code>repeated .mc.jabber.proto.DelayChipStateProto.entry entries = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearEntries")
    fun com.google.protobuf.kotlin.DslList<mc.jabber.proto.DelayChipStateBuffer.DelayChipStateProto.entry, EntriesProxy>.clear() {
      _builder.clearEntries()
    }}
  @kotlin.jvm.JvmSynthetic
  inline fun entry(block: mc.jabber.proto.DelayChipStateProtoKt.entryKt.Dsl.() -> Unit): mc.jabber.proto.DelayChipStateBuffer.DelayChipStateProto.entry =
    mc.jabber.proto.DelayChipStateProtoKt.entryKt.Dsl._create(mc.jabber.proto.DelayChipStateBuffer.DelayChipStateProto.entry.newBuilder()).apply { block() }._build()
  object entryKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    class Dsl private constructor(
      @kotlin.jvm.JvmField private val _builder: mc.jabber.proto.DelayChipStateBuffer.DelayChipStateProto.entry.Builder
    ) {
      companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: mc.jabber.proto.DelayChipStateBuffer.DelayChipStateProto.entry.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): mc.jabber.proto.DelayChipStateBuffer.DelayChipStateProto.entry = _builder.build()

      /**
       * <code>uint32 remainingDelay = 1;</code>
       */
      var remainingDelay: kotlin.Int
        @JvmName("getRemainingDelay")
        get() = _builder.getRemainingDelay()
        @JvmName("setRemainingDelay")
        set(value) {
          _builder.setRemainingDelay(value)
        }
      /**
       * <code>uint32 remainingDelay = 1;</code>
       */
      fun clearRemainingDelay() {
        _builder.clearRemainingDelay()
      }

      /**
       * <code>uint32 direction = 2;</code>
       */
      var direction: kotlin.Int
        @JvmName("getDirection")
        get() = _builder.getDirection()
        @JvmName("setDirection")
        set(value) {
          _builder.setDirection(value)
        }
      /**
       * <code>uint32 direction = 2;</code>
       */
      fun clearDirection() {
        _builder.clearDirection()
      }

      /**
       * <code>sint64 data = 3;</code>
       */
      var data: kotlin.Long
        @JvmName("getData")
        get() = _builder.getData()
        @JvmName("setData")
        set(value) {
          _builder.setData(value)
        }
      /**
       * <code>sint64 data = 3;</code>
       */
      fun clearData() {
        _builder.clearData()
      }
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun mc.jabber.proto.DelayChipStateBuffer.DelayChipStateProto.copy(block: mc.jabber.proto.DelayChipStateProtoKt.Dsl.() -> Unit): mc.jabber.proto.DelayChipStateBuffer.DelayChipStateProto =
  mc.jabber.proto.DelayChipStateProtoKt.Dsl._create(this.toBuilder()).apply { block() }._build()
@kotlin.jvm.JvmSynthetic
inline fun mc.jabber.proto.DelayChipStateBuffer.DelayChipStateProto.entry.copy(block: mc.jabber.proto.DelayChipStateProtoKt.entryKt.Dsl.() -> Unit): mc.jabber.proto.DelayChipStateBuffer.DelayChipStateProto.entry =
  mc.jabber.proto.DelayChipStateProtoKt.entryKt.Dsl._create(this.toBuilder()).apply { block() }._build()
