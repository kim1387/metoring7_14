package kr.ac.kpu.metoring7_14.controller;

import kr.ac.kpu.metoring7_14.annotation.Decode;
import kr.ac.kpu.metoring7_14.annotation.Timer;
import kr.ac.kpu.metoring7_14.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping("/get/{id}")
    public String get(@PathVariable Long id, @RequestParam String name){
        // TODO
        return id+ " "+ name;
    }

    // 요청 -> ObjectMapper -> object -> method -> object -> object mapper -> json -> 응답
    @PostMapping("/post")
    public User post(@RequestBody User user){

        return user;
    }

    @Timer
    @DeleteMapping("/delete")
    public void delete() throws InterruptedException {
        // db logic
        System.out.println("DB 접근");
        Thread.sleep(1000 * 3);
        System.out.println("삭제");
    }

    @Decode
    @PutMapping("/put")
    public User put(@RequestBody User user){
        System.out.println("put");
        System.out.println(user);
        return user;
    }

    @PutMapping("/response")
    public ResponseEntity<User> putresponse(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(user);
    }
}