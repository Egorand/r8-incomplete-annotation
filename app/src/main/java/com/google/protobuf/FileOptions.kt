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
import kotlin.Deprecated
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.jvm.JvmField
import kotlin.jvm.JvmStatic
import okio.ByteString

/**
 * ===================================================================
 * Options
 * Each of the definitions above may have "options" attached.  These are
 * just annotations which may cause code to be generated slightly differently
 * or may contain hints for code that manipulates protocol messages.
 *
 * Clients may define custom options as extensions of the *Options messages.
 * These extensions may not yet be known at parsing time, so the parser cannot
 * store the values in them.  Instead it stores them in a field in the *Options
 * message called uninterpreted_option. This field must have the same name
 * across all *Options messages. We then use this field to populate the
 * extensions when we build a descriptor, at which point all protos have been
 * parsed and so all extensions are known.
 *
 * Extension numbers for custom options may be chosen as follows:
 * * For options which will only be used within a single application or
 *   organization, or for experimental options, use field numbers 50000
 *   through 99999.  It is up to you to ensure that you do not use the
 *   same number for multiple options.
 * * For options which will be published and used publicly by multiple
 *   independent entities, e-mail protobuf-global-extension-registry@google.com
 *   to reserve extension numbers. Simply provide your project name (e.g.
 *   Objective-C plugin) and your project website (if available) -- there's no
 *   need to explain how you intend to use them. Usually you only need one
 *   extension number. You can declare multiple options with only one extension
 *   number by putting them in a sub-message. See the Custom Options section of
 *   the docs for examples:
 *   https://developers.google.com/protocol-buffers/docs/proto#options
 *   If this turns out to be popular, a web service will be set up
 *   to automatically assign option numbers.
 */
