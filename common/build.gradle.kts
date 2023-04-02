plugins {
    id("java")
    id("java-library")
}

dependencies {
    compileOnly("org.apache.logging.log4j:log4j-api:2.17.0")
    compileOnly("org.jetbrains:annotations:20.1.0")
    compileOnly("eu.okaeri:okaeri-configs-core:4.0.6")
    api("eu.okaeri:okaeri-configs-hjson:5.0.0-beta.2")
    api("io.sentry:sentry:6.17.0")
}