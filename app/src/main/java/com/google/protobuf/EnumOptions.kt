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

data class EnumOptions(
  /**
   * Set this option to true to allow mapping different tag names to the same
   * value.
   */
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val allow_alias: Boolean? = null,
  /**
   * Is this enum deprecated?
   * Depending on the target platform, this can emit Deprecated annotations
   * for the enum, or it will be completely ignored; in the very least, this
   * is a formalization for deprecating enums.
   */
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val deprecated: Boolean? = false,
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
) : AndroidMessage<EnumOptions, EnumOptions.Builder>(ADAPTER, unknownFields) {
  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.allow_alias = allow_alias
    builder.deprecated = deprecated
    builder.uninterpreted_option = uninterpreted_option
    builder.addUnknownFields(unknownFields())
    return builder
  }

  class Builder : Message.Builder<EnumOptions, Builder>() {
    @JvmField
    var allow_alias: Boolean? = null

    @JvmField
    var deprecated: Boolean? = false

    @JvmField
    var uninterpreted_option: List<UninterpretedOption> = emptyList()

    /**
     * Set this option to true to allow mapping different tag names to the same
     * value.
     */
    fun allow_alias(allow_alias: Boolean?): Builder {
      this.allow_alias = allow_alias
      return this
    }

    /**
     * Is this enum deprecated?
     * Depending on the target platform, this can emit Deprecated annotations
     * for the enum, or it will be completely ignored; in the very least, this
     * is a formalization for deprecating enums.
     */
    fun deprecated(deprecated: Boolean): Builder {
      this.deprecated = deprecated
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

    override fun build(): EnumOptions = EnumOptions(
      allow_alias = allow_alias,
      deprecated = deprecated,
      uninterpreted_option = uninterpreted_option,
      unknownFields = buildUnknownFields()
    )
  }

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<EnumOptions> = object : ProtoAdapter<EnumOptions>(
      FieldEncoding.LENGTH_DELIMITED, 
      EnumOptions::class
    ) {
      override fun encodedSize(value: EnumOptions): Int = 
        ProtoAdapter.BOOL.encodedSizeWithTag(2, value.allow_alias) +
        ProtoAdapter.BOOL.encodedSizeWithTag(3, value.deprecated) +
        UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999,
            value.uninterpreted_option) +
        value.unknownFields.size

      override fun encode(writer: ProtoWriter, value: EnumOptions) {
        ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.allow_alias)
        ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.deprecated)
        UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(writer, 999,
            value.uninterpreted_option)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): EnumOptions {
        var allow_alias: Boolean? = null
        var deprecated: Boolean = false
        val uninterpreted_option = mutableListOf<UninterpretedOption>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            2 -> allow_alias = ProtoAdapter.BOOL.decode(reader)
            3 -> deprecated = ProtoAdapter.BOOL.decode(reader)
            999 -> uninterpreted_option.add(UninterpretedOption.ADAPTER.decode(reader))
            else -> reader.readUnknownField(tag)
          }
        }
        return EnumOptions(
          allow_alias = allow_alias,
          deprecated = deprecated,
          uninterpreted_option = uninterpreted_option,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: EnumOptions): EnumOptions = value.copy(
        uninterpreted_option =
            value.uninterpreted_option.redactElements(UninterpretedOption.ADAPTER),
        unknownFields = ByteString.EMPTY
      )
    }

    @JvmField
    val CREATOR: Parcelable.Creator<EnumOptions> = AndroidMessage.newCreator(ADAPTER)
  }
}
