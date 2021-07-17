// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mc/jabber/proto/protos/cardinalDataBuffer.proto

package mc.jabber.proto;

public final class CardinalDataBuffer {
  private CardinalDataBuffer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CardinalDataProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:mc.jabber.proto.CardinalDataProto)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional bytes up = 1;</code>
     * @return Whether the up field is set.
     */
    boolean hasUp();
    /**
     * <code>optional bytes up = 1;</code>
     * @return The up.
     */
    com.google.protobuf.ByteString getUp();

    /**
     * <code>optional bytes down = 2;</code>
     * @return Whether the down field is set.
     */
    boolean hasDown();
    /**
     * <code>optional bytes down = 2;</code>
     * @return The down.
     */
    com.google.protobuf.ByteString getDown();

    /**
     * <code>optional bytes right = 3;</code>
     * @return Whether the right field is set.
     */
    boolean hasRight();
    /**
     * <code>optional bytes right = 3;</code>
     * @return The right.
     */
    com.google.protobuf.ByteString getRight();

    /**
     * <code>optional bytes left = 4;</code>
     * @return Whether the left field is set.
     */
    boolean hasLeft();
    /**
     * <code>optional bytes left = 4;</code>
     * @return The left.
     */
    com.google.protobuf.ByteString getLeft();
  }
  /**
   * Protobuf type {@code mc.jabber.proto.CardinalDataProto}
   */
  public static final class CardinalDataProto extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:mc.jabber.proto.CardinalDataProto)
      CardinalDataProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CardinalDataProto.newBuilder() to construct.
    private CardinalDataProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CardinalDataProto() {
      up_ = com.google.protobuf.ByteString.EMPTY;
      down_ = com.google.protobuf.ByteString.EMPTY;
      right_ = com.google.protobuf.ByteString.EMPTY;
      left_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CardinalDataProto();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CardinalDataProto(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              bitField0_ |= 0x00000001;
              up_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              down_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              right_ = input.readBytes();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              left_ = input.readBytes();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return mc.jabber.proto.CardinalDataBuffer.internal_static_mc_jabber_proto_CardinalDataProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return mc.jabber.proto.CardinalDataBuffer.internal_static_mc_jabber_proto_CardinalDataProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              mc.jabber.proto.CardinalDataBuffer.CardinalDataProto.class, mc.jabber.proto.CardinalDataBuffer.CardinalDataProto.Builder.class);
    }

    private int bitField0_;
    public static final int UP_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString up_;
    /**
     * <code>optional bytes up = 1;</code>
     * @return Whether the up field is set.
     */
    @java.lang.Override
    public boolean hasUp() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional bytes up = 1;</code>
     * @return The up.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getUp() {
      return up_;
    }

    public static final int DOWN_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString down_;
    /**
     * <code>optional bytes down = 2;</code>
     * @return Whether the down field is set.
     */
    @java.lang.Override
    public boolean hasDown() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional bytes down = 2;</code>
     * @return The down.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getDown() {
      return down_;
    }

    public static final int RIGHT_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString right_;
    /**
     * <code>optional bytes right = 3;</code>
     * @return Whether the right field is set.
     */
    @java.lang.Override
    public boolean hasRight() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional bytes right = 3;</code>
     * @return The right.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getRight() {
      return right_;
    }

    public static final int LEFT_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString left_;
    /**
     * <code>optional bytes left = 4;</code>
     * @return Whether the left field is set.
     */
    @java.lang.Override
    public boolean hasLeft() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional bytes left = 4;</code>
     * @return The left.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getLeft() {
      return left_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeBytes(1, up_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeBytes(2, down_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeBytes(3, right_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeBytes(4, left_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, up_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, down_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, right_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, left_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof mc.jabber.proto.CardinalDataBuffer.CardinalDataProto)) {
        return super.equals(obj);
      }
      mc.jabber.proto.CardinalDataBuffer.CardinalDataProto other = (mc.jabber.proto.CardinalDataBuffer.CardinalDataProto) obj;

      if (hasUp() != other.hasUp()) return false;
      if (hasUp()) {
        if (!getUp()
            .equals(other.getUp())) return false;
      }
      if (hasDown() != other.hasDown()) return false;
      if (hasDown()) {
        if (!getDown()
            .equals(other.getDown())) return false;
      }
      if (hasRight() != other.hasRight()) return false;
      if (hasRight()) {
        if (!getRight()
            .equals(other.getRight())) return false;
      }
      if (hasLeft() != other.hasLeft()) return false;
      if (hasLeft()) {
        if (!getLeft()
            .equals(other.getLeft())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasUp()) {
        hash = (37 * hash) + UP_FIELD_NUMBER;
        hash = (53 * hash) + getUp().hashCode();
      }
      if (hasDown()) {
        hash = (37 * hash) + DOWN_FIELD_NUMBER;
        hash = (53 * hash) + getDown().hashCode();
      }
      if (hasRight()) {
        hash = (37 * hash) + RIGHT_FIELD_NUMBER;
        hash = (53 * hash) + getRight().hashCode();
      }
      if (hasLeft()) {
        hash = (37 * hash) + LEFT_FIELD_NUMBER;
        hash = (53 * hash) + getLeft().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static mc.jabber.proto.CardinalDataBuffer.CardinalDataProto parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static mc.jabber.proto.CardinalDataBuffer.CardinalDataProto parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static mc.jabber.proto.CardinalDataBuffer.CardinalDataProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static mc.jabber.proto.CardinalDataBuffer.CardinalDataProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static mc.jabber.proto.CardinalDataBuffer.CardinalDataProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static mc.jabber.proto.CardinalDataBuffer.CardinalDataProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static mc.jabber.proto.CardinalDataBuffer.CardinalDataProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static mc.jabber.proto.CardinalDataBuffer.CardinalDataProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static mc.jabber.proto.CardinalDataBuffer.CardinalDataProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static mc.jabber.proto.CardinalDataBuffer.CardinalDataProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static mc.jabber.proto.CardinalDataBuffer.CardinalDataProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static mc.jabber.proto.CardinalDataBuffer.CardinalDataProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(mc.jabber.proto.CardinalDataBuffer.CardinalDataProto prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code mc.jabber.proto.CardinalDataProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:mc.jabber.proto.CardinalDataProto)
        mc.jabber.proto.CardinalDataBuffer.CardinalDataProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return mc.jabber.proto.CardinalDataBuffer.internal_static_mc_jabber_proto_CardinalDataProto_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return mc.jabber.proto.CardinalDataBuffer.internal_static_mc_jabber_proto_CardinalDataProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                mc.jabber.proto.CardinalDataBuffer.CardinalDataProto.class, mc.jabber.proto.CardinalDataBuffer.CardinalDataProto.Builder.class);
      }

      // Construct using mc.jabber.proto.CardinalDataBuffer.CardinalDataProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        up_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        down_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        right_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        left_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return mc.jabber.proto.CardinalDataBuffer.internal_static_mc_jabber_proto_CardinalDataProto_descriptor;
      }

      @java.lang.Override
      public mc.jabber.proto.CardinalDataBuffer.CardinalDataProto getDefaultInstanceForType() {
        return mc.jabber.proto.CardinalDataBuffer.CardinalDataProto.getDefaultInstance();
      }

      @java.lang.Override
      public mc.jabber.proto.CardinalDataBuffer.CardinalDataProto build() {
        mc.jabber.proto.CardinalDataBuffer.CardinalDataProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public mc.jabber.proto.CardinalDataBuffer.CardinalDataProto buildPartial() {
        mc.jabber.proto.CardinalDataBuffer.CardinalDataProto result = new mc.jabber.proto.CardinalDataBuffer.CardinalDataProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.up_ = up_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.down_ = down_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.right_ = right_;
        if (((from_bitField0_ & 0x00000008) != 0)) {
          to_bitField0_ |= 0x00000008;
        }
        result.left_ = left_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof mc.jabber.proto.CardinalDataBuffer.CardinalDataProto) {
          return mergeFrom((mc.jabber.proto.CardinalDataBuffer.CardinalDataProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(mc.jabber.proto.CardinalDataBuffer.CardinalDataProto other) {
        if (other == mc.jabber.proto.CardinalDataBuffer.CardinalDataProto.getDefaultInstance()) return this;
        if (other.hasUp()) {
          setUp(other.getUp());
        }
        if (other.hasDown()) {
          setDown(other.getDown());
        }
        if (other.hasRight()) {
          setRight(other.getRight());
        }
        if (other.hasLeft()) {
          setLeft(other.getLeft());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        mc.jabber.proto.CardinalDataBuffer.CardinalDataProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (mc.jabber.proto.CardinalDataBuffer.CardinalDataProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.ByteString up_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes up = 1;</code>
       * @return Whether the up field is set.
       */
      @java.lang.Override
      public boolean hasUp() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional bytes up = 1;</code>
       * @return The up.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getUp() {
        return up_;
      }
      /**
       * <code>optional bytes up = 1;</code>
       * @param value The up to set.
       * @return This builder for chaining.
       */
      public Builder setUp(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        up_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes up = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUp() {
        bitField0_ = (bitField0_ & ~0x00000001);
        up_ = getDefaultInstance().getUp();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString down_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes down = 2;</code>
       * @return Whether the down field is set.
       */
      @java.lang.Override
      public boolean hasDown() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional bytes down = 2;</code>
       * @return The down.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getDown() {
        return down_;
      }
      /**
       * <code>optional bytes down = 2;</code>
       * @param value The down to set.
       * @return This builder for chaining.
       */
      public Builder setDown(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        down_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes down = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDown() {
        bitField0_ = (bitField0_ & ~0x00000002);
        down_ = getDefaultInstance().getDown();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString right_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes right = 3;</code>
       * @return Whether the right field is set.
       */
      @java.lang.Override
      public boolean hasRight() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional bytes right = 3;</code>
       * @return The right.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getRight() {
        return right_;
      }
      /**
       * <code>optional bytes right = 3;</code>
       * @param value The right to set.
       * @return This builder for chaining.
       */
      public Builder setRight(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        right_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes right = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRight() {
        bitField0_ = (bitField0_ & ~0x00000004);
        right_ = getDefaultInstance().getRight();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString left_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes left = 4;</code>
       * @return Whether the left field is set.
       */
      @java.lang.Override
      public boolean hasLeft() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>optional bytes left = 4;</code>
       * @return The left.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getLeft() {
        return left_;
      }
      /**
       * <code>optional bytes left = 4;</code>
       * @param value The left to set.
       * @return This builder for chaining.
       */
      public Builder setLeft(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        left_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes left = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearLeft() {
        bitField0_ = (bitField0_ & ~0x00000008);
        left_ = getDefaultInstance().getLeft();
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:mc.jabber.proto.CardinalDataProto)
    }

    // @@protoc_insertion_point(class_scope:mc.jabber.proto.CardinalDataProto)
    private static final mc.jabber.proto.CardinalDataBuffer.CardinalDataProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new mc.jabber.proto.CardinalDataBuffer.CardinalDataProto();
    }

    public static mc.jabber.proto.CardinalDataBuffer.CardinalDataProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CardinalDataProto>
        PARSER = new com.google.protobuf.AbstractParser<CardinalDataProto>() {
      @java.lang.Override
      public CardinalDataProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CardinalDataProto(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CardinalDataProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CardinalDataProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public mc.jabber.proto.CardinalDataBuffer.CardinalDataProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mc_jabber_proto_CardinalDataProto_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mc_jabber_proto_CardinalDataProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/mc/jabber/proto/protos/cardinalDataBuf" +
      "fer.proto\022\017mc.jabber.proto\"\201\001\n\021CardinalD" +
      "ataProto\022\017\n\002up\030\001 \001(\014H\000\210\001\001\022\021\n\004down\030\002 \001(\014H" +
      "\001\210\001\001\022\022\n\005right\030\003 \001(\014H\002\210\001\001\022\021\n\004left\030\004 \001(\014H\003" +
      "\210\001\001B\005\n\003_upB\007\n\005_downB\010\n\006_rightB\007\n\005_leftb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_mc_jabber_proto_CardinalDataProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mc_jabber_proto_CardinalDataProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mc_jabber_proto_CardinalDataProto_descriptor,
        new java.lang.String[] { "Up", "Down", "Right", "Left", "Up", "Down", "Right", "Left", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}