package jp.te4a.spring.boot.myapp9.mybootapp9;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

@Repository
    public interface BookRepository extends JpaReposiory<BookBean,Interger> {

    }
    


