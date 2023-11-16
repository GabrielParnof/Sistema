/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.g12.duque.gestor.models;

/**
 *
 * @author 08154
 */
public class Category {
        // Atributos da Classe
        private int id;
        private String name;
        private String description;
        
        // Construtor Padrão
        public Category() {
            System.out.println("Categoria criada");
            
        }
        
        // Contrutor com Parâmetros
        public Category(int id, String name, 
                String description) {
            this.id = id;
            this.name = name;
            this.description = description;
            
        }
        
        // Contrutor para Carregamento do ComboBox
        public Category(int id, String name) {
            this.id = id;
            this.name = name;
            
        }
        
        //Contrutor que será usado no Form de Cadastro
        public Category(String name, String description) {
            this.name = name;
            this.description = description;
            
        }
        
        
        
        //GETTERS E SETTER:

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
        
        
    
       public static void main(String[] args) {
           Category cat1 = new Category();
           System.out.println(cat1);
           
           Category cat2 = new Category("Bebidas", "Bebidas nao Alcoolicas");
           System.out.println("\'"+cat2.name + "\'"+cat2.description);
    }
 
}
