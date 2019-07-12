### KOTLIN

# Used in the app and instrumentation tests, so we can't strip any of it in debug builds.
-keep class kotlin.** { *; }
