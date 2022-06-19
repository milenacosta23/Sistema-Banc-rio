package com.sistemabancario.model;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaTest {

  //@Test
  //void setNumeroR1() {
  //Conta conta = new Conta();
  //conta.setNumero("123");
   //}

    @Test
    void setNumeroR1a() {
    final Conta conta = new Conta();
    final String invalido = "123";
    assertThrows(IllegalArgumentException.class, 
    () -> conta.setNumero(invalido));
    final String obtido = conta.getNumero();
    assertNotEquals(invalido,obtido);

    }
    @Test
    void setNumeroR1b() {
    final Conta conta = new Conta();
    final String invalido = "abcde-f";
    //aassertThrows == tem que dar erro
    assertThrows(IllegalArgumentException.class, () -> conta.setNumero(invalido));
    }

    @Test
    void setNumeroR1c() {
    final Conta conta = new Conta();
    final String invalido= "12345-f";
    assertThrows(IllegalArgumentException.class,
    () -> conta.setNumero(invalido));

    }

    @Test
    void setNumeroR1d() {
    final Conta conta = new Conta();
    final String esperado = "12345-6";
    assertThrows(IllegalArgumentException.class,
    () -> conta.setNumero(esperado));
    final String obtido = conta.getNumero();
    assertNotEquals(esperado,obtido);

    }

}
