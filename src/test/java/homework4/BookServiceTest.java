package homework4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class BookServiceTest {

    /*У вас есть класс BookService, который использует интерфейс BookRepository
     для получения информации о книгах из базы данных. Ваша задача написать unit-тесты
      для BookService, используя Mockito для создания мок-объекта BookRepository.
     */
    BookRepository testBookRep;

    @BeforeEach
    void setup(){
        testBookRep = mock(BookRepository.class);
    }
    @Test
    void testServiceFindById(){
        when(testBookRep.findById("1")).thenReturn(new Book("1", "Book1", "Author1"));
        BookService testBookservice = new BookService(testBookRep);
        testBookservice.findBookById("1");
        verify(testBookRep, times(1)).findById("1");
    }
    @Test
    void testServiceFindAllBooks(){
        List<Book> testList = new ArrayList<>(2);
        testList.add(new Book("1", "1", "1"));
        testList.add(new Book("2", "2", "2"));
        when(testBookRep.findAll()).thenReturn(testList);
        BookService testBookservice = new BookService(testBookRep);
        assertThat(testBookservice.findAllBooks()).isEqualTo(testList);
    }
}
