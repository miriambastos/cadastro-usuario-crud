package br.com.javafilmes.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class <T> classe);
}
