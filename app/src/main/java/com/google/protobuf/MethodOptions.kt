// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: google/protobuf/descriptor.proto
package com.google.protobuf

import android.os.Parcelable
import com.squareup.wire.AndroidMessage
import com.squareup.wire.EnumAdapter
import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.TagHandler
import com.squareup.wire.WireEnum
import com.squareup.wire.WireField
import com.squareup.wire.internal.Internal
import kotlin.Boolean
import kotlin.Int
import kotlin.collections.List
import kotlin.jvm.JvmField
import kotlin.jvm.JvmStatic
import okio.ByteString

data class MethodOptions(
  /**
   * Note:  Field numbers 1 through 32 are reserved for Google's internal RPC
   *   framework.  We apologize for hoarding these numbers to ourselves, but
   *   we were already using them long before we decided to release Protocol
   *   Buffers.
   * Is this method deprecated?
   * Depending on the target platform, this can emit Deprecated annotations
   * for the method, or it will be completely ignored; in the very least,
   * this is a formalization for deprecating methods.
   */
  @field:WireField(tag = 33, adapter = "com.squareup.wire.ProtoAdapter#BOOL") @JvmField
      val deprecated: Boolean? = false,
  @field:WireField(tag = 34, adapter = "com.google.protobuf.MethodOptions.IdempotencyLevel#ADAPTER")
      @JvmField val idempotency_level: IdempotencyLevel? = IdempotencyLevel.IDEMPOTENCY_UNKNOWN,
  /**
   * The parser stores options it doesn't recognize here. See above.
   */
  @field:WireField(tag = 999, adapter = "com.google.protobuf.UninterpretedOption#ADAPTER") @JvmField
      val uninterpreted_option: List<UninterpretedOption> = emptyList(),
  val unknownFields: ByteString = ByteString.EMPTY
) : AndroidMessage<MethodOptions, MethodOptions.Builder>(ADAPTER, unknownFields) {
  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.deprecated = deprecated
    builder.idempotency_level = idempotency_level
    builder.uninterpreted_option = uninterpreted_option
    builder.addUnknownFields(unknownFields())
    return builder
  }

  class Builder : Message.Builder<MethodOptions, Builder>() {
    @JvmField
    var deprecated: Boolean? = false

    @JvmField
    var idempotency_level: IdempotencyLevel? = IdempotencyLevel.IDEMPOTENCY_UNKNOWN

    @JvmField
    var uninterpreted_option: List<UninterpretedOption> = emptyList()

    /**
     * Note:  Field numbers 1 through 32 are reserved for Google's internal RPC
     *   framework.  We apologize for hoarding these numbers to ourselves, but
     *   we were already using them long before we decided to release Protocol
     *   Buffers.
     * Is this method deprecated?
     * Depending on the target platform, this can emit Deprecated annotations
     * for the method, or it will be completely ignored; in the very least,
     * this is a formalization for deprecating methods.
     */
    fun deprecated(deprecated: Boolean): Builder {
      this.deprecated = deprecated
      return this
    }

    fun idempotency_level(idempotency_level: IdempotencyLevel): Builder {
      this.idempotency_level = idempotency_level
      return this
    }

    /**
     * The parser stores options it doesn't recognize here. See above.
     */
    fun uninterpreted_option(uninterpreted_option: List<UninterpretedOption>): Builder {
      Internal.checkElementsNotNull(uninterpreted_option)
      this.uninterpreted_option = uninterpreted_option
      return this
    }

    override fun build(): MethodOptions = MethodOptions(
      deprecated = deprecated,
      idempotency_level = idempotency_level,
      uninterpreted_option = uninterpreted_option,
      unknownFields = buildUnknownFields()
    )
  }

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<MethodOptions> = object : ProtoAdapter<MethodOptions>(
      FieldEncoding.LENGTH_DELIMITED, 
      MethodOptions::class.java
    ) {
      override fun encodedSize(value: MethodOptions): Int = 
        ProtoAdapter.BOOL.encodedSizeWithTag(33, value.deprecated) +
        IdempotencyLevel.ADAPTER.encodedSizeWithTag(34, value.idempotency_level) +
        UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999,
            value.uninterpreted_option) +
        value.unknownFields.size

      override fun encode(writer: ProtoWriter, value: MethodOptions) {
        ProtoAdapter.BOOL.encodeWithTag(writer, 33, value.deprecated)
        IdempotencyLevel.ADAPTER.encodeWithTag(writer, 34, value.idempotency_level)
        UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(writer, 999,
            value.uninterpreted_option)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): MethodOptions {
        var deprecated: Boolean = false
        var idempotency_level: IdempotencyLevel = IdempotencyLevel.IDEMPOTENCY_UNKNOWN
        val uninterpreted_option = mutableListOf<UninterpretedOption>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            33 -> deprecated = ProtoAdapter.BOOL.decode(reader)
            34 -> idempotency_level = IdempotencyLevel.ADAPTER.decode(reader)
            999 -> uninterpreted_option.add(UninterpretedOption.ADAPTER.decode(reader))
            else -> TagHandler.UNKNOWN_TAG
          }
        }
        return MethodOptions(
          deprecated = deprecated,
          idempotency_level = idempotency_level,
          uninterpreted_option = uninterpreted_option,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: MethodOptions): MethodOptions? = value.copy(
        uninterpreted_option = value.uninterpreted_option.also { Internal.redactElements(it,
            UninterpretedOption.ADAPTER) },
        unknownFields = ByteString.EMPTY
      )
    }

    @JvmField
    val CREATOR: Parcelable.Creator<MethodOptions> = AndroidMessage.newCreator(ADAPTER)
  }

  /**
   * Is this method side-effect-free (or safe in HTTP parlance), or idempotent,
   * or neither? HTTP based RPC implementation may choose GET verb for safe
   * methods, and PUT verb for idempotent methods instead of the default POST.
   */
  enum class IdempotencyLevel(private val value: Int) : WireEnum {
    IDEMPOTENCY_UNKNOWN(0),

    /**
     * implies idempotent
     */
    NO_SIDE_EFFECTS(1),

    /**
     * idempotent, but may have side effects
     */
    IDEMPOTENT(2);

    override fun getValue(): Int = value

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<IdempotencyLevel> = object : EnumAdapter<IdempotencyLevel>(
        IdempotencyLevel::class.java
      ) {
        override fun fromValue(value: Int): IdempotencyLevel = IdempotencyLevel.fromValue(value)
      }

      @JvmStatic
      fun fromValue(value: Int): IdempotencyLevel = when (value) {
        0 -> IDEMPOTENCY_UNKNOWN
        1 -> NO_SIDE_EFFECTS
        2 -> IDEMPOTENT
        else -> throw IllegalArgumentException("""Unexpected value: $value""")
      }
    }
  }
}
