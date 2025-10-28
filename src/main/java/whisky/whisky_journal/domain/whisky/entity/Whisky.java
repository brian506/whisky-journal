package whisky.whisky_journal.domain.whisky.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import whisky.whisky_journal.common.base.BaseTime;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "whisky")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@EntityListeners(AuditingEntityListener.class)
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
    @Column(name = "metadata")
    private WhiskyMetaData metadata;



}
