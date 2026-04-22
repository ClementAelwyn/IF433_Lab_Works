package oop_00000105577_ClementAelwynWirawan.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG",  20,  15.5,  "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10,  -5.2,  "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 15, -12.3,  "CLOSED"),
        TradeLog("SOLUSDT", "LONG",  25,  30.1,  "CLOSED"),
        TradeLog("ETHUSDT", "LONG",  10,   8.7,  "CLOSED"),
        TradeLog("SOLUSDT", "SHORT", 20,   4.4,  "OPEN"),
        TradeLog("BTCUSDT", "LONG",  30,  -3.0,  "OPEN"),
        TradeLog("ETHUSDT", "LONG",  15,  22.0,  "CLOSED")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
}