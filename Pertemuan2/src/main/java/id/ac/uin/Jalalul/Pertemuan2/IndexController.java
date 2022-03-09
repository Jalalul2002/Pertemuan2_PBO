package id.ac.uin.Jalalul.Pertemuan2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class IndexController {
    @GetMapping("/hello")
    public String hello(){
        return "Hallo Budjang Lapuk!!" +
                "Welkambek To Channel My-Jalalul Mu'ti";
    }
}
