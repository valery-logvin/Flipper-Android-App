plugins {
    id("flipper.multiplatform")
    id("flipper.multiplatform-dependencies")
}

android.namespace = "com.flipperdevices.filemanager.editor.api"

commonDependencies {
    implementation(projects.components.core.ui.decompose)

    implementation(libs.compose.ui)
    implementation(libs.decompose)
    implementation(libs.okio)
}
