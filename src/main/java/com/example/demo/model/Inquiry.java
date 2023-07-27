package com.example.demo.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Inquiry {

//    必須入力、文字列が60文字まで
    @NotBlank
    @Size(max = 60)
    private String name;

    @NotBlank
    @Email
    @Size(max = 254)
    private String email;

    @NotBlank
    @Size(max = 500)
    private String inquiry;
}
