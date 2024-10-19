import com.charleskorn.kaml.Yaml

private const val YAML_FILE_NAME = "application.yaml"

fun main(args: Array<String>) {
    val appProps =
        Yaml.default.decodeFromString(
            ApplicationProps.serializer(),
            YamlUtil.loadYamlFile(YAML_FILE_NAME),
        )

    check(appProps.profile == "local") { "Profile must be local" }
    check(appProps.redis.writePort == 6379) { "Write port must be 6379" }
}
