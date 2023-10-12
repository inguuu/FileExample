
@Service
public class TestService {
  
    @Transactional
    public ResponseEntity<byte[]> downloadPDF() {
      String url = "http://외부api";
      RestTemplate restTemplate = new RestTemplate();
      URI uri = URI.create(url);
      ResponseEntity<byte[]> response = restTemplate.getForEntity(uri,byte[].class);
      return response;
    }
}
