import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControledePonto {
    public static void main(String[] args) {
        /*Gerente*/
        Gerente gerente = new Gerente();
        gerente.setIdlogin("teste");
        gerente.setSenha("1234");
        gerente.setIdFunc(1);
        gerente.setNome("Jubileu");
        gerente.setDocumento("9998846769");
        gerente.setEmail("jubileu.santos@gmail.com");

        /*Operador*/
        Operador operador = new Operador();
        operador.setIdFunc(2);
        operador.setNome("jabulane");
        operador.setDocumento("0987654321");
        operador.setEmail("jabulane@gmail.com");
        operador.setValorHora(50.50);

        /*Secretaria*/
        Secretaria secretaria = new Secretaria();
        secretaria.setIdFunc(3);
        secretaria.setNome("João");
        secretaria.setDocumento("12345678901");
        secretaria.setEmail("jose@gmail.com");
        secretaria.setTelefone("(19)3865-3549");
        secretaria.setRamal("169");

        /*Registro de Ponto*/
        RegistroPonto rg1 = new RegistroPonto();
        RegistroPonto rg2 = new RegistroPonto();
        RegistroPonto rg3 = new RegistroPonto();

        Espera();
        rg1.setFunc(gerente);
        rg1.setDataRegistro(LocalDate.now());
        rg1.setHoraEntrada(LocalDateTime.now());
        rg1.apresentarRegistroPonto();

        rg2.setFunc(secretaria);
        rg2.setDataRegistro(LocalDate.now());
        rg2.setHoraEntrada(LocalDateTime.now());
        rg2.apresentarRegistroPonto();

        rg3.setFunc(operador);
        rg3.setDataRegistro(LocalDate.now());
        rg3.setHoraEntrada(LocalDateTime.now());
        rg3.apresentarRegistroPonto();

        rg1.setHoraSaida(LocalDateTime.now());
        rg1.apresentarRegistroPonto();


        rg2.setHoraSaida(LocalDateTime.now());
        rg2.apresentarRegistroPonto();

        rg3.setHoraSaida(LocalDateTime.now());
        rg3.apresentarRegistroPonto();


    }


        public static void Espera(){
            try {
                Thread.sleep( 1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
