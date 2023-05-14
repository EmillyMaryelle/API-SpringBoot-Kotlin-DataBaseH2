@Entity
data class main(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false)
    val datamain: LocalDateTime,

    @Column(nullable = false)
    val valor: BigDecimal,

    @Column(nullable = false)
    val vendedorId: Long,

    @Column(nullable = false)
    val nomeVendedor: String
)

