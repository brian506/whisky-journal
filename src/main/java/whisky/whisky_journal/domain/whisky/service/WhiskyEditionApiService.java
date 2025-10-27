package whisky.whisky_journal.domain.whisky.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import whisky.whisky_journal.domain.whisky.dto.response.WhiskyApiResponse;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class WhiskyEditionApiService {

    @Value("${whisky-edition.url}")
    private String whiskyUrl;

    private final RestClient restClient;

    public List<WhiskyApiResponse> getWhiskyData(int limit, int offset){
        return restClient.get()
                .uri(whiskyUrl+ "?limit={limit}&offset={offset}", limit, offset)
                .retrieve()
                .body(new ParameterizedTypeReference<List<WhiskyApiResponse>>() {});
    }
}
