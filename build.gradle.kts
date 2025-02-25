plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.code.gson:gson:2.12.1")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}


tasks.shadowJar {
    archiveBaseName.set("myname")
    archiveClassifier.set("")
    manifest {
        attributes["Main-Class"] = "org.example.Main"
    }
}

tasks.build {
    dependsOn(tasks.shadowJar)
}
