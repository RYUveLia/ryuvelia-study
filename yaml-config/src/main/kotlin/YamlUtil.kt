import com.google.common.io.Resources

object YamlUtil {
    fun loadYamlFile(yamlFileName: String): String {
        val yamlString = Resources.getResource(yamlFileName)!!.readText()

        val updatedYamlString =
            Regex("\\$\\{?([a-zA-Z0-9_/]*):?([^}]*)}?").replace(yamlString) { matchResult ->
                val environmentName = matchResult.groupValues[1]
                val environmentValue = System.getenv(environmentName)

                if (matchResult.groupValues[2].isNotEmpty()) {
                    environmentValue ?: matchResult.groupValues[2]
                } else {
                    matchResult.groupValues[0]
                }
            }

        return updatedYamlString
    }
}
