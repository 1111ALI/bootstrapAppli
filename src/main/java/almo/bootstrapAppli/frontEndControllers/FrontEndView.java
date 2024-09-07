package almo.bootstrapAppli.frontEndControllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class FrontEndView {
    @GetMapping("/page1")
    public String affichePage1(Model model){
        return "page1";
    }

}
