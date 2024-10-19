import kotlinx.serialization.Serializable

@Serializable
data class ApplicationProps(
    val profile: String,
    val kafka: KafkaProps,
    val redis: RedisProps,
    val mongo: MongoProps,
) {
    @Serializable
    data class KafkaProps(
        val bootstrapServers: String,
        val schemaRegistryUrl: String,
        val transactionTimeoutMs: Long,
        val partitionDiscoveryIntervalMs: String,
    )

    @Serializable
    data class RedisProps(
        val clusterHosts: String? = null,
        val port: Int? = null,
        val writeHost: String? = null,
        val writePort: Int? = null,
        val readHost: String? = null,
        val readPort: Int? = null,
        val password: String? = null,
        val standalonePassword: String? = null,
        val ssl: Boolean,
    )

    @Serializable
    data class MongoProps(
        val url: String,
        val database: String,
        val host: String,
        val login: String,
        val password: String,
    )
}
