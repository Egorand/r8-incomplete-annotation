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
import com.squareup.wire.internal.Internal
import kotlin.Int
import kotlin.collections.List
import kotlin.jvm.JvmField
import okio.ByteString

data class ExtensionRangeOptions(
  /**
   * The parser stores options it doesn't recognize here. See above.
   */
  @field:WireField(tag = 999, adapter = "com.google.protobuf.UninterpretedOption#ADAPTER") @JvmField
      val uninterpreted_option: List<UninterpretedOption> = emptyList(),
  val unknownFields: ByteString = ByteString.EMPTY
) : AndroidMessage<ExtensionRangeOptions, ExtensionRangeOptions.Builder>(ADAPTER, unknownFields) {
  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.uninterpreted_option = uninterpreted_option
    builder.addUnknownFields(unknownFields())
    return builder
  }

  class Builder : Message.Builder<ExtensionRangeOptions, Builder>() {
    @JvmField
    var uninterpreted_option: List<UninterpretedOption> = emptyList()

    /**
     * The parser stores options it doesn't recognize here. See above.
     */
    fun uninterpreted_option(uninterpreted_option: List<UninterpretedOption>): Builder {
      Internal.checkElementsNotNull(uninterpreted_option)
      this.uninterpreted_option = uninterpreted_option
      return this
    }

    override fun build(): ExtensionRangeOptions = ExtensionRangeOptions(
      uninterpreted_option = uninterpreted_option,
      unknownFields = buildUnknownFields()
    )
  }

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<ExtensionRangeOptions> = object : ProtoAdapter<ExtensionRangeOptions>(
      FieldEncoding.LENGTH_DELIMITED, 
      ExtensionRangeOptions::class.java
    ) {
      override fun encodedSize(value: ExtensionRangeOptions): Int = 
        UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999,
            value.uninterpreted_option) +
        value.unknownFields.size

      override fun encode(writer: ProtoWriter, value: ExtensionRangeOptions) {
        UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(writer, 999,
            value.uninterpreted_option)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): ExtensionRangeOptions {
        val uninterpreted_option = mutableListOf<UninterpretedOption>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            999 -> uninterpreted_option.add(UninterpretedOption.ADAPTER.decode(reader))
            else -> TagHandler.UNKNOWN_TAG
          }
        }
        return ExtensionRangeOptions(
          uninterpreted_option = uninterpreted_option,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: ExtensionRangeOptions): ExtensionRangeOptions? = value.copy(
        uninterpreted_option = value.uninterpreted_option.also { Internal.redactElements(it,
            UninterpretedOption.ADAPTER) },
        unknownFields = ByteString.EMPTY
      )
    }

    @JvmField
    val CREATOR: Parcelable.Creator<ExtensionRangeOptions> = AndroidMessage.newCreator(ADAPTER)
  }
}
