fun main() {
    val amount = 10000.0

    val commissionPercentage = 0.75 // Процент комиссии
    val minimumCommission = 35.0 // Минимальная комиссия

    val commission = amount * commissionPercentage / 100.0

    val finalCommission = if (commission < minimumCommission) {
        minimumCommission // Если комиссия меньше минимальной, используем минимальную комиссию
    } else {
        commission // Иначе используем вычисленную комиссию
    }

    println("Размер комиссии: $finalCommission рублей")
}