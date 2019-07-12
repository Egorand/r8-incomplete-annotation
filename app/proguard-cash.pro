# Dont obfuscate anything, but dont use the -dontobfuscate flag because we want the mappings.txt file.
-keepattributes LineNumberTable,SourceFile
-keep,allowshrinking,allowoptimization class ** { *; }

# See https://www.guardsquare.com/en/proguard/manual/optimizations
-optimizationpasses 5
#-optimizations class/merging/vertical
-optimizations class/unboxing/enum
-optimizations method/inlining/short
-optimizations method/inlining/unique
#-optimizations method/marking/static
-allowaccessmodification


# Our open source libraries contain JSR 305 annotations but no dependency on them. They're only
# used by the javac/kotlinc compiler and aren't needed at runtime.
-dontwarn javax.annotation.**

### OKIO

# TODO(jrod): Remove and test when bump to Okio release >= 2.2.1

# java.nio.file.* usage which cannot be used at runtime. Animal sniffer annotation.
-dontwarn okio.Okio
# Animal sniffer annotation.
-dontwarn okio.DeflaterSink


### WIRE

-keep class * extends com.squareup.wire.Message { *; }
-keep class * extends com.squareup.wire.Message$Builder { *; }
# Enum value mapping used via reflection.
-keepclassmembers class * implements com.squareup.wire.WireEnum { public static ** fromValue(int); }
# Message adapters are lookup up via reflection by name.
-keepclassmembers class * extends com.squareup.wire.Message { public static com.squareup.wire.ProtoAdapter ADAPTER; }

### GSON

# Uses sun.misc.Unsafe to allocate instances without calling their constructor.
-dontnote com.google.gson.internal.UnsafeAllocator
