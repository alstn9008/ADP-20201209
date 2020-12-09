import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class MyPanel here.
 *
 * @author (2017210105 김민수, 2019315066 사사키야스오)
 * @version (2020.12.09)
 */
public class MyPanel extends JPanel implements ActionListener
{
    JTextField tfName;
    JTextField tfDept;
    JTextField tfAddress;
    JTextArea taResult;
    
    String[] grade = {"1학년", "2학년", "3학년", "4학년"};
    JButton bAdd;
    JButton bClear;
    public MyPanel()
    {
        this.add(new JLabel("이름 "));
        tfName = new JTextField(25);
        this.add(tfName);

        this.add(new JLabel("학과 "));
        tfDept = new JTextField(" 글로벌소프트웨어학과", 25);   
        this.add(tfDept);   
        
        this.add(new JLabel("주소 "));
        tfAddress = new JTextField("아산시...", 25);
        this.add(tfAddress);
        
        JComboBox<String> gradeCombo = new JComboBox<String>(grade);
        this.add(gradeCombo);
        
        bAdd = new JButton("추가");
        bClear = new JButton("Clear");
        this.add(bAdd);
        this.add(bClear);
        
        taResult = new JTextArea(7, 20);
        this.add(new JScrollPane(taResult));
    }
    
    public void actionPerformed(ActionEvent e)
    {
        
    }
}
