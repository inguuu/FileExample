@RestController
@RequestMapping("/api/v1/test")
@RequiredArgsConstructor
public class TestController {
    private final TeatService testService;
    
    /**
     * PDF 다운도르 API
     * @Header userId 사용자 ID
     * @return ResponseEntity
     */
    @GetMapping("/download")
    public ResponseEntity<byte[]> download() {
      return testService.downloadPDF() ;
    }
}
