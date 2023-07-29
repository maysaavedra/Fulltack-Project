package com.example.cardapio.food;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRpository extends JpaRepository <Food, Long> {
}