data class FileOptions(
  /**
   * Sets the Java package where classes generated from this .proto will be
   * placed.  By default, the proto package is used, but this is often
   * inappropriate because proto packages do not normally start with backwards
   * domain names.
   */
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @JvmField
  val java_package: String? = null,
  /**
   * If set, all the classes from the .proto file are wrapped in a single
   * outer class with the given name.  This applies to both Proto1
   * (equivalent to the old "--one_java_file" option) and Proto2 (where
   * a .proto always translates to a single class, but you may want to
   * explicitly choose the class name).
   */
  @field:WireField(
    tag = 8,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @JvmField
  val java_outer_classname: String? = null,
  /**
   * If set true, then the Java code generator will generate a separate .java
   * file for each top-level message, enum, and service defined in the .proto
   * file.  Thus, these types will *not* be nested inside the outer class
   * named by java_outer_classname.  However, the outer class will still be
   * generated to contain the file's getDescriptor() method as well as any
   * top-level extensions defined in the file.
   */
  @field:WireField(
    tag = 10,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val java_multiple_files: Boolean? = false,
  /**
   * This option does nothing.
   */
  @Deprecated(message = "java_generate_equals_and_hash is deprecated")
  @field:WireField(
    tag = 20,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val java_generate_equals_and_hash: Boolean? = null,
  /**
   * If set true, then the Java2 code generator will generate code that
   * throws an exception whenever an attempt is made to assign a non-UTF-8
   * byte sequence to a string field.
   * Message reflection will do the same.
   * However, an extension field still accepts non-UTF-8 byte sequences.
   * This option has no effect on when used with the lite runtime.
   */
  @field:WireField(
    tag = 27,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val java_string_check_utf8: Boolean? = false,
  @field:WireField(
    tag = 9,
    adapter = "com.google.protobuf.FileOptions${'$'}OptimizeMode#ADAPTER"
  )
  @JvmField
  val optimize_for: OptimizeMode? = OptimizeMode.SPEED,
  /**
   * Sets the Go package where structs generated from this .proto will be
   * placed. If omitted, the Go package will be derived from the following:
   *   - The basename of the package import path, if provided.
   *   - Otherwise, the package statement in the .proto file, if present.
   *   - Otherwise, the basename of the .proto file, without extension.
   */
  @field:WireField(
    tag = 11,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @JvmField
  val go_package: String? = null,
  /**
   * Should generic services be generated in each language?  "Generic" services
   * are not specific to any particular RPC system.  They are generated by the
   * main code generators in each language (without additional plugins).
   * Generic services were the only kind of service generation supported by
   * early versions of google.protobuf.
   *
   * Generic services are now considered deprecated in favor of using plugins
   * that generate code specific to your particular RPC system.  Therefore,
   * these default to false.  Old code which depends on generic services should
   * explicitly set them to true.
   */
  @field:WireField(
    tag = 16,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val cc_generic_services: Boolean? = false,
  @field:WireField(
    tag = 17,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val java_generic_services: Boolean? = false,
  @field:WireField(
    tag = 18,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val py_generic_services: Boolean? = false,
  @field:WireField(
    tag = 42,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val php_generic_services: Boolean? = false,
  /**
   * Is this file deprecated?
   * Depending on the target platform, this can emit Deprecated annotations
   * for everything in the file, or it will be completely ignored; in the very
   * least, this is a formalization for deprecating files.
   */
  @field:WireField(
    tag = 23,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val deprecated: Boolean? = false,
  /**
   * Enables the use of arenas for the proto messages in this file. This applies
   * only to generated classes for C++.
   */
  @field:WireField(
    tag = 31,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val cc_enable_arenas: Boolean? = false,
  /**
   * Sets the objective c class prefix which is prepended to all objective c
   * generated classes from this .proto. There is no default.
   */
  @field:WireField(
    tag = 36,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @JvmField
  val objc_class_prefix: String? = null,
  /**
   * Namespace for generated classes; defaults to the package.
   */
  @field:WireField(
    tag = 37,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @JvmField
  val csharp_namespace: String? = null,
  /**
   * By default Swift generators will take the proto package and CamelCase it
   * replacing '.' with underscore and use that to prefix the types/symbols
   * defined. When this options is provided, they will use this value instead
   * to prefix the types/symbols defined.
   */
  @field:WireField(
    tag = 39,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @JvmField
  val swift_prefix: String? = null,
  /**
   * Sets the php class prefix which is prepended to all php generated classes
   * from this .proto. Default is empty.
   */
  @field:WireField(
    tag = 40,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @JvmField
  val php_class_prefix: String? = null,
  /**
   * Use this option to change the namespace of php generated classes. Default
   * is empty. When this option is empty, the package name will be used for
   * determining the namespace.
   */
  @field:WireField(
    tag = 41,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @JvmField
  val php_namespace: String? = null,
  /**
   * The parser stores options it doesn't recognize here.
   * See the documentation for the "Options" section above.
   */
  @field:WireField(
    tag = 999,
    adapter = "com.google.protobuf.UninterpretedOption#ADAPTER",
    label = WireField.Label.REPEATED
  )
  @JvmField
  val uninterpreted_option: List<UninterpretedOption> = emptyList(),
  val unknownFields: ByteString = ByteString.EMPTY
) : AndroidMessage<FileOptions, FileOptions.Builder>(ADAPTER, unknownFields) {
  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.java_package = java_package
    builder.java_outer_classname = java_outer_classname
    builder.java_multiple_files = java_multiple_files
    builder.java_generate_equals_and_hash = java_generate_equals_and_hash
    builder.java_string_check_utf8 = java_string_check_utf8
    builder.optimize_for = optimize_for
    builder.go_package = go_package
    builder.cc_generic_services = cc_generic_services
    builder.java_generic_services = java_generic_services
    builder.py_generic_services = py_generic_services
    builder.php_generic_services = php_generic_services
    builder.deprecated = deprecated
    builder.cc_enable_arenas = cc_enable_arenas
    builder.objc_class_prefix = objc_class_prefix
    builder.csharp_namespace = csharp_namespace
    builder.swift_prefix = swift_prefix
    builder.php_class_prefix = php_class_prefix
    builder.php_namespace = php_namespace
    builder.uninterpreted_option = uninterpreted_option
    builder.addUnknownFields(unknownFields())
    return builder
  }

  class Builder : Message.Builder<FileOptions, Builder>() {
    @JvmField
    var java_package: String? = null

    @JvmField
    var java_outer_classname: String? = null

    @JvmField
    var java_multiple_files: Boolean? = false

    @JvmField
    var java_generate_equals_and_hash: Boolean? = null

    @JvmField
    var java_string_check_utf8: Boolean? = false

    @JvmField
    var optimize_for: OptimizeMode? = OptimizeMode.SPEED

    @JvmField
    var go_package: String? = null

    @JvmField
    var cc_generic_services: Boolean? = false

    @JvmField
    var java_generic_services: Boolean? = false

    @JvmField
    var py_generic_services: Boolean? = false

    @JvmField
    var php_generic_services: Boolean? = false

    @JvmField
    var deprecated: Boolean? = false

    @JvmField
    var cc_enable_arenas: Boolean? = false

    @JvmField
    var objc_class_prefix: String? = null

    @JvmField
    var csharp_namespace: String? = null

    @JvmField
    var swift_prefix: String? = null

    @JvmField
    var php_class_prefix: String? = null

    @JvmField
    var php_namespace: String? = null

    @JvmField
    var uninterpreted_option: List<UninterpretedOption> = emptyList()

    /**
     * Sets the Java package where classes generated from this .proto will be
     * placed.  By default, the proto package is used, but this is often
     * inappropriate because proto packages do not normally start with backwards
     * domain names.
     */
    fun java_package(java_package: String?): Builder {
      this.java_package = java_package
      return this
    }

    /**
     * If set, all the classes from the .proto file are wrapped in a single
     * outer class with the given name.  This applies to both Proto1
     * (equivalent to the old "--one_java_file" option) and Proto2 (where
     * a .proto always translates to a single class, but you may want to
     * explicitly choose the class name).
     */
    fun java_outer_classname(java_outer_classname: String?): Builder {
      this.java_outer_classname = java_outer_classname
      return this
    }

    /**
     * If set true, then the Java code generator will generate a separate .java
     * file for each top-level message, enum, and service defined in the .proto
     * file.  Thus, these types will *not* be nested inside the outer class
     * named by java_outer_classname.  However, the outer class will still be
     * generated to contain the file's getDescriptor() method as well as any
     * top-level extensions defined in the file.
     */
    fun java_multiple_files(java_multiple_files: Boolean): Builder {
      this.java_multiple_files = java_multiple_files
      return this
    }

    /**
     * This option does nothing.
     */
    @Deprecated(message = "java_generate_equals_and_hash is deprecated")
    fun java_generate_equals_and_hash(java_generate_equals_and_hash: Boolean?): Builder {
      this.java_generate_equals_and_hash = java_generate_equals_and_hash
      return this
    }

    /**
     * If set true, then the Java2 code generator will generate code that
     * throws an exception whenever an attempt is made to assign a non-UTF-8
     * byte sequence to a string field.
     * Message reflection will do the same.
     * However, an extension field still accepts non-UTF-8 byte sequences.
     * This option has no effect on when used with the lite runtime.
     */
    fun java_string_check_utf8(java_string_check_utf8: Boolean): Builder {
      this.java_string_check_utf8 = java_string_check_utf8
      return this
    }

    fun optimize_for(optimize_for: OptimizeMode): Builder {
      this.optimize_for = optimize_for
      return this
    }

    /**
     * Sets the Go package where structs generated from this .proto will be
     * placed. If omitted, the Go package will be derived from the following:
     *   - The basename of the package import path, if provided.
     *   - Otherwise, the package statement in the .proto file, if present.
     *   - Otherwise, the basename of the .proto file, without extension.
     */
    fun go_package(go_package: String?): Builder {
      this.go_package = go_package
      return this
    }

    /**
     * Should generic services be generated in each language?  "Generic" services
     * are not specific to any particular RPC system.  They are generated by the
     * main code generators in each language (without additional plugins).
     * Generic services were the only kind of service generation supported by
     * early versions of google.protobuf.
     *
     * Generic services are now considered deprecated in favor of using plugins
     * that generate code specific to your particular RPC system.  Therefore,
     * these default to false.  Old code which depends on generic services should
     * explicitly set them to true.
     */
    fun cc_generic_services(cc_generic_services: Boolean): Builder {
      this.cc_generic_services = cc_generic_services
      return this
    }

    fun java_generic_services(java_generic_services: Boolean): Builder {
      this.java_generic_services = java_generic_services
      return this
    }

    fun py_generic_services(py_generic_services: Boolean): Builder {
      this.py_generic_services = py_generic_services
      return this
    }

    fun php_generic_services(php_generic_services: Boolean): Builder {
      this.php_generic_services = php_generic_services
      return this
    }

    /**
     * Is this file deprecated?
     * Depending on the target platform, this can emit Deprecated annotations
     * for everything in the file, or it will be completely ignored; in the very
     * least, this is a formalization for deprecating files.
     */
    fun deprecated(deprecated: Boolean): Builder {
      this.deprecated = deprecated
      return this
    }

    /**
     * Enables the use of arenas for the proto messages in this file. This applies
     * only to generated classes for C++.
     */
    fun cc_enable_arenas(cc_enable_arenas: Boolean): Builder {
      this.cc_enable_arenas = cc_enable_arenas
      return this
    }

    /**
     * Sets the objective c class prefix which is prepended to all objective c
     * generated classes from this .proto. There is no default.
     */
    fun objc_class_prefix(objc_class_prefix: String?): Builder {
      this.objc_class_prefix = objc_class_prefix
      return this
    }

    /**
     * Namespace for generated classes; defaults to the package.
     */
    fun csharp_namespace(csharp_namespace: String?): Builder {
      this.csharp_namespace = csharp_namespace
      return this
    }

    /**
     * By default Swift generators will take the proto package and CamelCase it
     * replacing '.' with underscore and use that to prefix the types/symbols
     * defined. When this options is provided, they will use this value instead
     * to prefix the types/symbols defined.
     */
    fun swift_prefix(swift_prefix: String?): Builder {
      this.swift_prefix = swift_prefix
      return this
    }

    /**
     * Sets the php class prefix which is prepended to all php generated classes
     * from this .proto. Default is empty.
     */
    fun php_class_prefix(php_class_prefix: String?): Builder {
      this.php_class_prefix = php_class_prefix
      return this
    }

    /**
     * Use this option to change the namespace of php generated classes. Default
     * is empty. When this option is empty, the package name will be used for
     * determining the namespace.
     */
    fun php_namespace(php_namespace: String?): Builder {
      this.php_namespace = php_namespace
      return this
    }

    /**
     * The parser stores options it doesn't recognize here.
     * See the documentation for the "Options" section above.
     */
    fun uninterpreted_option(uninterpreted_option: List<UninterpretedOption>): Builder {
      checkElementsNotNull(uninterpreted_option)
      this.uninterpreted_option = uninterpreted_option
      return this
    }

    override fun build(): FileOptions = FileOptions(
      java_package = java_package,
      java_outer_classname = java_outer_classname,
      java_multiple_files = java_multiple_files,
      java_generate_equals_and_hash = java_generate_equals_and_hash,
      java_string_check_utf8 = java_string_check_utf8,
      optimize_for = optimize_for,
      go_package = go_package,
      cc_generic_services = cc_generic_services,
      java_generic_services = java_generic_services,
      py_generic_services = py_generic_services,
      php_generic_services = php_generic_services,
      deprecated = deprecated,
      cc_enable_arenas = cc_enable_arenas,
      objc_class_prefix = objc_class_prefix,
      csharp_namespace = csharp_namespace,
      swift_prefix = swift_prefix,
      php_class_prefix = php_class_prefix,
      php_namespace = php_namespace,
      uninterpreted_option = uninterpreted_option,
      unknownFields = buildUnknownFields()
    )
  }

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<FileOptions> = object : ProtoAdapter<FileOptions>(
      FieldEncoding.LENGTH_DELIMITED, 
      FileOptions::class
    ) {
      override fun encodedSize(value: FileOptions): Int = 
        ProtoAdapter.STRING.encodedSizeWithTag(1, value.java_package) +
        ProtoAdapter.STRING.encodedSizeWithTag(8, value.java_outer_classname) +
        ProtoAdapter.BOOL.encodedSizeWithTag(10, value.java_multiple_files) +
        ProtoAdapter.BOOL.encodedSizeWithTag(20, value.java_generate_equals_and_hash) +
        ProtoAdapter.BOOL.encodedSizeWithTag(27, value.java_string_check_utf8) +
        OptimizeMode.ADAPTER.encodedSizeWithTag(9, value.optimize_for) +
        ProtoAdapter.STRING.encodedSizeWithTag(11, value.go_package) +
        ProtoAdapter.BOOL.encodedSizeWithTag(16, value.cc_generic_services) +
        ProtoAdapter.BOOL.encodedSizeWithTag(17, value.java_generic_services) +
        ProtoAdapter.BOOL.encodedSizeWithTag(18, value.py_generic_services) +
        ProtoAdapter.BOOL.encodedSizeWithTag(42, value.php_generic_services) +
        ProtoAdapter.BOOL.encodedSizeWithTag(23, value.deprecated) +
        ProtoAdapter.BOOL.encodedSizeWithTag(31, value.cc_enable_arenas) +
        ProtoAdapter.STRING.encodedSizeWithTag(36, value.objc_class_prefix) +
        ProtoAdapter.STRING.encodedSizeWithTag(37, value.csharp_namespace) +
        ProtoAdapter.STRING.encodedSizeWithTag(39, value.swift_prefix) +
        ProtoAdapter.STRING.encodedSizeWithTag(40, value.php_class_prefix) +
        ProtoAdapter.STRING.encodedSizeWithTag(41, value.php_namespace) +
        UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999,
            value.uninterpreted_option) +
        value.unknownFields.size

      override fun encode(writer: ProtoWriter, value: FileOptions) {
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.java_package)
        ProtoAdapter.STRING.encodeWithTag(writer, 8, value.java_outer_classname)
        ProtoAdapter.BOOL.encodeWithTag(writer, 10, value.java_multiple_files)
        ProtoAdapter.BOOL.encodeWithTag(writer, 20, value.java_generate_equals_and_hash)
        ProtoAdapter.BOOL.encodeWithTag(writer, 27, value.java_string_check_utf8)
        OptimizeMode.ADAPTER.encodeWithTag(writer, 9, value.optimize_for)
        ProtoAdapter.STRING.encodeWithTag(writer, 11, value.go_package)
        ProtoAdapter.BOOL.encodeWithTag(writer, 16, value.cc_generic_services)
        ProtoAdapter.BOOL.encodeWithTag(writer, 17, value.java_generic_services)
        ProtoAdapter.BOOL.encodeWithTag(writer, 18, value.py_generic_services)
        ProtoAdapter.BOOL.encodeWithTag(writer, 42, value.php_generic_services)
        ProtoAdapter.BOOL.encodeWithTag(writer, 23, value.deprecated)
        ProtoAdapter.BOOL.encodeWithTag(writer, 31, value.cc_enable_arenas)
        ProtoAdapter.STRING.encodeWithTag(writer, 36, value.objc_class_prefix)
        ProtoAdapter.STRING.encodeWithTag(writer, 37, value.csharp_namespace)
        ProtoAdapter.STRING.encodeWithTag(writer, 39, value.swift_prefix)
        ProtoAdapter.STRING.encodeWithTag(writer, 40, value.php_class_prefix)
        ProtoAdapter.STRING.encodeWithTag(writer, 41, value.php_namespace)
        UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(writer, 999,
            value.uninterpreted_option)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): FileOptions {
        var java_package: String? = null
        var java_outer_classname: String? = null
        var java_multiple_files: Boolean = false
        var java_generate_equals_and_hash: Boolean? = null
        var java_string_check_utf8: Boolean = false
        var optimize_for: OptimizeMode = OptimizeMode.SPEED
        var go_package: String? = null
        var cc_generic_services: Boolean = false
        var java_generic_services: Boolean = false
        var py_generic_services: Boolean = false
        var php_generic_services: Boolean = false
        var deprecated: Boolean = false
        var cc_enable_arenas: Boolean = false
        var objc_class_prefix: String? = null
        var csharp_namespace: String? = null
        var swift_prefix: String? = null
        var php_class_prefix: String? = null
        var php_namespace: String? = null
        val uninterpreted_option = mutableListOf<UninterpretedOption>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> java_package = ProtoAdapter.STRING.decode(reader)
            8 -> java_outer_classname = ProtoAdapter.STRING.decode(reader)
            10 -> java_multiple_files = ProtoAdapter.BOOL.decode(reader)
            20 -> java_generate_equals_and_hash = ProtoAdapter.BOOL.decode(reader)
            27 -> java_string_check_utf8 = ProtoAdapter.BOOL.decode(reader)
            9 -> optimize_for = OptimizeMode.ADAPTER.decode(reader)
            11 -> go_package = ProtoAdapter.STRING.decode(reader)
            16 -> cc_generic_services = ProtoAdapter.BOOL.decode(reader)
            17 -> java_generic_services = ProtoAdapter.BOOL.decode(reader)
            18 -> py_generic_services = ProtoAdapter.BOOL.decode(reader)
            42 -> php_generic_services = ProtoAdapter.BOOL.decode(reader)
            23 -> deprecated = ProtoAdapter.BOOL.decode(reader)
            31 -> cc_enable_arenas = ProtoAdapter.BOOL.decode(reader)
            36 -> objc_class_prefix = ProtoAdapter.STRING.decode(reader)
            37 -> csharp_namespace = ProtoAdapter.STRING.decode(reader)
            39 -> swift_prefix = ProtoAdapter.STRING.decode(reader)
            40 -> php_class_prefix = ProtoAdapter.STRING.decode(reader)
            41 -> php_namespace = ProtoAdapter.STRING.decode(reader)
            999 -> uninterpreted_option.add(UninterpretedOption.ADAPTER.decode(reader))
            else -> reader.readUnknownField(tag)
          }
        }
        return FileOptions(
          java_package = java_package,
          java_outer_classname = java_outer_classname,
          java_multiple_files = java_multiple_files,
          java_generate_equals_and_hash = java_generate_equals_and_hash,
          java_string_check_utf8 = java_string_check_utf8,
          optimize_for = optimize_for,
          go_package = go_package,
          cc_generic_services = cc_generic_services,
          java_generic_services = java_generic_services,
          py_generic_services = py_generic_services,
          php_generic_services = php_generic_services,
          deprecated = deprecated,
          cc_enable_arenas = cc_enable_arenas,
          objc_class_prefix = objc_class_prefix,
          csharp_namespace = csharp_namespace,
          swift_prefix = swift_prefix,
          php_class_prefix = php_class_prefix,
          php_namespace = php_namespace,
          uninterpreted_option = uninterpreted_option,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: FileOptions): FileOptions = value.copy(
        uninterpreted_option =
            value.uninterpreted_option.redactElements(UninterpretedOption.ADAPTER),
        unknownFields = ByteString.EMPTY
      )
    }

    @JvmField
    val CREATOR: Parcelable.Creator<FileOptions> = AndroidMessage.newCreator(ADAPTER)
  }

  /**
   * Generated classes can be optimized for speed or code size.
   */
  enum class OptimizeMode(
    override val value: Int
  ) : WireEnum {
    /**
     * Generate complete code for parsing, serialization,
     */
    SPEED(1),

    /**
     * etc.
     * Use ReflectionOps to implement these methods.
     */
    CODE_SIZE(2),

    /**
     * Generate code using MessageLite and the lite runtime.
     */
    LITE_RUNTIME(3);

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<OptimizeMode> = object : EnumAdapter<OptimizeMode>(
        OptimizeMode::class
      ) {
        override fun fromValue(value: Int): OptimizeMode = OptimizeMode.fromValue(value)
      }

      @JvmStatic
      fun fromValue(value: Int): OptimizeMode = when (value) {
        1 -> SPEED
        2 -> CODE_SIZE
        3 -> LITE_RUNTIME
        else -> throw IllegalArgumentException("""Unexpected value: $value""")
      }
    }
  }
}
