package co.edu.uniquindio.poo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    private Parqueadero parqueadero;
    private Timer timer;
    private int tiempoSimulado; // Contador para el tiempo simulado
    private JLabel tiempoSimuladoLabel;
    private JTextArea outputArea;
    private JLabel totalRecaudadoLabel;

    public App() {
        int tamanio = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese el tamaño del parqueadero:"));
        parqueadero = new Parqueadero(tamanio); // Tamaño del parqueadero
        tiempoSimulado = 0; // Inicializar el tiempo simulado

        initComponents();
    }

    private void initComponents() {
        setTitle("Gestión de Parqueadero");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel superior con título
        JPanel panelTitulo = new JPanel();
        panelTitulo.setBackground(new Color(0, 102, 204));
        JLabel titulo = new JLabel("Gestión de Parqueadero", JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setForeground(Color.WHITE);
        panelTitulo.add(titulo);
        add(panelTitulo, BorderLayout.NORTH);

        // Panel central con botones
        JPanel panelCentral = new JPanel();
        panelCentral.setLayout(new GridLayout(8, 1, 10, 10));
        panelCentral.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JButton verificarDisponibilidadBtn = new JButton("Verificar Disponibilidad");
        JButton ubicarVehiculoBtn = new JButton("Ubicar Vehículo");
        JButton liberarPuestoBtn = new JButton("Liberar Puesto");
        JButton identificarPropietarioBtn = new JButton("Identificar Propietario");
        JButton configurarTarifasBtn = new JButton("Configurar Tarifas");
        JButton generarReporteDiarioBtn = new JButton("Generar Reporte Diario");
        JButton generarReporteMensualBtn = new JButton("Generar Reporte Mensual");
        JButton iniciarSimulacionBtn = new JButton("Iniciar Simulación");

        verificarDisponibilidadBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificarDisponibilidad();
            }
        });

        ubicarVehiculoBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ubicarVehiculo();
            }
        });

        liberarPuestoBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liberarPuesto();
            }
        });

        identificarPropietarioBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                identificarPropietario();
            }
        });

        configurarTarifasBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                configurarTarifas();
            }
        });

        generarReporteDiarioBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generarReporteDiario();
            }
        });

        generarReporteMensualBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generarReporteMensual();
            }
        });

        iniciarSimulacionBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iniciarSimulacion();
            }
        });

        panelCentral.add(verificarDisponibilidadBtn);
        panelCentral.add(ubicarVehiculoBtn);
        panelCentral.add(liberarPuestoBtn);
        panelCentral.add(identificarPropietarioBtn);
        panelCentral.add(configurarTarifasBtn);
        panelCentral.add(generarReporteDiarioBtn);
        panelCentral.add(generarReporteMensualBtn);
        panelCentral.add(iniciarSimulacionBtn);

        add(panelCentral, BorderLayout.CENTER);

        // Panel inferior para mostrar el tiempo simulado
        JPanel panelInferior = new JPanel();
        tiempoSimuladoLabel = new JLabel("Tiempo simulado: 0 horas", JLabel.CENTER);
        panelInferior.add(tiempoSimuladoLabel);
        add(panelInferior, BorderLayout.SOUTH);

        // Output area for displaying messages
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        add(scrollPane, BorderLayout.EAST);

        // Label for total recaudo
        totalRecaudadoLabel = new JLabel("Total Recaudado: 0", JLabel.CENTER);
        panelInferior.add(totalRecaudadoLabel);
    }

    private void verificarDisponibilidad() {
        int i = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la fila del puesto:"));
        int j = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la columna del puesto:"));

        boolean disponible = parqueadero.verificarDisponibilidad(i, j);
        JOptionPane.showMessageDialog(this, disponible ? "El puesto está disponible." : "El puesto está ocupado.");
    }

    private void ubicarVehiculo() {
        int i = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la fila del puesto:"));
        int j = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la columna del puesto:"));
        String tipoVehiculo = JOptionPane.showInputDialog(this, "Ingrese el tipo de vehículo (carro/moto):");

        Vehiculo vehiculo;
        if (tipoVehiculo.equalsIgnoreCase("carro")) {
            String placa = JOptionPane.showInputDialog(this, "Ingrese la placa del carro:");
            String modelo = JOptionPane.showInputDialog(this, "Ingrese el modelo del carro:");
            String nombrePropietario = JOptionPane.showInputDialog(this, "Ingrese el nombre del propietario:");
            Propietario propietario = new Propietario(nombrePropietario, nombrePropietario);
            vehiculo = new Carro(placa, modelo, propietario);
        } else if (tipoVehiculo.equalsIgnoreCase("moto")) {
            String placa = JOptionPane.showInputDialog(this, "Ingrese la placa de la moto:");
            String modelo = JOptionPane.showInputDialog(this, "Ingrese el modelo de la moto:");
            String nombrePropietario = JOptionPane.showInputDialog(this, "Ingrese el nombre del propietario:");
            Propietario propietario = new Propietario(nombrePropietario, nombrePropietario);
            String tipoMoto = JOptionPane.showInputDialog(this, "Ingrese el tipo de moto (clasica/hibrida):");
            double velocidadMaxima = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese la velocidad máxima de la moto:"));
            TipoMoto tipo = tipoMoto.equalsIgnoreCase("clasica") ? TipoMoto.CLASICA : TipoMoto.HIBRIDA;
            vehiculo = new Moto(placa, modelo, propietario, tipo, velocidadMaxima);
        } else {
            JOptionPane.showMessageDialog(this, "Tipo de vehículo no válido.");
            return;
        }

        parqueadero.ubicarVehiculo(i, j, vehiculo);
        outputArea.append("Vehículo ubicado en [" + i + ", " + j + "]\n");
    }

    private void liberarPuesto() {
        int i = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la fila del puesto:"));
        int j = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la columna del puesto:"));
        int horasEstacionado = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese las horas estacionado:"));

        parqueadero.liberarPuesto(i, j);
        outputArea.append("Puesto liberado en [" + i + ", " + j + "]\n");
        totalRecaudadoLabel.setText("Total Recaudado: " + parqueadero.getTotalRecaudadoDiario());
    }

    private void identificarPropietario() {
        int i = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la fila del puesto:"));
        int j = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la columna del puesto:"));

        Propietario propietario = parqueadero.identificarPropietario(i, j);
        if (propietario != null) {
            JOptionPane.showMessageDialog(this, "Propietario: " + propietario.getNombre());
        } else {
            JOptionPane.showMessageDialog(this, "El puesto está vacío.");
        }
    }

    private void configurarTarifas() {
        double tarifaCarro = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese la tarifa por hora para carros:"));
        double tarifaMotoClasica = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese la tarifa por hora para motos clásicas:"));
        double tarifaMotoHibrida = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese la tarifa por hora para motos híbridas:"));

        parqueadero.configurarTarifasPorHora(tarifaCarro, tarifaMotoClasica, tarifaMotoHibrida);
        outputArea.append("Tarifas configuradas\n");
    }

    private void generarReporteDiario() {
        parqueadero.generarReporteDiario();
        outputArea.append("Reporte diario generado\n");
    }

    private void generarReporteMensual() {
        parqueadero.generarReporteMensual();
        outputArea.append("Reporte mensual generado\n");
    }

    private void iniciarSimulacion() {
        if (timer == null || !timer.isRunning()) {
            timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tiempoSimulado++;
                    tiempoSimuladoLabel.setText("Tiempo simulado: " + tiempoSimulado + " horas");
                }
            });
            timer.start();
            JOptionPane.showMessageDialog(this, "Simulación iniciada.");
        } else {
            timer.stop();
            JOptionPane.showMessageDialog(this, "Simulación detenida.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App().setVisible(true);
            }
        });
    }
}
