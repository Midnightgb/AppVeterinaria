package aplicacion.veterinaria.GUI;

import javax.swing.JButton;
import javax.swing.JTextArea;

class ComponentTrio {

    private JButton btnActualizar;
    private JButton btnEditar;
    private JTextArea notaActividad;
    
    public ComponentTrio(JButton btnActualizar, JButton btnEditar, JTextArea notaActividad) {
        this.btnActualizar = btnActualizar;
        this.btnEditar = btnEditar;
        this.notaActividad = notaActividad;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public JButton getBtnEditar() {
        return btnEditar;
    }

    public JTextArea getTextArea() {
        return notaActividad;
    }
}

