android_library (
  name = "lib",
  custom_package = "com.google.android.gms",
  manifest = "AndroidManifest.xml",
  resource_files = glob(["res/**"]),
  visibility = ["//visibility:public"],
  exports = ["jar",
    "@android_support_v4//:lib",]
)

java_import (
  name = "jar",
  jars = ["classes.jar"],
  visibility = ["//visibility:public"],
)