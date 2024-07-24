package jp.te4a.spring.boot.myapp11.mybootapp11;

import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.usertype.Sized;

import javax.annotation.Nonnull;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BookForm {
    private Integer id ;
    @NotNull
    @Size(min = 3)
    private String title;
    Sized(min = 3, max = 20)
    private String writter;
    private String publisher;
    @Min(0)
    private Integer price;
}

