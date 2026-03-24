package ibirama.programacao01;

import java.util.HashSet;
import java.util.Set;

public class Turma {
    private String nome;
    private int anoIngresso;
    private String sala;

    private Discente discente = new Discente();
    private Disciplina disciplina = new Disciplina();
    private Professor professor = new Professor();

    private Set<Estudante> _discente = new HashSet<Estudante>();
    private Set<Disciplina> _disciplina = new HashSet<Disciplina>();
    private Set<Professor> _professor = new HashSet<Professor>();

}
