@Entity
data class main(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var data: LocalDateTime = LocalDateTime.now(),
    var valor: BigDecimal,
    var vendedorId: Long,
    var vendedorNome: String
)
