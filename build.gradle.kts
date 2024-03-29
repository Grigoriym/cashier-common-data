import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val kotlin = "1.8.22"
val kotlinSerialization = "1.3.2"

plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
    application
}

group = "com.grappim"
version = "1.0-SNAPSHOT"

repositories {
    gradlePluginPortal()
    mavenCentral()
}

fun kotlinx(module: String = "", version: String = kotlin) =
    "org.jetbrains.kotlinx:kotlinx$module:$version"

fun kotlin(module: String = "", version: String = kotlin) =
    "org.jetbrains.kotlin:kotlin$module:$version"

fun kotlinSerialization() = kotlinx(
    module = "-serialization-json",
    version = kotlinSerialization
)

fun kotlinStdlib() = kotlin("-stdlib-jdk8")

dependencies {
    implementation(kotlinSerialization())
    implementation(kotlinStdlib())
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "13"
}