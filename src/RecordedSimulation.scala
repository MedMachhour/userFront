
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseUrl("http://localhost:8090")
		.inferHtmlResources()
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("fr-FR,fr;q=0.9,en-US;q=0.8,en;q=0.7,ar;q=0.6")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"Proxy-Connection" -> "keep-alive",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Proxy-Connection" -> "keep-alive")

	val headers_5 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Proxy-Connection" -> "keep-alive")

	val headers_7 = Map("Proxy-Connection" -> "keep-alive")

	val headers_17 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Pragma" -> "no-cache",
		"Proxy-Connection" -> "keep-alive")

	val headers_18 = Map(
		"Accept" -> "application/json",
		"Proxy-Connection" -> "keep-alive")

	val headers_20 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"Origin" -> "http://localhost:8090",
		"Proxy-Connection" -> "keep-alive",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_52 = Map(
		"Accept" -> "text/event-stream",
		"Proxy-Connection" -> "keep-alive")

	val headers_55 = Map(
		"Origin" -> "http://localhost:8090",
		"Proxy-Connection" -> "keep-alive")

    val uri1 = "localhost"

	val scn = scenario("RecordedSimulation")
		.exec(http("request_0")
			.get("/index")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/css/bootstrap.min.css")
			.headers(headers_1),
            http("request_2")
			.get("/css/bootstrap-datetimepicker.min.css")
			.headers(headers_1),
            http("request_3")
			.get("/css/jquery.dataTable.min.css")
			.headers(headers_1)
			.check(status.is(404)),
            http("request_4")
			.get("/css/dataTables.bootstrap.min.css")
			.headers(headers_1),
            http("request_5")
			.get("/images/banner.png")
			.headers(headers_5),
            http("request_6")
			.get("/css/main.css")
			.headers(headers_1),
            http("request_7")
			.get("/js/jquery.js")
			.headers(headers_7),
            http("request_8")
			.get("/js/bootstrap.min.js")
			.headers(headers_7),
            http("request_9")
			.get("/css/jquery.dataTable.min.css")
			.headers(headers_1)
			.check(status.is(404)),
            http("request_10")
			.get("/js/bootstrap-datetimepicker.min.js")
			.headers(headers_7),
            http("request_11")
			.get("/js/jquery.easing.min.js")
			.headers(headers_7),
            http("request_12")
			.get("/js/main.js")
			.headers(headers_7),
            http("request_13")
			.get("/js/jquery.dataTables.min.js")
			.headers(headers_7),
            http("request_14")
			.get("/js/dataTables.bootstrap.min.js")
			.headers(headers_7),
            http("request_15")
			.get("/js/bootbox.min.js")
			.headers(headers_7),
            http("request_16")
			.get("/images/bg.png")
			.headers(headers_5),
            http("request_17")
			.get("/favicon.ico")
			.headers(headers_17)))
		.pause(3)
		.exec(http("request_18")
			.get("http://" + uri1 + ":8080/sse-gateway/ping?dispatcherId=jenkins-blueocean-core-js-1545298995405-rd8fe")
			.headers(headers_18))
		.pause(3)
		.exec(http("request_19")
			.get("http://" + uri1 + ":8080/sse-gateway/ping")
			.headers(headers_18))
		.pause(1)
		.exec(http("request_20")
			.post("/index")
			.headers(headers_20)
			.formParam("username", "famous")
			.formParam("password", "123")
			.resources(http("request_21")
			.get("/css/bootstrap.min.css")
			.headers(headers_1),
            http("request_22")
			.get("/css/bootstrap-datetimepicker.min.css")
			.headers(headers_1),
            http("request_23")
			.get("/css/jquery.dataTable.min.css")
			.headers(headers_1)
			.check(status.is(404)),
            http("request_24")
			.get("/css/dataTables.bootstrap.min.css")
			.headers(headers_1),
            http("request_25")
			.get("/images/banner.png")
			.headers(headers_5),
            http("request_26")
			.get("/css/main.css")
			.headers(headers_1),
            http("request_27")
			.get("/js/jquery.js")
			.headers(headers_7),
            http("request_28")
			.get("/js/jquery.easing.min.js")
			.headers(headers_7),
            http("request_29")
			.get("/js/bootstrap-datetimepicker.min.js")
			.headers(headers_7),
            http("request_30")
			.get("/js/bootstrap.min.js")
			.headers(headers_7),
            http("request_31")
			.get("/js/bootbox.min.js")
			.headers(headers_7),
            http("request_32")
			.get("/js/dataTables.bootstrap.min.js")
			.headers(headers_7),
            http("request_33")
			.get("/js/jquery.dataTables.min.js")
			.headers(headers_7),
            http("request_34")
			.get("/js/main.js")
			.headers(headers_7),
            http("request_35")
			.get("/images/bg.png")
			.headers(headers_5)))
		.pause(3)
		.exec(http("request_36")
			.get("/favicon.ico")
			.headers(headers_5))
		.pause(15)
		.exec(http("request_37")
			.get("/account/primaryAccount")
			.headers(headers_0)
			.resources(http("request_38")
			.get("/css/bootstrap.min.css")
			.headers(headers_1),
            http("request_39")
			.get("/css/bootstrap-datetimepicker.min.css")
			.headers(headers_1),
            http("request_40")
			.get("/css/jquery.dataTable.min.css")
			.headers(headers_1)
			.check(status.is(404)),
            http("request_41")
			.get("/css/main.css")
			.headers(headers_1),
            http("request_42")
			.get("/css/dataTables.bootstrap.min.css")
			.headers(headers_1),
            http("request_43")
			.get("/images/banner.png")
			.headers(headers_5),
            http("request_44")
			.get("/js/bootstrap.min.js")
			.headers(headers_7),
            http("request_45")
			.get("/css/jquery.dataTable.min.css")
			.headers(headers_1)
			.check(status.is(404)),
            http("request_46")
			.get("/js/jquery.easing.min.js")
			.headers(headers_7),
            http("request_47")
			.get("/js/bootbox.min.js")
			.headers(headers_7),
            http("request_48")
			.get("/js/bootstrap-datetimepicker.min.js")
			.headers(headers_7),
            http("request_49")
			.get("/js/dataTables.bootstrap.min.js")
			.headers(headers_7),
            http("request_50")
			.get("/js/main.js")
			.headers(headers_7),
            http("request_51")
			.get("/js/jquery.dataTables.min.js")
			.headers(headers_7),
            http("request_52")
			.get("http://" + uri1 + ":8080/sse-gateway/listen/jenkins-blueocean-core-js-1545298995405-rd8fe")
			.headers(headers_52),
            http("request_53")
			.get("/images/bg.png")
			.headers(headers_5),
            http("request_54")
			.get("/js/jquery.js")
			.headers(headers_7),
            http("request_55")
			.get("/fonts/glyphicons-halflings-regular.woff2")
			.headers(headers_55)))
		.pause(3)
		.exec(http("request_56")
			.get("http://" + uri1 + ":8080/sse-gateway/ping?dispatcherId=jenkins-blueocean-core-js-1545298995405-rd8fe")
			.headers(headers_18))
		.pause(2)
		.exec(http("request_57")
			.get("/account/savingsAccount")
			.headers(headers_0)
			.resources(http("request_58")
			.get("/css/bootstrap-datetimepicker.min.css")
			.headers(headers_1),
            http("request_59")
			.get("/css/jquery.dataTable.min.css")
			.headers(headers_1)
			.check(status.is(404)),
            http("request_60")
			.get("/css/bootstrap.min.css")
			.headers(headers_1),
            http("request_61")
			.get("/css/dataTables.bootstrap.min.css")
			.headers(headers_1),
            http("request_62")
			.get("/css/main.css")
			.headers(headers_1),
            http("request_63")
			.get("/images/banner.png")
			.headers(headers_5),
            http("request_64")
			.get("/js/jquery.js")
			.headers(headers_7),
            http("request_65")
			.get("/js/jquery.easing.min.js")
			.headers(headers_7),
            http("request_66")
			.get("/js/bootstrap-datetimepicker.min.js")
			.headers(headers_7),
            http("request_67")
			.get("/js/bootstrap.min.js")
			.headers(headers_7),
            http("request_68")
			.get("/js/bootbox.min.js")
			.headers(headers_7),
            http("request_69")
			.get("/js/dataTables.bootstrap.min.js")
			.headers(headers_7),
            http("request_70")
			.get("/js/jquery.dataTables.min.js")
			.headers(headers_7),
            http("request_71")
			.get("/js/main.js")
			.headers(headers_7),
            http("request_72")
			.get("/images/bg.png")
			.headers(headers_5),
            http("request_73")
			.get("http://" + uri1 + ":8080/sse-gateway/ping")
			.headers(headers_18)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}