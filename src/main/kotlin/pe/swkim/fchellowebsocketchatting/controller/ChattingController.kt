package pe.swkim.fchellowebsocketchatting.controller

import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.stereotype.Controller
import org.springframework.web.util.HtmlUtils
import pe.swkim.fchellowebsocketchatting.controller.vo.ChattingMessage
import pe.swkim.fchellowebsocketchatting.controller.vo.ChattingResponse

private val logger = KotlinLogging.logger {}

@Controller
class ChattingController {
    @MessageMapping("/chatting-message")
    @SendTo("/topic/chatting")
    fun chatting(chattingMessage: ChattingMessage): ChattingResponse {
        logger.trace { ">>> Received Message : ${chattingMessage.message}" }
        return ChattingResponse(HtmlUtils.htmlEscape(chattingMessage.message))
    }
}
