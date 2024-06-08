plugins {
    id("java")
    id("org.jetbrains.intellij") version "1.6.0"
}

group = "org.intellij.sdk"
version = "2.0.2"

repositories {
    mavenCentral()
}

// Include the generated files in the source set
sourceSets {
    main {
        java {
            srcDirs("src/main/gen")
        }
    }
}

dependencies {
    testImplementation("junit:junit:4.13.2")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
}

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
    version.set("2024.1.2")
    plugins.set(listOf("com.intellij.java"))
}

tasks {
    buildSearchableOptions {
        enabled = false
    }

    patchPluginXml {
        version.set("${project.version}")
        sinceBuild.set("212")
        untilBuild.set("242.14146.16")
    }

    test {
        // This path value is a machine-specific placeholder text.
        // Set idea.home.path to the absolute path to the intellij-community source
        // on your local machine. For real world projects, use variants described in:
        // https://docs.gradle.org/current/userguide/build_environment.html
        // systemProperty("idea.home.path", "/Users/rohanvashisht/Documents/source/comm")
    }
}
