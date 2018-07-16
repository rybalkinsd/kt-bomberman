import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.kotlin.ir.backend.js.compile

/**
 * https://github.com/mixitconf/mixit/blob/master/build.gradle.kts
 *
 * https://kotlinexpertise.com/gradlekotlindsl/
 *
 * https://kotlinlang.org/docs/reference/using-gradle.html
 */


plugins {
    val bootVersion = "2.0.3.RELEASE"

    id("org.springframework.boot") version bootVersion
    id("io.spring.dependency-management") version "1.0.5.RELEASE"

    // Why duplicating `kotlinVersion`
    // https://stackoverflow.com/questions/37555196/in-gradle-how-to-use-a-variable-for-a-plugin-version/37749402#37749402
    // https://github.com/gradle/gradle/issues/1697
    kotlin("jvm") version "1.2.51"
    kotlin("plugin.spring") version "1.2.51"
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
        freeCompilerArgs = listOf("-Xjsr305=strict")
    }
}

val kotlinVersion = "1.2.51"

dependencies {
    compile(kotlin("stdlib", kotlinVersion))
    compile(kotlin("reflect", kotlinVersion))
    compile("org.springframework.boot:spring-boot-starter-web")

    testCompile("org.springframework.boot:spring-boot-starter-test")
}

repositories {
    jcenter()
}