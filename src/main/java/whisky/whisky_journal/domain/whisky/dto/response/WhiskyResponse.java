package whisky.whisky_journal.domain.whisky.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.parameters.P;
import whisky.whisky_journal.domain.whisky.entity.Whisky;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class WhiskyResponse {

    private String name;
    private String description;
    private String country;
    private String type;
    private String bottler;
    private Integer age;
    private Double abv;

    public static WhiskyResponse toWhiskyDto(Whisky whisky){
        return WhiskyResponse.builder()
                .name(whisky.getName())
                .description(whisky.getDescription())
                .country(whisky.getMetadata().getCountry())
                .type(whisky.getMetadata().getType())
                .bottler(whisky.getMetadata().getBottler())
                .age(whisky.getMetadata().getAge())
                .abv(whisky.getMetadata().getAbv())
                .build();
    }
}
