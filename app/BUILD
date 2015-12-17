android_binary(
        name = "app",
        srcs = glob(["src/main/java/**/*.java"]),
        resource_files = glob(["src/main/res/**"]),
        custom_package = "net.evendanan.bazelplayground",
        manifest = "src/main/AndroidManifest.xml",
        deps = ["//javalib",
                "@androidsdk//:appcompat_v7", "@androidsdk//:appcompat_v7_import",
                "@android-support-design//:jar", "@android-support-design//:lib",],
        visibility = ["//visibility:public"]
)
