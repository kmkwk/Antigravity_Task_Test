package antigravity.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ProductHits {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productId;

    private long hits;

    @Builder
    public ProductHits(Long id, Long productId, long hits) {
        this.id = id;
        this.productId = productId;
        this.hits = hits;
    }
}
