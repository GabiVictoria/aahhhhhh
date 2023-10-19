module br.mestres.gerenciadordetarefas {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.persistence;


    opens br.mestres.gerenciadordetarefas to javafx.fxml;
    exports br.mestres.gerenciadordetarefas;
}