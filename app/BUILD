android_binary(
        name = "app",
        srcs = glob(["src/main/java/**/*.java"]),
        resource_files = glob(["src/main/res/**"]),
        custom_package = "net.evendanan.bazelplayground",
        manifest = "src/main/AndroidManifest.xml",
        deps = ["//javalib",
                "@android_support_v4//:lib",
                "@android_appcompat_v7//:lib",
                "@android_support_design//:lib",
                "//libs/play-services-base-8.4.0:lib"],
        visibility = ["//visibility:public"]
)
