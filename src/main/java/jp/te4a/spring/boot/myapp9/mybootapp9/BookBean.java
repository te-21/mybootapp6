package jp.te4a.spring.boot.myapp9.mybootapp9;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Indexed;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "books")
@Data
@AllArgsConstructor
@NoArgsConstructor
    public class BookBean {
        @GeneratedValue
        private Integer id ;
        @Column(nullable = false)
        private String title;
        private String writter;
        private String publisher;
        private Integer price;
}


