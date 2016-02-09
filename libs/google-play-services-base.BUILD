android_library (
  name = "lib",
  custom_package = "com.google.android.gms.base",
  manifest = "AndroidManifest.xml",
  resource_files = glob(["res/**"]),
  visibility = ["//visibility:public"],
  exports = ["jar",
    "@android_support_v4//:lib",
    "@google-play-services-basement//:lib", ]
)

java_import (
  name = "jar",
  jars = ["classes.jar"],
  visibility = ["//visibility:public"],
)