import org.apache.http.impl.client.HttpClients
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand

class BuggyKotlin {
    var hc: HystrixCommand? = null

    fun m(): String {
        return "Hello Buggy Kotlin! ${ad(4)}"
    }

    fun ad(i: Int): Int {
        var j = i
        j =+ 1
        return j
    }

    private fun createHttpClientBuilder() =
        HttpClients.custom()
            .setMaxConnTotal(10)
            .setMaxConnPerRoute(10)
            // .disableConnectionState() // should be present, trigger PMD rule?

}