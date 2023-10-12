# FileExample
파일전송 및 호출 코드


### Front <- Backend <- 외부 API(return File) 
 1. 프론트 Blob 타입으로 백엔드 호출
 2. Backend에서 pdf(파일) 형식을 호출
 3. Byte[] 타입 스트림 저장 및 리턴
 4. 임시 태그 설정 및 Blob 내부 메소드로 URL 생성 및 호출
 5. 유저 pdf 다운
 
