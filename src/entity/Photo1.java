package entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Photo1")
public class Photo1 {
    @Id
    @Column(name = "photo1_id")
    private int id;
    @ManyToOne
    @JoinColumn(name = "photo_collector_id")
    private Collector photocollectorid;
    @Column(name = "filename")
    private String filename;
    @Column(name = "datestamp")
    private LocalDateTime datestamp;
    @Column(name = "visible")
    private char visible;
}
