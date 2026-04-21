import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidadorUsuarioTest {

    private ValidadorUsuario validador;

    @BeforeEach
    void setup() {
        validador = new ValidadorUsuario();
    }

    @Test
    @DisplayName("NOME: Deve aceitar nome válido (3-20 caracteres)")
    void testNomeValido() {
        assertTrue(validador.validarNomeUsuario("Ana"), "Mínimo de 3 caracteres");
        assertTrue(validador.validarNomeUsuario("Joao Silva"), "Nome comum");
    }

    @Test
    @DisplayName("NOME: Deve rejeitar nomes fora do limite ou nulos")
    void testNomeInvalido() {
        assertFalse(validador.validarNomeUsuario("Ed"), "Muito curto");
        assertFalse(validador.validarNomeUsuario("UmNomeMuitoLongoParaSerAceito"), "Muito longo");
        assertFalse(validador.validarNomeUsuario(null), "Nulo");
    }

    @Test
    @DisplayName("EMAIL: Deve aceitar formato correto")
    void testEmailValido() {
        assertTrue(validador.validarEmail("aluno@escola.com"));
    }

    @Test
    @DisplayName("EMAIL: Deve rejeitar formatos inválidos")
    void testEmailInvalido() {
        assertFalse(validador.validarEmail("emailsemarroba.com"));
        assertFalse(validador.validarEmail("joao@"));
        assertFalse(validador.validarEmail(null));
    }

    @Test
    @DisplayName("SENHA: Deve aceitar senha com letras, números e min 8 caracteres")
    void testSenhaValida() {
        assertTrue(validador.validarSenha("Senha123"));
    }

    @Test
    @DisplayName("SENHA: Deve rejeitar senhas fracas ou curtas")
    void testSenhaInvalida() {
        assertFalse(validador.validarSenha("12345678"), "Sem letras");
        assertFalse(validador.validarSenha("Abcdefgh"), "Sem números");
        assertFalse(validador.validarSenha("Ab1"), "Muito curta");
        assertFalse(validador.validarSenha(null), "Nula");
    }
}