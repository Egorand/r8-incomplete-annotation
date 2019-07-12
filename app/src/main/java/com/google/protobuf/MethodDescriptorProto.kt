// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: google/protobuf/descriptor.proto
package com.google.protobuf

import android.os.Parcelable
import com.squareup.wire.AndroidMessage
import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.TagHandler
import com.squareup.wire.WireField
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.jvm.JvmField
import okio.ByteString

/**
 * Describes a method of a service.
 */
data class MethodDescriptorProto(
  @field:WireField(tag = 1, adapter = "com.squareup.wire.ProtoAdapter#STRING") @JvmField val name:
      String? = null,
  /**
   * Input and output type names.  These are resolved in the same way as
   * FieldDescriptorProto.type_name, but must refer to a message type.
   */
  @field:WireField(tag = 2, adapter = "com.squareup.wire.ProtoAdapter#STRING") @JvmField
      val input_type: String? = null,
  @field:WireField(tag = 3, adapter = "com.squareup.wire.ProtoAdapter#STRING") @JvmField
      val output_type: String? = null,
  @field:WireField(tag = 4, adapter = "com.google.protobuf.MethodOptions#ADAPTER") @JvmField
      val options: MethodOptions? = null,
  /**
   * Identifies if client streams multiple client messages
   */
  @field:WireField(tag = 5, adapter = "com.squareup.wire.ProtoAdapter#BOOL") @JvmField
      val client_streaming: Boolean? = false,
  /**
   * Identifies if server streams multiple server messages
   */
  @field:WireField(tag = 6, adapter = "com.squareup.wire.ProtoAdapter#BOOL") @JvmField
      val server_streaming: Boolean? = false,
  val unknownFields: ByteString = ByteString.EMPTY
) : AndroidMessage<MethodDescriptorProto, MethodDescriptorProto.Builder>(ADAPTER, unknownFields) {
  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.name = name
    builder.input_type = input_type
    builder.output_type = output_type
    builder.options = options
    builder.client_streaming = client_streaming
    builder.server_streaming = server_streaming
    builder.addUnknownFields(unknownFields())
    return builder
  }

  class Builder : Message.Builder<MethodDescriptorProto, Builder>() {
    @JvmField
    var name: String? = null

    @JvmField
    var input_type: String? = null

    @JvmField
    var output_type: String? = null

    @JvmField
    var options: MethodOptions? = null

    @JvmField
    var client_streaming: Boolean? = false

    @JvmField
    var server_streaming: Boolean? = false

    fun name(name: String?): Builder {
      this.name = name
      return this
    }

    /**
     * Input and output type names.  These are resolved in the same way as
     * FieldDescriptorProto.type_name, but must refer to a message type.
     */
    fun input_type(input_type: String?): Builder {
      this.input_type = input_type
      return this
    }

    fun output_type(output_type: String?): Builder {
      this.output_type = output_type
      return this
    }

    fun options(options: MethodOptions?): Builder {
      this.options = options
      return this
    }

    /**
     * Identifies if client streams multiple client messages
     */
    fun client_streaming(client_streaming: Boolean): Builder {
      this.client_streaming = client_streaming
      return this
    }

    /**
     * Identifies if server streams multiple server messages
     */
    fun server_streaming(server_streaming: Boolean): Builder {
      this.server_streaming = server_streaming
      return this
    }

    override fun build(): MethodDescriptorProto = MethodDescriptorProto(
      name = name,
      input_type = input_type,
      output_type = output_type,
      options = options,
      client_streaming = client_streaming,
      server_streaming = server_streaming,
      unknownFields = buildUnknownFields()
    )
  }

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<MethodDescriptorProto> = object : ProtoAdapter<MethodDescriptorProto>(
      FieldEncoding.LENGTH_DELIMITED, 
      MethodDescriptorProto::class.java
    ) {
      override fun encodedSize(value: MethodDescriptorProto): Int = 
        ProtoAdapter.STRING.encodedSizeWithTag(1, value.name) +
        ProtoAdapter.STRING.encodedSizeWithTag(2, value.input_type) +
        ProtoAdapter.STRING.encodedSizeWithTag(3, value.output_type) +
        MethodOptions.ADAPTER.encodedSizeWithTag(4, value.options) +
        ProtoAdapter.BOOL.encodedSizeWithTag(5, value.client_streaming) +
        ProtoAdapter.BOOL.encodedSizeWithTag(6, value.server_streaming) +
        value.unknownFields.size

      override fun encode(writer: ProtoWriter, value: MethodDescriptorProto) {
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name)
        ProtoAdapter.STRING.encodeWithTag(writer, 2, value.input_type)
        ProtoAdapter.STRING.encodeWithTag(writer, 3, value.output_type)
        MethodOptions.ADAPTER.encodeWithTag(writer, 4, value.options)
        ProtoAdapter.BOOL.encodeWithTag(writer, 5, value.client_streaming)
        ProtoAdapter.BOOL.encodeWithTag(writer, 6, value.server_streaming)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): MethodDescriptorProto {
        var name: String? = null
        var input_type: String? = null
        var output_type: String? = null
        var options: MethodOptions? = null
        var client_streaming: Boolean = false
        var server_streaming: Boolean = false
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> name = ProtoAdapter.STRING.decode(reader)
            2 -> input_type = ProtoAdapter.STRING.decode(reader)
            3 -> output_type = ProtoAdapter.STRING.decode(reader)
            4 -> options = MethodOptions.ADAPTER.decode(reader)
            5 -> client_streaming = ProtoAdapter.BOOL.decode(reader)
            6 -> server_streaming = ProtoAdapter.BOOL.decode(reader)
            else -> TagHandler.UNKNOWN_TAG
          }
        }
        return MethodDescriptorProto(
          name = name,
          input_type = input_type,
          output_type = output_type,
          options = options,
          client_streaming = client_streaming,
          server_streaming = server_streaming,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: MethodDescriptorProto): MethodDescriptorProto? = value.copy(
        options = value.options?.let(MethodOptions.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    @JvmField
    val CREATOR: Parcelable.Creator<MethodDescriptorProto> = AndroidMessage.newCreator(ADAPTER)
  }
}
