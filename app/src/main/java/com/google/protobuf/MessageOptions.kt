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
import com.squareup.wire.WireField
import com.squareup.wire.internal.checkElementsNotNull
import com.squareup.wire.internal.redactElements
import kotlin.Boolean
import kotlin.Int
import kotlin.collections.List
import kotlin.jvm.JvmField
import okio.ByteString

data class MessageOptions(
  /**
   * Set true to use the old proto1 MessageSet wire format for extensions.
   * This is provided for backwards-compatibility with the MessageSet wire
   * format.  You should not use this for any other reason:  It's less
   * efficient, has fewer features, and is more complicated.
   *
   * The message must be defined exactly as follows:
   *   message Foo {
   *     option message_set_wire_format = true;
   *     extensions 4 to max;
   *   }
   * Note that the message cannot have any defined fields; MessageSets only
   * have extensions.
   *
   * All extensions of your type must be singular messages; e.g. they cannot
   * be int32s, enums, or repeated messages.
   *
   * Because this is an option, the above two restrictions are not enforced by
   * the protocol compiler.
   */
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val message_set_wire_format: Boolean? = false,
  /**
   * Disables the generation of the standard "descriptor()" accessor, which can
   * conflict with a field of the same name.  This is meant to make migration
   * from proto1 easier; new code should avoid fields named "descriptor".
   */
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val no_standard_descriptor_accessor: Boolean? = false,
  /**
   * Is this message deprecated?
   * Depending on the target platform, this can emit Deprecated annotations
   * for the message, or it will be completely ignored; in the very least,
   * this is a formalization for deprecating messages.
   */
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val deprecated: Boolean? = false,
  /**
   * Whether the message is an automatically generated map entry type for the
   * maps field.
   *
   * For maps fields:
   *     map<KeyType, ValueType> map_field = 1;
   * The parsed descriptor looks like:
   *     message MapFieldEntry {
   *         option map_entry = true;
   *         optional KeyType key = 1;
   *         optional ValueType value = 2;
   *     }
   *     repeated MapFieldEntry map_field = 1;
   *
   * Implementations may choose not to generate the map_entry=true message, but
   * use a native map in the target language to hold the keys and values.
   * The reflection APIs in such implementions still need to work as
   * if the field is a repeated message field.
   *
   * NOTE: Do not set the option in .proto files. Always use the maps syntax
   * instead. The option should only be implicitly set by the proto compiler
   * parser.
   */
  @field:WireField(
    tag = 7,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val map_entry: Boolean? = null,
  /**
   * javanano_as_lite
   * The parser stores options it doesn't recognize here. See above.
   */
  @field:WireField(
    tag = 999,
    adapter = "com.google.protobuf.UninterpretedOption#ADAPTER",
    label = WireField.Label.REPEATED
  )
  @JvmField
  val uninterpreted_option: List<UninterpretedOption> = emptyList(),
  val unknownFields: ByteString = ByteString.EMPTY
) : AndroidMessage<MessageOptions, MessageOptions.Builder>(ADAPTER, unknownFields) {
  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.message_set_wire_format = message_set_wire_format
    builder.no_standard_descriptor_accessor = no_standard_descriptor_accessor
    builder.deprecated = deprecated
    builder.map_entry = map_entry
    builder.uninterpreted_option = uninterpreted_option
    builder.addUnknownFields(unknownFields())
    return builder
  }

  class Builder : Message.Builder<MessageOptions, Builder>() {
    @JvmField
    var message_set_wire_format: Boolean? = false

    @JvmField
    var no_standard_descriptor_accessor: Boolean? = false

    @JvmField
    var deprecated: Boolean? = false

    @JvmField
    var map_entry: Boolean? = null

    @JvmField
    var uninterpreted_option: List<UninterpretedOption> = emptyList()

    /**
     * Set true to use the old proto1 MessageSet wire format for extensions.
     * This is provided for backwards-compatibility with the MessageSet wire
     * format.  You should not use this for any other reason:  It's less
     * efficient, has fewer features, and is more complicated.
     *
     * The message must be defined exactly as follows:
     *   message Foo {
     *     option message_set_wire_format = true;
     *     extensions 4 to max;
     *   }
     * Note that the message cannot have any defined fields; MessageSets only
     * have extensions.
     *
     * All extensions of your type must be singular messages; e.g. they cannot
     * be int32s, enums, or repeated messages.
     *
     * Because this is an option, the above two restrictions are not enforced by
     * the protocol compiler.
     */
    fun message_set_wire_format(message_set_wire_format: Boolean): Builder {
      this.message_set_wire_format = message_set_wire_format
      return this
    }

    /**
     * Disables the generation of the standard "descriptor()" accessor, which can
     * conflict with a field of the same name.  This is meant to make migration
     * from proto1 easier; new code should avoid fields named "descriptor".
     */
    fun no_standard_descriptor_accessor(no_standard_descriptor_accessor: Boolean): Builder {
      this.no_standard_descriptor_accessor = no_standard_descriptor_accessor
      return this
    }

    /**
     * Is this message deprecated?
     * Depending on the target platform, this can emit Deprecated annotations
     * for the message, or it will be completely ignored; in the very least,
     * this is a formalization for deprecating messages.
     */
    fun deprecated(deprecated: Boolean): Builder {
      this.deprecated = deprecated
      return this
    }

    /**
     * Whether the message is an automatically generated map entry type for the
     * maps field.
     *
     * For maps fields:
     *     map<KeyType, ValueType> map_field = 1;
     * The parsed descriptor looks like:
     *     message MapFieldEntry {
     *         option map_entry = true;
     *         optional KeyType key = 1;
     *         optional ValueType value = 2;
     *     }
     *     repeated MapFieldEntry map_field = 1;
     *
     * Implementations may choose not to generate the map_entry=true message, but
     * use a native map in the target language to hold the keys and values.
     * The reflection APIs in such implementions still need to work as
     * if the field is a repeated message field.
     *
     * NOTE: Do not set the option in .proto files. Always use the maps syntax
     * instead. The option should only be implicitly set by the proto compiler
     * parser.
     */
    fun map_entry(map_entry: Boolean?): Builder {
      this.map_entry = map_entry
      return this
    }

    /**
     * javanano_as_lite
     * The parser stores options it doesn't recognize here. See above.
     */
    fun uninterpreted_option(uninterpreted_option: List<UninterpretedOption>): Builder {
      checkElementsNotNull(uninterpreted_option)
      this.uninterpreted_option = uninterpreted_option
      return this
    }

    override fun build(): MessageOptions = MessageOptions(
      message_set_wire_format = message_set_wire_format,
      no_standard_descriptor_accessor = no_standard_descriptor_accessor,
      deprecated = deprecated,
      map_entry = map_entry,
      uninterpreted_option = uninterpreted_option,
      unknownFields = buildUnknownFields()
    )
  }

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<MessageOptions> = object : ProtoAdapter<MessageOptions>(
      FieldEncoding.LENGTH_DELIMITED, 
      MessageOptions::class
    ) {
      override fun encodedSize(value: MessageOptions): Int = 
        ProtoAdapter.BOOL.encodedSizeWithTag(1, value.message_set_wire_format) +
        ProtoAdapter.BOOL.encodedSizeWithTag(2, value.no_standard_descriptor_accessor) +
        ProtoAdapter.BOOL.encodedSizeWithTag(3, value.deprecated) +
        ProtoAdapter.BOOL.encodedSizeWithTag(7, value.map_entry) +
        UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999,
            value.uninterpreted_option) +
        value.unknownFields.size

      override fun encode(writer: ProtoWriter, value: MessageOptions) {
        ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.message_set_wire_format)
        ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.no_standard_descriptor_accessor)
        ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.deprecated)
        ProtoAdapter.BOOL.encodeWithTag(writer, 7, value.map_entry)
        UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(writer, 999,
            value.uninterpreted_option)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): MessageOptions {
        var message_set_wire_format: Boolean = false
        var no_standard_descriptor_accessor: Boolean = false
        var deprecated: Boolean = false
        var map_entry: Boolean? = null
        val uninterpreted_option = mutableListOf<UninterpretedOption>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> message_set_wire_format = ProtoAdapter.BOOL.decode(reader)
            2 -> no_standard_descriptor_accessor = ProtoAdapter.BOOL.decode(reader)
            3 -> deprecated = ProtoAdapter.BOOL.decode(reader)
            7 -> map_entry = ProtoAdapter.BOOL.decode(reader)
            999 -> uninterpreted_option.add(UninterpretedOption.ADAPTER.decode(reader))
            else -> reader.readUnknownField(tag)
          }
        }
        return MessageOptions(
          message_set_wire_format = message_set_wire_format,
          no_standard_descriptor_accessor = no_standard_descriptor_accessor,
          deprecated = deprecated,
          map_entry = map_entry,
          uninterpreted_option = uninterpreted_option,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: MessageOptions): MessageOptions = value.copy(
        uninterpreted_option =
            value.uninterpreted_option.redactElements(UninterpretedOption.ADAPTER),
        unknownFields = ByteString.EMPTY
      )
    }

    @JvmField
    val CREATOR: Parcelable.Creator<MessageOptions> = AndroidMessage.newCreator(ADAPTER)
  }
}
