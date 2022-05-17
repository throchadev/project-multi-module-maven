package br.com.exemple.controller;

import br.com.exemple.objects.Film;
import br.com.exemple.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/films")
public class MyController {

  @Autowired
  private FilmService filmService;

  @GetMapping("/film")
  public Film getFilm() {
    return filmService.getFilm();
  }
}
