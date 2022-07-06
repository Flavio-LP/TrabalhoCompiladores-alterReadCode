package Analisador.Semantico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class TableSemantic {

    private String Nome;
    private String categoria;
    private String tipo;
    private Integer nivel;
    private Map<String, String> parametro = new HashMap<String, String>();



    public String getNome(){
        return Nome;
    }

    public void SetNome(String Nome){
        this.Nome=Nome;
    }

    public String getCategoria(){
        return categoria;
    }

    public void SetCategoria(String categoria){
        this.categoria=categoria;
    }

    public String getTipo(){
        return tipo;
    }

    public void SetTipo(String tipo){
        this.tipo=tipo;
    }

    public Integer getNivel(){
        return nivel;
    }

    public void setNivel(Integer nivel){
        this.nivel=nivel;
    }

    public Map getParametro (){
        return parametro;
    }

    public void setParametro(String nome, String tipo){
        this.parametro.put(nome, tipo);
    }

}