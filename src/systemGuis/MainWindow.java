package systemGuis;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    private ConstructionsManagementSystem sistema;

    public MainWindow() {
        // Inicializar el sistema de gestión de obras
        sistema = new ConstructionsManagementSystem();

        // Configurar la ventana principal
        setTitle("Gestión de Pequeñas Obras");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear la pantalla de bienvenida
        JPanel welcomePanel = new JPanel();
        welcomePanel.setLayout(new BorderLayout());
        JLabel welcomeLabel = new JLabel("Bienvenido al Sistema de Gestión de Pequeñas Obras", JLabel.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        welcomePanel.add(welcomeLabel, BorderLayout.CENTER);

        // Mostrar los nombres y números de estudiante de los autores
        JLabel authorsLabel = new JLabel("Autores: Nombre1 (Número1), Nombre2 (Número2)", JLabel.CENTER);
        authorsLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        welcomePanel.add(authorsLabel, BorderLayout.SOUTH);

        // Añadir la pantalla de bienvenida a la ventana principal
        add(welcomePanel);

        // Crear un temporizador para mostrar la pantalla de bienvenida durante unos segundos
        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cambiar a la pantalla de selección de modo
                showModeSelectionScreen();
            }
        });
        timer.setRepeats(false);
        timer.start();
    }

    private void showModeSelectionScreen() {
        // Limpiar la ventana
        getContentPane().removeAll();
        revalidate();
        repaint();

        // Crear la pantalla de selección de modo
        JPanel modeSelectionPanel = new JPanel();
        modeSelectionPanel.setLayout(new GridLayout(3, 1));

        JButton newSystemButton = new JButton("Nuevo Sistema Completamente Vacío");
        newSystemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Inicializar el sistema completamente vacío
                sistema = new ConstructionsManagementSystem();
                showMainMenu();
            }
        });

        JButton loadSystemButton = new JButton("Cargar Sistema Guardado Previamente");
        loadSystemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para cargar el sistema guardado
                cargarSistemaGuardado();
                showMainMenu();
            }
        });

        JButton loadDummyDataButton = new JButton("Cargar Datos Ficticios Precargados");
        loadDummyDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cargar datos ficticios
                cargarDatosFicticios();
                showMainMenu();
            }
        });

        modeSelectionPanel.add(newSystemButton);
        modeSelectionPanel.add(loadSystemButton);
        modeSelectionPanel.add(loadDummyDataButton);

        add(modeSelectionPanel);
        revalidate();
        repaint();
    }

    private void showMainMenu() {
        // Limpiar la ventana
        getContentPane().removeAll();
        revalidate();
        repaint();

        // Crear la barra de menú
        JMenuBar menuBar = new JMenuBar();

        // Menú de registros
        JMenu registrosMenu = new JMenu("Registros");
        JMenuItem registrarRubroItem = new JMenuItem("Registrar/Modificar Rubro");
        registrarRubroItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar la ventana de registro de rubros
                showRegistroRubro();
            }
        });
        registrosMenu.add(registrarRubroItem);

        JMenuItem registrarCapatazItem = new JMenuItem("Registrar Capataz");
        registrarCapatazItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar la ventana de registro de capataz
                showRegistroCapataz();
            }
        });
        registrosMenu.add(registrarCapatazItem);

        JMenuItem registrarPropietarioItem = new JMenuItem("Registrar Propietario");
        registrarPropietarioItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar la ventana de registro de propietario
                showRegistroPropietario();
            }
        });
        registrosMenu.add(registrarPropietarioItem);

        JMenuItem registrarObraItem = new JMenuItem("Registrar Obra");
        registrarObraItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar la ventana de registro de obra
                showRegistroObra();
            }
        });
        registrosMenu.add(registrarObraItem);

        menuBar.add(registrosMenu);

        // Menú de gastos
        JMenu gastosMenu = new JMenu("Gastos");
        JMenuItem registrarGastoItem = new JMenuItem("Registrar Gasto");
        registrarGastoItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar la ventana de registro de gasto
                showRegistroGasto();
            }
        });
        gastosMenu.add(registrarGastoItem);

        JMenuItem pagarGastoItem = new JMenuItem("Pago de Gasto");
        pagarGastoItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar la ventana de pago de gasto
                showPagoGasto();
            }
        });
        gastosMenu.add(pagarGastoItem);

        menuBar.add(gastosMenu);

        // Menú de estado de obra
        JMenu estadoMenu = new JMenu("Estado de Obra");
        JMenuItem estadoObraItem = new JMenuItem("Ver Estado de Obra");
        estadoObraItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar la ventana de estado de obra
                showEstadoObra();
            }
        });
        estadoMenu.add(estadoObraItem);

        menuBar.add(estadoMenu);

        // Menú de importación y exportación
        JMenu ioMenu = new JMenu("Importación y Exportación");
        JMenuItem importarItem = new JMenuItem("Importar Datos de Obra");
        importarItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar la ventana de importación de datos
                showImportarDatos();
            }
        });
        ioMenu.add(importarItem);

        JMenuItem exportarItem = new JMenuItem("Exportar Datos de Personas");
        exportarItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar la ventana de exportación de datos
                showExportarDatos();
            }
        });
        ioMenu.add(exportarItem);

        menuBar.add(ioMenu);

        setJMenuBar(menuBar);
        revalidate();
        repaint();
    }

    private void showRegistroRubro() {
        // Implementar la lógica para mostrar la ventana de registro de rubros
    }

    private void showRegistroCapataz() {
        // Implementar la lógica para mostrar la ventana de registro de capataces
    }

    private void showRegistroPropietario() {
        // Implementar la lógica para mostrar la ventana de registro de propietarios
    }

    private void showRegistroObra() {
        // Implementar la lógica para mostrar la ventana de registro de obras
    }

    private void showRegistroGasto() {
        // Implementar la lógica para mostrar la ventana de registro de gastos
    }

    private void showPagoGasto() {
        // Implementar la lógica para mostrar la ventana de pago de gastos
    }

    private void showEstadoObra() {
        // Implementar la lógica para mostrar la ventana de estado de obra
    }

    private void showImportarDatos() {
        // Implementar la lógica para mostrar la ventana de importación de datos
    }

    private void showExportarDatos() {
        // Implementar la lógica para mostrar la ventana de exportación de datos
    }

    private void cargarSistemaGuardado() {
        // Implementar la lógica para cargar el sistema guardado
    }

    private void cargarDatosFicticios() {
        // Implementar la lógica para cargar datos ficticios
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
}
