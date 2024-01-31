package ntukhpi.semit.studyplans.entity.fromasukhpi;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "prepod_stepen")
@Getter
@Setter
@NoArgsConstructor
public class Stepen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stepen_id")
    Long id;

    @Column(length = 40, name="stepen_name",nullable = false,unique = true)
    private String stepenName;
    @Column(length = 80, name="stepen_long",nullable = false,unique = true)
    private String stepenLong;
    @Column(name="okp_id_nstep")
    private Integer okpIdNaukStepen;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stepen stepen = (Stepen) o;

        return stepenName.equals(stepen.stepenName);
    }

    @Override
    public int hashCode() {
        return stepenName.hashCode();
    }

    @Override
    public String toString() {
        return stepenName;
    }
}