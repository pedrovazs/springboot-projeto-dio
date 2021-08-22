package projeto.springbootprojeto.models;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Movimentacao {
    
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class MovimentacaoId implements Serializable {
        private long idMovimento;
        private long idUsuario;

    }

    // @Id
    @EmbeddedId
    private MovimentacaoId id;
    
    private Usuario usuario;
    private LocalDateTime entradaData;
    private LocalDateTime saidaData;
    private BigDecimal periodoPermanencia;
    private Ocorrencia ocorrencia;
    private Calendario dataEspecial;
}
