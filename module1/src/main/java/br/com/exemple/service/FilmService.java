package br.com.exemple.service;

import br.com.exemple.objects.Film;
import org.springframework.stereotype.Service;

@Service
public class FilmService {

  public Film getFilm() {
    return new Film("The Avengers", "2012");
  }
}
