package whisky.whisky_journal.domain.whisky.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import whisky.whisky_journal.common.base.BaseTime;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class Whisky extends BaseTime {

    @Id
    @Column(name = "whisky_id")
    private Integer id;

    @OneToOne(mappedBy = "whisky", cascade = CascadeType.ALL)
    private WhiskyAlias alias;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "image_url")
    private String imageUrl;

    @Embedded
    private WhiskyMetaData metadata;



}
