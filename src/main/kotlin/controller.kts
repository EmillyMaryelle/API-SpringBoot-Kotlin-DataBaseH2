@RestController
@RequestMapping("/main")
class mainController(val MainRepository: MainRepository) {

    @PostMapping
    fun generatemain(@RequestBody main: main): main {
        return MainRepository.save(main)
    }

    @GetMapping
    fun getAllmains(): List<main> {
        return MainRepository.findAll()
    }

}
