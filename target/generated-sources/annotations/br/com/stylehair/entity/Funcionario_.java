package br.com.stylehair.entity;

import br.com.stylehair.entity.Agendamento;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-10T21:15:21")
@StaticMetamodel(Funcionario.class)
public class Funcionario_ { 

    public static volatile SingularAttribute<Funcionario, String> senha;
    public static volatile ListAttribute<Funcionario, Agendamento> agendamentos;
    public static volatile SingularAttribute<Funcionario, String> nome;
    public static volatile SingularAttribute<Funcionario, Long> id;
    public static volatile SingularAttribute<Funcionario, String> email;

}