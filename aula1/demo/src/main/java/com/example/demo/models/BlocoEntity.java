package com.example.demo.models;

import lombok.Data;

@Data
public class BlocoEntity {
   String nome = "Bloco Padrao";

   public ItemEntity destruir() {
        return null;
        
   }
}
