package entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Photo2")
public class Photo2 {
    @Id
    @Column(name = "photo2_id")
    private int photo2_id;
    @ManyToOne
    @JoinColumn(name = "photo2_recipe_id")
    private Recipe recipe_id;
    @NonNull
    @Column(name = "filename")
    private String filename;
    @Column(name = "caption")
    private String caption;
    @Column(name = "datestamp")
    private LocalDateTime datestamp;
    @NonNull
    @Column(name = "photo2_visible")
    private char visible;
}