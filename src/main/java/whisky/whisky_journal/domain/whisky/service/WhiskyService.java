package whisky.whisky_journal.domain.whisky.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import whisky.whisky_journal.domain.whisky.dto.response.WhiskyResponse;
import whisky.whisky_journal.domain.whisky.entity.Whisky;
import whisky.whisky_journal.domain.whisky.repository.WhiskyRepository;

import java.util.List;



@Service
@RequiredArgsConstructor
public class WhiskyService {

    private final WhiskyRepository whiskyRepository;

    // 위스키 이름으로 조회(keyword)
    public List<WhiskyResponse> getWhiskyByCriteria(final String keyword){
        List<Whisky> whiskyList = whiskyRepository.findByNameOrAliasContaining(keyword);
        List<WhiskyResponse> whiskyResponses = whiskyList.stream()
                .map(WhiskyResponse::toWhiskyDto)
                .toList();
        return whiskyResponses;
    }
    // 위스키 지역,증류소,몇년산,도수 카테고리화 조회

    //


}
