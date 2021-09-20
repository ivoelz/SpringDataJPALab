package entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Recipe")
public class Recipe {
    @Id
    @Column(name = "recipe_id")
    private int recipe_id;
    @ManyToOne
    @JoinColumn(name = "recipe_chef_id")
    private Chef chef_id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
}
