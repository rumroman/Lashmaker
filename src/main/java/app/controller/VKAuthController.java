package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VKAuthController {


    @GetMapping("/vkauth")
    public String vkAuth(@RequestParam String uid, @RequestParam String first_name,
                         @RequestParam String last_name, @RequestParam String photo,
                         @RequestParam String photo_rec, @RequestParam String hash) {

        return String.format("Success. Uid = %s, first_name = %s, last_name = %s, photo = %s, photo_rec = %s , hash = %s",
                uid, first_name, last_name, photo, photo_rec, hash);

    }


}
