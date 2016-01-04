android_binary(
        name = "app",
        srcs = glob(["src/main/java/**/*.java"]),
        resource_files = glob(["src/main/res/**"]),
        custom_package = "net.evendanan.bazelplayground",
        manifest = "src/main/AndroidManifest.xml",
        deps = ["//javalib",
                "@android-support-v4//:jar", "@android-support-v4//:lib",
                "@android-appcompat-v7//:jar", "@android-appcompat-v7//:lib",
                "@android-support-design//:jar", "@android-support-design//:lib",
                "@androidsdk//:appcompat_v4"],
        visibility = ["//visibility:public"]
)
