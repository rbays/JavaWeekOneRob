package DayFour.productExample;
import static DayFour.productExample.ProductGeneration.*;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 30-Jun-16.
 */
public class ProductGUI extends JFrame {

    Connection conn;
    String username = "root";
    String password = "Password100";
    String url = "jdbc:mysql://localhost:3306/awesome?UseSSL=false";

    private JTextField nameBox, genreBox, devBox, priceBox;
    private JButton btnPrev, btnNext;

    public static ArrayList<Game>  games = new ArrayList<>();
    int gameIndex;

    ProductGUI(){
        super("Games List");



        setSize(500,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        createComponents();

        setVisible(true);

        games.add(portal);
        games.add(xcom);
        games.add(tts);
        games.add(lol);
    }

    private void createComponents(){
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        setContentPane(panel);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        newMenuItem.addActionListener(event ->{

        });
        JMenuItem loadItems = new JMenuItem("Load");
        loadItems.addActionListener(event ->{
            loadGames();
        });
        JMenuItem createDB = new JMenuItem("CreateDB");
        createDB.addActionListener(event ->{
            try{
                implementDb();
            }catch(Exception e){
                e.printStackTrace();
            }
        });

        fileMenu.add(newMenuItem);
        fileMenu.add(loadItems);
        fileMenu.add(createDB);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);




        panel.add(createFieldComponents(),BorderLayout.CENTER);
        panel.add(createButtonComponents(),BorderLayout.SOUTH);

    }

    public JPanel createFieldComponents(){
        JPanel fieldPanel = new JPanel();
        fieldPanel.setLayout(new GridLayout(4,2,5,5));

        fieldPanel.add(new JLabel("Name"));
        nameBox = new JTextField();
        fieldPanel.add(nameBox);

        fieldPanel.add(new JLabel("Genre"));
        genreBox = new JTextField();
        fieldPanel.add(genreBox);

        fieldPanel.add(new JLabel("Dev"));
        devBox = new JTextField();
        fieldPanel.add(devBox);

        fieldPanel.add(new JLabel("Price"));
        priceBox = new JTextField();
        fieldPanel.add(priceBox);

        return fieldPanel;
    }

    public JPanel createButtonComponents(){
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        btnPrev = new JButton("Prev");
        btnNext = new JButton("Next");
        btnNext.setEnabled(false);
        btnPrev.setEnabled(false);


        btnPrev.addActionListener(event ->{
            prevClick();
        });

        btnNext.addActionListener(event ->{
            nextClick();
        });

        buttonPanel.add(btnPrev);
        buttonPanel.add(btnNext);

        return buttonPanel;
    }

    public  void nextClick(){
        gameIndex +=1;
        gameIndex = gameIndex % games.size();
        nameBox.setText(games.get(gameIndex).getTitle());
        genreBox.setText(games.get(gameIndex).getGenre());
        devBox.setText(games.get(gameIndex).getDev());
        priceBox.setText("£" + Double.toString(games.get(gameIndex).getPrice()));

    }
    public void  prevClick(){
        gameIndex += games.size() - 1;
        gameIndex = gameIndex % games.size();
        nameBox.setText(games.get(gameIndex).getTitle());
        genreBox.setText(games.get(gameIndex).getGenre());
        devBox.setText(games.get(gameIndex).getDev());
        priceBox.setText("£" + Double.toString(games.get(gameIndex).getPrice()));

    }

    public void loadGames(){
        gameIndex = -1;
        btnNext.setEnabled(true);
        btnPrev.setEnabled(true);
        nextClick();


    }
    public void implementDb() throws Exception{
        //get the driver
        Class.forName("com.mysql.jdbc.Driver");

        conn = DriverManager.getConnection(url,username,password);
        new MySQLDb(conn).createDatabaseTable();
        conn.close();
    }






    public static void main(String[] args){
        new ProductGUI();
    }
}
