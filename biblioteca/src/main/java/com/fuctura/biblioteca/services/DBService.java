package com.fuctura.biblioteca.services;

import com.fuctura.biblioteca.enuns.Tamanho;
import com.fuctura.biblioteca.models.Categoria;
import com.fuctura.biblioteca.models.Livro;

@Service
public class DBService {

    public void instaciaDB(){
        Categoria cat1 = new Categoria(null, "Informática", "Livro de informática");
        Categoria cat2 = new Categoria(null, "Ficção Científica", "Ficção Científica");
        Categoria cat3 = new Categoria(null, "Biografias", "Livros de Biografias");

        Livro l1 = new Livro(null, "Clean code", "Robertin Martin", "Lorem ipsum", Tamanho.MEDIO, cat1);
        Livro l2 = new Livro(null, "Engenharia de Software", "Louis V. Gerstner", "Lorem ipsum", Tamanho.GRANDE, cat1);
        Livro l3 = new Livro(null, "The time machine", "H. G. Wells", "Lorem ipsum", Tamanho.MEDIO, cat2);
        Livro l4 = new Livro(null, "The war of the worlds", "H. G. Wells", "Lorem ipsum", Tamanho.PEQUENO, cat2);
        Livro l5 = new Livro(null, "I, robot", "Isaac Asimov", "Lorem ipsum", Tamanho.GRANDE, cat2);

        cat1.getLivros().addAll(Arrays.asList(l1, l2));
        cat2.getLivros().addAll(Arrays.asList(l3, l4, l5));

        this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        this.livroRepository.saveAll(Arrays.asList(l1,l2, l3, l4, l5));

    }
}


