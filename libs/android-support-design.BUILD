android_library (
  name = "lib",
  custom_package = "android.support.design",
  manifest = "AndroidManifest.xml",
  resource_files = glob(["res/**"]),
  visibility = ["//visibility:public"],
  exports = ["jar",
    "@android-appcompat-v7//:lib", "@android-appcompat-v7//:jar",
    "@android-support-v4//:lib", "@android-support-v4//:jar"]
)

java_import (
  name = "jar",
  jars = ["classes.jar"],
  visibility = ["//visibility:public"]
)
