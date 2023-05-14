@RestController
@RequestMapping("/main")
class mainController(val MainRepository: MainRepository) {

    @PostMapping("/api/generate")
    fun generatemain(@RequestBody main: main): main {
        return MainRepository.save(main)
    }

    @GetMapping("/api/get")
    fun getAllmains(): List<main> {
        return MainRepository.findAll()
    }

}
