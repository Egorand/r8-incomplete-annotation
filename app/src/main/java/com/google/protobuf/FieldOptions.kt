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
import com.squareup.wire.WireEnum
import com.squareup.wire.WireField
import com.squareup.wire.internal.checkElementsNotNull
import com.squareup.wire.internal.redactElements
import kotlin.Boolean
import kotlin.Int
import kotlin.collections.List
import kotlin.jvm.JvmField
import kotlin.jvm.JvmStatic
import okio.ByteString

data class FieldOptions(
  /**
   * The ctype option instructs the C++ code generator to use a different
   * representation of the field than it normally would.  See the specific
   * options below.  This option is not yet implemented in the open source
   * release -- sorry, we'll try to include it in a future version!
   */
  @field:WireField(
    tag = 1,
    adapter = "com.google.protobuf.FieldOptions${'$'}CType#ADAPTER"
  )
  @JvmField
  val ctype: CType? = CType.STRING,
  /**
   * The packed option can be enabled for repeated primitive fields to enable
   * a more efficient representation on the wire. Rather than repeatedly
   * writing the tag and type for each element, the entire array is encoded as
   * a single length-delimited blob. In proto3, only explicit setting it to
   * false will avoid using packed encoding.
   */
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val packed: Boolean? = null,
  /**
   * The jstype option determines the JavaScript type used for values of the
   * field.  The option is permitted only for 64 bit integral and fixed types
   * (int64, uint64, sint64, fixed64, sfixed64).  A field with jstype JS_STRING
   * is represented as JavaScript string, which avoids loss of precision that
   * can happen when a large value is converted to a floating point JavaScript.
   * Specifying JS_NUMBER for the jstype causes the generated JavaScript code to
   * use the JavaScript "number" type.  The behavior of the default option
   * JS_NORMAL is implementation dependent.
   *
   * This option is an enum to permit additional types to be added, e.g.
   * goog.math.Integer.
   */
  @field:WireField(
    tag = 6,
    adapter = "com.google.protobuf.FieldOptions${'$'}JSType#ADAPTER"
  )
  @JvmField
  val jstype: JSType? = JSType.JS_NORMAL,
  /**
   * Should this field be parsed lazily?  Lazy applies only to message-type
   * fields.  It means that when the outer message is initially parsed, the
   * inner message's contents will not be parsed but instead stored in encoded
   * form.  The inner message will actually be parsed when it is first accessed.
   *
   * This is only a hint.  Implementations are free to choose whether to use
   * eager or lazy parsing regardless of the value of this option.  However,
   * setting this option true suggests that the protocol author believes that
   * using lazy parsing on this field is worth the additional bookkeeping
   * overhead typically needed to implement it.
   *
   * This option does not affect the public interface of any generated code;
   * all method signatures remain the same.  Furthermore, thread-safety of the
   * interface is not affected by this option; const methods remain safe to
   * call from multiple threads concurrently, while non-const methods continue
   * to require exclusive access.
   *
   *
   * Note that implementations may choose not to check required fields within
   * a lazy sub-message.  That is, calling IsInitialized() on the outer message
   * may return true even if the inner message has missing required fields.
   * This is necessary because otherwise the inner message would have to be
   * parsed in order to perform the check, defeating the purpose of lazy
   * parsing.  An implementation which chooses not to check required fields
   * must be consistent about it.  That is, for any particular sub-message, the
   * implementation must either *always* check its required fields, or *never*
   * check its required fields, regardless of whether or not the message has
   * been parsed.
   */
  @field:WireField(
    tag = 5,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val lazy: Boolean? = false,
  /**
   * Is this field deprecated?
   * Depending on the target platform, this can emit Deprecated annotations
   * for accessors, or it will be completely ignored; in the very least, this
   * is a formalization for deprecating fields.
   */
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val deprecated: Boolean? = false,
  /**
   * For Google-internal migration only. Do not use.
   */
  @field:WireField(
    tag = 10,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val weak: Boolean? = false,
  /**
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
) : AndroidMessage<FieldOptions, FieldOptions.Builder>(ADAPTER, unknownFields) {
  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.ctype = ctype
    builder.packed = packed
    builder.jstype = jstype
    builder.lazy = lazy
    builder.deprecated = deprecated
    builder.weak = weak
    builder.uninterpreted_option = uninterpreted_option
    builder.addUnknownFields(unknownFields())
    return builder
  }

  class Builder : Message.Builder<FieldOptions, Builder>() {
    @JvmField
    var ctype: CType? = CType.STRING

    @JvmField
    var packed: Boolean? = null

    @JvmField
    var jstype: JSType? = JSType.JS_NORMAL

    @JvmField
    var lazy: Boolean? = false

    @JvmField
    var deprecated: Boolean? = false

    @JvmField
    var weak: Boolean? = false

    @JvmField
    var uninterpreted_option: List<UninterpretedOption> = emptyList()

    /**
     * The ctype option instructs the C++ code generator to use a different
     * representation of the field than it normally would.  See the specific
     * options below.  This option is not yet implemented in the open source
     * release -- sorry, we'll try to include it in a future version!
     */
    fun ctype(ctype: CType): Builder {
      this.ctype = ctype
      return this
    }

    /**
     * The packed option can be enabled for repeated primitive fields to enable
     * a more efficient representation on the wire. Rather than repeatedly
     * writing the tag and type for each element, the entire array is encoded as
     * a single length-delimited blob. In proto3, only explicit setting it to
     * false will avoid using packed encoding.
     */
    fun packed(packed: Boolean?): Builder {
      this.packed = packed
      return this
    }

    /**
     * The jstype option determines the JavaScript type used for values of the
     * field.  The option is permitted only for 64 bit integral and fixed types
     * (int64, uint64, sint64, fixed64, sfixed64).  A field with jstype JS_STRING
     * is represented as JavaScript string, which avoids loss of precision that
     * can happen when a large value is converted to a floating point JavaScript.
     * Specifying JS_NUMBER for the jstype causes the generated JavaScript code to
     * use the JavaScript "number" type.  The behavior of the default option
     * JS_NORMAL is implementation dependent.
     *
     * This option is an enum to permit additional types to be added, e.g.
     * goog.math.Integer.
     */
    fun jstype(jstype: JSType): Builder {
      this.jstype = jstype
      return this
    }

    /**
     * Should this field be parsed lazily?  Lazy applies only to message-type
     * fields.  It means that when the outer message is initially parsed, the
     * inner message's contents will not be parsed but instead stored in encoded
     * form.  The inner message will actually be parsed when it is first accessed.
     *
     * This is only a hint.  Implementations are free to choose whether to use
     * eager or lazy parsing regardless of the value of this option.  However,
     * setting this option true suggests that the protocol author believes that
     * using lazy parsing on this field is worth the additional bookkeeping
     * overhead typically needed to implement it.
     *
     * This option does not affect the public interface of any generated code;
     * all method signatures remain the same.  Furthermore, thread-safety of the
     * interface is not affected by this option; const methods remain safe to
     * call from multiple threads concurrently, while non-const methods continue
     * to require exclusive access.
     *
     *
     * Note that implementations may choose not to check required fields within
     * a lazy sub-message.  That is, calling IsInitialized() on the outer message
     * may return true even if the inner message has missing required fields.
     * This is necessary because otherwise the inner message would have to be
     * parsed in order to perform the check, defeating the purpose of lazy
     * parsing.  An implementation which chooses not to check required fields
     * must be consistent about it.  That is, for any particular sub-message, the
     * implementation must either *always* check its required fields, or *never*
     * check its required fields, regardless of whether or not the message has
     * been parsed.
     */
    fun lazy(lazy: Boolean): Builder {
      this.lazy = lazy
      return this
    }

    /**
     * Is this field deprecated?
     * Depending on the target platform, this can emit Deprecated annotations
     * for accessors, or it will be completely ignored; in the very least, this
     * is a formalization for deprecating fields.
     */
    fun deprecated(deprecated: Boolean): Builder {
      this.deprecated = deprecated
      return this
    }

    /**
     * For Google-internal migration only. Do not use.
     */
    fun weak(weak: Boolean): Builder {
      this.weak = weak
      return this
    }

    /**
     * The parser stores options it doesn't recognize here. See above.
     */
    fun uninterpreted_option(uninterpreted_option: List<UninterpretedOption>): Builder {
      checkElementsNotNull(uninterpreted_option)
      this.uninterpreted_option = uninterpreted_option
      return this
    }

    override fun build(): FieldOptions = FieldOptions(
      ctype = ctype,
      packed = packed,
      jstype = jstype,
      lazy = lazy,
      deprecated = deprecated,
      weak = weak,
      uninterpreted_option = uninterpreted_option,
      unknownFields = buildUnknownFields()
    )
  }

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<FieldOptions> = object : ProtoAdapter<FieldOptions>(
      FieldEncoding.LENGTH_DELIMITED, 
      FieldOptions::class
    ) {
      override fun encodedSize(value: FieldOptions): Int = 
        CType.ADAPTER.encodedSizeWithTag(1, value.ctype) +
        ProtoAdapter.BOOL.encodedSizeWithTag(2, value.packed) +
        JSType.ADAPTER.encodedSizeWithTag(6, value.jstype) +
        ProtoAdapter.BOOL.encodedSizeWithTag(5, value.lazy) +
        ProtoAdapter.BOOL.encodedSizeWithTag(3, value.deprecated) +
        ProtoAdapter.BOOL.encodedSizeWithTag(10, value.weak) +
        UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999,
            value.uninterpreted_option) +
        value.unknownFields.size

      override fun encode(writer: ProtoWriter, value: FieldOptions) {
        CType.ADAPTER.encodeWithTag(writer, 1, value.ctype)
        ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.packed)
        JSType.ADAPTER.encodeWithTag(writer, 6, value.jstype)
        ProtoAdapter.BOOL.encodeWithTag(writer, 5, value.lazy)
        ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.deprecated)
        ProtoAdapter.BOOL.encodeWithTag(writer, 10, value.weak)
        UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(writer, 999,
            value.uninterpreted_option)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): FieldOptions {
        var ctype: CType = CType.STRING
        var packed: Boolean? = null
        var jstype: JSType = JSType.JS_NORMAL
        var lazy: Boolean = false
        var deprecated: Boolean = false
        var weak: Boolean = false
        val uninterpreted_option = mutableListOf<UninterpretedOption>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> ctype = CType.ADAPTER.decode(reader)
            2 -> packed = ProtoAdapter.BOOL.decode(reader)
            6 -> jstype = JSType.ADAPTER.decode(reader)
            5 -> lazy = ProtoAdapter.BOOL.decode(reader)
            3 -> deprecated = ProtoAdapter.BOOL.decode(reader)
            10 -> weak = ProtoAdapter.BOOL.decode(reader)
            999 -> uninterpreted_option.add(UninterpretedOption.ADAPTER.decode(reader))
            else -> reader.readUnknownField(tag)
          }
        }
        return FieldOptions(
          ctype = ctype,
          packed = packed,
          jstype = jstype,
          lazy = lazy,
          deprecated = deprecated,
          weak = weak,
          uninterpreted_option = uninterpreted_option,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: FieldOptions): FieldOptions = value.copy(
        uninterpreted_option =
            value.uninterpreted_option.redactElements(UninterpretedOption.ADAPTER),
        unknownFields = ByteString.EMPTY
      )
    }

    @JvmField
    val CREATOR: Parcelable.Creator<FieldOptions> = AndroidMessage.newCreator(ADAPTER)
  }

  enum class CType(
    override val value: Int
  ) : WireEnum {
    /**
     * Default mode.
     */
    STRING(0),

    CORD(1),

    STRING_PIECE(2);

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<CType> = object : EnumAdapter<CType>(
        CType::class
      ) {
        override fun fromValue(value: Int): CType = CType.fromValue(value)
      }

      @JvmStatic
      fun fromValue(value: Int): CType = when (value) {
        0 -> STRING
        1 -> CORD
        2 -> STRING_PIECE
        else -> throw IllegalArgumentException("""Unexpected value: $value""")
      }
    }
  }

  enum class JSType(
    override val value: Int
  ) : WireEnum {
    /**
     * Use the default type.
     */
    JS_NORMAL(0),

    /**
     * Use JavaScript strings.
     */
    JS_STRING(1),

    /**
     * Use JavaScript numbers.
     */
    JS_NUMBER(2);

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<JSType> = object : EnumAdapter<JSType>(
        JSType::class
      ) {
        override fun fromValue(value: Int): JSType = JSType.fromValue(value)
      }

      @JvmStatic
      fun fromValue(value: Int): JSType = when (value) {
        0 -> JS_NORMAL
        1 -> JS_STRING
        2 -> JS_NUMBER
        else -> throw IllegalArgumentException("""Unexpected value: $value""")
      }
    }
  }
}
