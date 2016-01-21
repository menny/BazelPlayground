android_library (
  name = "lib",
  custom_package = "com.google.android.gms.base",
  manifest = "AndroidManifest.xml",
  resource_files = glob(["res/**"]),
  visibility = ["//visibility:public"],
  exports = ["jar",
    "@android-support-v4//:lib",
    "//libs/play-services-basement-8.4.0:lib", ]
)

java_import (
  name = "jar",
  jars = ["classes.jar"],
  visibility = ["//visibility:public"],
)