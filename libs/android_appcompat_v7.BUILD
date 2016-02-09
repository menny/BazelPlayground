android_library (
  name = "lib",
  custom_package = "android.support.v7",
  manifest = "AndroidManifest.xml",
  resource_files = glob(["res/**"]),
  visibility = ["//visibility:public"],
  exports = ["jar",
    "@android_support_v4//:lib", "@android_support_v4//:jar",]
)

java_import (
  name = "jar",
  jars = ["classes.jar"],
  visibility = ["//visibility:public"],
)