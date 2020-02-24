package test.task.handbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HandbookController {

    @Autowired
    private HandbookMybatisRepository handbookMybatisRepository;


    @GetMapping("/handbook")
    public List<Handbook> getAllHandbooks(){
        System.out.println("Got all request");
        return handbookMybatisRepository.getAll();
    }

    @GetMapping("/handbook/{id}")
    public Handbook getItemById(@PathVariable("id") Long id) {

        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        System.out.println("Got id request");
        return handbookMybatisRepository.findById(id);
    }

    @PutMapping("/handbook/")
    public void changeItem(@Validated @RequestBody Handbook handbook) {
        System.out.println("Got change request");
        handbookMybatisRepository.updateHandbook(handbook);
    }
}
