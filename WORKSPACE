android_sdk_repository(
    name = "androidsdk",
    # Holds the path to the Android SDK.
    # TODO Set this in WORKSPACE.local file
    path = "/Users/menny/dev/sdk",
    # Set the API level of the installed SDK Platform.
    api_level = 23,
    # Set the version of the build tools (a directory inside build-tools)
    build_tools_version="23.0.2"
)

android_ndk_repository(
    name = "androidndk",
    # Holds the path to the Android NDK.
    # TODO Set this in WORKSPACE.local file
    path = "/Users/menny/dev/ndk",
    # Replace with the Android NDK API level
    api_level = 21
)


#since support libraries are not published in Maven Central or jCenter, we'll have a local copy
new_local_repository(
   name = "android-support-design",
   path = __workspace_dir__+"/libs/support-design",
   build_file = "libs/android-support-design.BUILD"
)
