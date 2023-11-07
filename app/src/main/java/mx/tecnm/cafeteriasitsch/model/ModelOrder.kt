package mx.tecnm.cafeteriasitsch.model

data class ModelOrder(
    var entregado: Boolean,
    var nombre: String,
    var pedido: String,
    var total: Int,
)
