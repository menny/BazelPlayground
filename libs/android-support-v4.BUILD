android_library (
  name = "lib",
  custom_package = "android.support.v4",
  manifest = "AndroidManifest.xml",
  resource_files = glob(["res/**"]),
  visibility = ["//visibility:public"],
  exports = ["jar", "internal_jar", "@android-support-annotations//:jar"]
)

java_import (
  name = "jar",
  jars = ["classes.jar"],
  visibility = ["//visibility:public"],
)

java_import (
  name = "internal_jar",
  jars = ["libs/internal_impl-23.1.1.jar"],
  visibility = ["//visibility:public"],
)