plugins {
    alias(libs.plugins.kotlin)
    id("maven-publish")
}

val libVersion: String by extra

group = "cn.rtast"
version = libVersion

subprojects {
    apply {
        apply(plugin = "org.jetbrains.kotlin.jvm")
        apply(plugin = "maven-publish")
    }

    repositories {
        mavenCentral()
    }

    val sourceJar by tasks.registering(Jar::class) {
        archiveClassifier.set("sources")
        from(sourceSets.main.get().allSource)
    }

    artifacts {
        archives(sourceJar)
    }

    publishing {
        publications {
            create<MavenPublication>("mavenJava") {
                from(components["java"])
                artifact(sourceJar)
                group = "cn.rtast"
                artifactId = "rtast-util-${project.name}"
                version = libVersion
            }
        }

        repositories {
            maven {
                url = uri("https://maven.rtast.cn/releases/")
                credentials {
                    username = "RTAkland"
                    password = System.getenv("PUBLISH_TOKEN")
                }
            }
        }
    }
}