android_library (
  name = "lib",
  custom_package = "android.support.design",
  manifest = "AndroidManifest.xml",
  resource_files = glob(["res/**"]),
  visibility = ["//visibility:public"],
  deps = ["jar",
    "@androidsdk//:appcompat_v7",
    "@androidsdk//:appcompat_v4",]
)

java_import (
  name = "jar",
  jars = ["classes.jar"],
  visibility = ["//visibility:public"],
)