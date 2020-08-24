package im.kny

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import io.quarkus.test.junit.QuarkusTest
import org.junit.jupiter.api.Test

@QuarkusTest
class DeSerializeQuarkusTest {

    @Test
    fun quarkusFail() {
        val obj = Level1Enum.V1
        val objectMapper = ObjectMapper().registerModule(KotlinModule())
        val json = objectMapper.valueToTree<JsonNode>(obj)
        println("json")
    }
}