package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsServiceIml;

@Controller
@RequestMapping("/cars")
public class CarsController {

    @Autowired
//    CarsDao carsDao;
    CarsServiceIml carsServiceIml;

    /*
     * RequestParam аннотации используются для доступа к значениям
     * параметров значения из запроса
     * defaultValue – (Это значение по умолчанив качестве механизма резервирования,
     * если запрос не имеющее значения илионо пустое.)
     * name – (Имя параметра, чтобы связать) Name of the parameter to bind
     * required – (Если параметр является обязательным или нет. Если это правда, не в
     * состоянии послать этот параметр не удастся.)
     * value – (Это псевдоним для имени атрибута)
     */
    @GetMapping()      // направляем на представление
    public String getNumerOfCars(@RequestParam(value
            = "count", required = false) Integer number, Model model) {

        if (number == null) {
            // обращаемся в модель за данными по имени бина и методу
            model.addAttribute("carsList", carsServiceIml.getCars());
        } else {
            model.addAttribute("carsList", carsServiceIml.getCars(number));
        }
        return "car";
    }
}
