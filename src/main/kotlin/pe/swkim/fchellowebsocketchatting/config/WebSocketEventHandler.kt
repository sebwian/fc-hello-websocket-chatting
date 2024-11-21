package pe.swkim.fchellowebsocketchatting.config

import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component
import org.springframework.web.socket.messaging.SessionConnectEvent
import org.springframework.web.socket.messaging.SessionConnectedEvent
import org.springframework.web.socket.messaging.SessionDisconnectEvent
import org.springframework.web.socket.messaging.SessionSubscribeEvent
import org.springframework.web.socket.messaging.SessionUnsubscribeEvent

private val logger = KotlinLogging.logger {}

@Component
class WebSocketEventHandler {
    @EventListener
    fun handleWebSocketSessionConnectEventListener(event: SessionConnectEvent) {
        logger.trace { ">>> Received session connect" }
    }

    @EventListener
    fun handleWebSocketSessionDisconnectEventListener(event: SessionDisconnectEvent) {
        logger.trace { ">>> Received session disconnected" }
    }

    @EventListener
    fun handleWebSocketSessionConnectedEventListener(event: SessionConnectedEvent) {
        logger.trace { ">>> Received session connected" }
    }

    @EventListener
    fun handleWebSocketSessionSubscribeEventListener(event: SessionSubscribeEvent) {
        logger.trace { ">>> Received session subscribe" }
    }

    @EventListener
    fun handleWebSocketSessionUnsubscribeEventListener(event: SessionUnsubscribeEvent) {
        logger.trace { ">>> Received session unsubscribe" }
    }
}
