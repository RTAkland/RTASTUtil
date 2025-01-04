dependencies {
    subprojects.forEach {
        dependencies { api(it) }
    }
}