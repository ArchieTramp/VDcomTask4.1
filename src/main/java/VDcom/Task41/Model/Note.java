package VDcom.Task41.Model;

import lombok.*;

import javax.persistence.*;

/**
 * @author Artur Gilyazov
 * Модель записки
 **/

@Getter
@Setter
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@EqualsAndHashCode
@Table(name = "notes", uniqueConstraints = @UniqueConstraint(columnNames = {"title"}))
public final class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String title; //название заметки//
    private Long timestamp; //штамп времени создания и редактирования//
    private String note; //тело заметки//
    @ManyToOne
    @JoinColumn(name = "username")
    User user;

}
