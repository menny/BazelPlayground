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
   name = "android_support_v4",
   path = __workspace_dir__+"/libs/support-v4",
   build_file = "libs/android_support_v4.BUILD"
)

new_local_repository(
   name = "android_appcompat_v7",
   path = __workspace_dir__+"/libs/appcompat-v7",
   build_file = "libs/android_appcompat_v7.BUILD"
)

new_local_repository(
   name = "android_support_design",
   path = __workspace_dir__+"/libs/support-design",
   build_file = "libs/android_support_design.BUILD"
)

new_local_repository(
   name = "android_support_annotations",
   path = __workspace_dir__+"/libs",
   build_file = "libs/android_support_annotations.BUILD"
)


#new_local_repository(
#   name = "google-play-services-basement",
#   path = __workspace_dir__+"/libs/play-services-basement-8.4.0",
#   build_file = "libs/google-play-services-basement.BUILD"
#)

#new_local_repository(
#   name = "google-play-services-base",
#   path = __workspace_dir__+"/libs/play-services-base-8.4.0",
#   build_file = "libs/google-play-services-base.BUILD"
#)