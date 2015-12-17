android_library (
  name = "lib",
  custom_package = "android.support.v4",
  manifest = "AndroidManifest.xml",
  resource_files = glob(["res/**"]),
  visibility = ["//visibility:public"],
  deps = ["jar", "@android-support-annotations//:jar"]
)

java_import (
  name = "jar",
  jars = ["classes.jar"],
  visibility = ["//visibility:public"],
)