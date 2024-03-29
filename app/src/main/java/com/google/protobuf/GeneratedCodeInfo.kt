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
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.jvm.JvmField
import okio.ByteString

/**
 * Describes the relationship between generated code and its original source
 * file. A GeneratedCodeInfo message is associated with only one generated
 * source file, but may contain references to different source .proto files.
 */
data class GeneratedCodeInfo(
  /**
   * An Annotation connects some span of text in generated code to an element
   * of its generating .proto file.
   */
  @field:WireField(
    tag = 1,
    adapter = "com.google.protobuf.GeneratedCodeInfo${'$'}Annotation#ADAPTER",
    label = WireField.Label.REPEATED
  )
  @JvmField
  val annotation: List<Annotation> = emptyList(),
  val unknownFields: ByteString = ByteString.EMPTY
) : AndroidMessage<GeneratedCodeInfo, GeneratedCodeInfo.Builder>(ADAPTER, unknownFields) {
  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.annotation = annotation
    builder.addUnknownFields(unknownFields())
    return builder
  }

  class Builder : Message.Builder<GeneratedCodeInfo, Builder>() {
    @JvmField
    var annotation: List<Annotation> = emptyList()

    /**
     * An Annotation connects some span of text in generated code to an element
     * of its generating .proto file.
     */
    fun annotation(annotation: List<Annotation>): Builder {
      checkElementsNotNull(annotation)
      this.annotation = annotation
      return this
    }

    override fun build(): GeneratedCodeInfo = GeneratedCodeInfo(
      annotation = annotation,
      unknownFields = buildUnknownFields()
    )
  }

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<GeneratedCodeInfo> = object : ProtoAdapter<GeneratedCodeInfo>(
      FieldEncoding.LENGTH_DELIMITED, 
      GeneratedCodeInfo::class
    ) {
      override fun encodedSize(value: GeneratedCodeInfo): Int = 
        Annotation.ADAPTER.asRepeated().encodedSizeWithTag(1, value.annotation) +
        value.unknownFields.size

      override fun encode(writer: ProtoWriter, value: GeneratedCodeInfo) {
        Annotation.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.annotation)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): GeneratedCodeInfo {
        val annotation = mutableListOf<Annotation>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> annotation.add(Annotation.ADAPTER.decode(reader))
            else -> reader.readUnknownField(tag)
          }
        }
        return GeneratedCodeInfo(
          annotation = annotation,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: GeneratedCodeInfo): GeneratedCodeInfo = value.copy(
        annotation = value.annotation.redactElements(Annotation.ADAPTER),
        unknownFields = ByteString.EMPTY
      )
    }

    @JvmField
    val CREATOR: Parcelable.Creator<GeneratedCodeInfo> = AndroidMessage.newCreator(ADAPTER)
  }

  data class Annotation(
    /**
     * Identifies the element in the original source .proto file. This field
     * is formatted the same as SourceCodeInfo.Location.path.
     */
    @field:WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT32",
      label = WireField.Label.PACKED
    )
    @JvmField
    val path: List<Int> = emptyList(),
    /**
     * Identifies the filesystem path to the original source .proto.
     */
    @field:WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
    )
    @JvmField
    val source_file: String? = null,
    /**
     * Identifies the starting offset in bytes in the generated code
     * that relates to the identified object.
     */
    @field:WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
    )
    @JvmField
    val begin: Int? = null,
    /**
     * Identifies the ending offset in bytes in the generated code that
     * relates to the identified offset. The end offset should be one past
     * the last relevant byte (so the length of the text = end - begin).
     */
    @field:WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
    )
    @JvmField
    val end: Int? = null,
    val unknownFields: ByteString = ByteString.EMPTY
  ) : AndroidMessage<Annotation, Annotation.Builder>(ADAPTER, unknownFields) {
    override fun newBuilder(): Builder {
      val builder = Builder()
      builder.path = path
      builder.source_file = source_file
      builder.begin = begin
      builder.end = end
      builder.addUnknownFields(unknownFields())
      return builder
    }

    class Builder : Message.Builder<Annotation, Builder>() {
      @JvmField
      var path: List<Int> = emptyList()

      @JvmField
      var source_file: String? = null

      @JvmField
      var begin: Int? = null

      @JvmField
      var end: Int? = null

      /**
       * Identifies the element in the original source .proto file. This field
       * is formatted the same as SourceCodeInfo.Location.path.
       */
      fun path(path: List<Int>): Builder {
        checkElementsNotNull(path)
        this.path = path
        return this
      }

      /**
       * Identifies the filesystem path to the original source .proto.
       */
      fun source_file(source_file: String?): Builder {
        this.source_file = source_file
        return this
      }

      /**
       * Identifies the starting offset in bytes in the generated code
       * that relates to the identified object.
       */
      fun begin(begin: Int?): Builder {
        this.begin = begin
        return this
      }

      /**
       * Identifies the ending offset in bytes in the generated code that
       * relates to the identified offset. The end offset should be one past
       * the last relevant byte (so the length of the text = end - begin).
       */
      fun end(end: Int?): Builder {
        this.end = end
        return this
      }

      override fun build(): Annotation = Annotation(
        path = path,
        source_file = source_file,
        begin = begin,
        end = end,
        unknownFields = buildUnknownFields()
      )
    }

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<Annotation> = object : ProtoAdapter<Annotation>(
        FieldEncoding.LENGTH_DELIMITED, 
        Annotation::class
      ) {
        override fun encodedSize(value: Annotation): Int = 
          ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(1, value.path) +
          ProtoAdapter.STRING.encodedSizeWithTag(2, value.source_file) +
          ProtoAdapter.INT32.encodedSizeWithTag(3, value.begin) +
          ProtoAdapter.INT32.encodedSizeWithTag(4, value.end) +
          value.unknownFields.size

        override fun encode(writer: ProtoWriter, value: Annotation) {
          ProtoAdapter.INT32.asRepeated().encodeWithTag(writer, 1, value.path)
          ProtoAdapter.STRING.encodeWithTag(writer, 2, value.source_file)
          ProtoAdapter.INT32.encodeWithTag(writer, 3, value.begin)
          ProtoAdapter.INT32.encodeWithTag(writer, 4, value.end)
          writer.writeBytes(value.unknownFields)
        }

        override fun decode(reader: ProtoReader): Annotation {
          val path = mutableListOf<Int>()
          var source_file: String? = null
          var begin: Int? = null
          var end: Int? = null
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              1 -> path.add(ProtoAdapter.INT32.decode(reader))
              2 -> source_file = ProtoAdapter.STRING.decode(reader)
              3 -> begin = ProtoAdapter.INT32.decode(reader)
              4 -> end = ProtoAdapter.INT32.decode(reader)
              else -> reader.readUnknownField(tag)
            }
          }
          return Annotation(
            path = path,
            source_file = source_file,
            begin = begin,
            end = end,
            unknownFields = unknownFields
          )
        }

        override fun redact(value: Annotation): Annotation = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }

      @JvmField
      val CREATOR: Parcelable.Creator<Annotation> = AndroidMessage.newCreator(ADAPTER)
    }
  }
}
