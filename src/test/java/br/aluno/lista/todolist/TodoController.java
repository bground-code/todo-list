package br.aluno.lista.todolist;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class TodoController {

@GetMapping(value = "/")
public ModelAndView getIndex() {
    ModelAndView modelAndView = new ModelAndView("index");
    modelAndView.addObject("todo_list", list);
    return modelAndView;

}

    List <String> list = new ArrayList<>();
    @PostMapping(value="/add")
    public ModelAndView postAdd(@RequestParam String todo) {
        //TODO: process POST request
        list.add(todo);
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("todo_list", list);
        return modelAndView;
    }
    
}
