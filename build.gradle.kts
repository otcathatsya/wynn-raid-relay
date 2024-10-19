plugins {
    kotlin("jvm") version "2.0.0"
    id("org.jetbrains.kotlin.plugin.serialization") version "2.0.0"
}

group = "at.cath"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("io.ktor:ktor-server-core:${property("ktor_version")}")
    implementation("io.ktor:ktor-server-netty:${property("ktor_version")}")
    implementation("io.ktor:ktor-client-core:${property("ktor_version")}")
    implementation("io.ktor:ktor-client-cio:${property("ktor_version")}")
    implementation("io.ktor:ktor-client-content-negotiation:${property("ktor_version")}")
    implementation("io.ktor:ktor-server-content-negotiation:${property("ktor_version")}")
    implementation("io.ktor:ktor-serialization-kotlinx-json:${property("ktor_version")}")

    implementation("ch.qos.logback:logback-classic:${property("logback_version")}")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}