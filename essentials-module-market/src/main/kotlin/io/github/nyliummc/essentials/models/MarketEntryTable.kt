package io.github.nyliummc.essentials.models

import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.`java-time`.datetime

object MarketEntryTable : Table() {
    val user = uuid("user")
    val item = blob("itemstack")
    val price = decimal("price", 99, 2)
    val expiresAt = datetime("expires")
}