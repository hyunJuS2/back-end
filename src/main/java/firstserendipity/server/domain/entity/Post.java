package firstserendipity.server.domain.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class Post extends TimeStamped{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column
    private String content;

    @Column(nullable = false)
    private String image;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime modifiedAt;


//    //테스트 코드에서 사용
//    @Builder
//    public Post(String title, String content, String image, LocalDateTime createdAt, LocalDateTime modifiedAt) {
//        this.title = title;
//        this.content = content;
//        this.image = image;
//        this.createdAt = createdAt;
//        this.modifiedAt = modifiedAt;
//    }
//
//    @PrePersist
//    public void prePersist() {
//        createdAt = LocalDateTime.now();
//        modifiedAt = LocalDateTime.now();
//    }
}
