//package whisky.whisky_journal;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.stereotype.Component;
//import whisky.whisky_journal.domain.whisky.dto.response.WhiskyApiResponse;
//import whisky.whisky_journal.domain.whisky.entity.Whisky;
//import whisky.whisky_journal.domain.whisky.repository.WhiskyRepository;
//import whisky.whisky_journal.domain.whisky.service.WhiskyEditionApiService;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Slf4j
//@Component
//@RequiredArgsConstructor
//public class DataLoadInitializer implements ApplicationRunner {
//
//    private final WhiskyEditionApiService apiService;
//    private final WhiskyRepository repository;
//
//    private static final int PAGE_SIZE = 100;
//
//    /**
//     *  어플리케이션 실행마다 데이터 적재
//     */
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        int offset = 0;
//        boolean hasMoreData = true;
//        int totalLoadedData = 0;
//
//        while(hasMoreData){
//            List<WhiskyApiResponse> whiskyList = apiService.getWhiskyData(PAGE_SIZE, offset);
//
//            if(whiskyList.isEmpty() || whiskyList == null){
//                hasMoreData = false;
//            } else {
//                List<Whisky> whiskyEntities = whiskyList.stream()
//                        .map(WhiskyApiResponse::toWhisky)
//                        .toList();
//                repository.saveAll(whiskyEntities);
//                log.info("{}개의 위스키 정보를 DB에 저장......", whiskyEntities.size());
//
//                totalLoadedData += whiskyEntities.size();
//                if (whiskyList.size() < PAGE_SIZE) {
//                    hasMoreData = false;
//                } else {
//                    offset += PAGE_SIZE;
//                }
//            }
//        }
//    }
//}
