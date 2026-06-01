plugins {
    java
}

group = "io.hexlet"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
    implementation("com.h2database:h2:2.2.220")
}

tasks.test {
    useJUnitPlatform()
}