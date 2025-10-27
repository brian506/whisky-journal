package whisky.whisky_journal.domain.whisky.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import whisky.whisky_journal.domain.whisky.entity.Whisky;
import whisky.whisky_journal.domain.whisky.entity.WhiskyMetaData;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class WhiskyApiResponse {
    private Integer id;
    private String name;
    private String description;

    @JsonProperty("image_url")
    private String imageUrl;

    private WhiskyMetaData metadata;

    public static Whisky toWhisky(WhiskyApiResponse response){
        return Whisky.builder()
                .id(response.getId())
                .name(response.getName())
                .description(response.getDescription())
                .imageUrl(response.imageUrl)
                .metadata(response.getMetadata())
                .build();
    }
}
