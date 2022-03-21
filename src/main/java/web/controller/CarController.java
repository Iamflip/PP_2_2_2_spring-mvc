package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarServiceImpl carService;

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam int count, Model model) {
        List<Car> cars = carService.getCars(count);
        model.addAttribute("cars", cars);

        return "cars";
    }
}