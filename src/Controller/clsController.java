package Controller;
import Model.clsOperaciones;
import View.frmCuadrado;
import View.frmMain;
import View.frmRectangulo;
import View.frmTriangulo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class clsController implements ActionListener {
    frmCuadrado cuadrado;
    private frmTriangulo tr; 
    private frmRectangulo rec;
    private frmMain vista;
    private clsOperaciones modelo=new clsOperaciones();
    public clsController(frmMain vista, clsOperaciones modelo, frmCuadrado cuadrado, frmTriangulo tr, frmRectangulo rec) {
        this.vista = vista;
        this.modelo = modelo;
        this.cuadrado=cuadrado;
        this.tr=tr;
        this.rec=rec;
    }
    public void load(){
        vista.setTitle("Main");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        
        //main
        this.vista.jmTriangulo.addActionListener(this);
        this.vista.jmRectangulo.addActionListener(this);
        this.vista.jmCuadrado.addActionListener(this);
        //cuadrado
        this.cuadrado.btnArea.addActionListener(this);
        this.cuadrado.btnPerimetro.addActionListener(this);
        //triangulo
        this.tr.btnArea.addActionListener(this);
        this.tr.btnPerimetro.addActionListener(this);
        //rectangulo
        this.rec.btnArea.addActionListener(this);
        this.rec.btnPerimetro.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //main
        if (e.getSource() == vista.jmTriangulo) {
            loadTriangulo();
        }
        if (e.getSource() == vista.jmCuadrado) {
            loadCuadrado();
        }
        if (e.getSource() == vista.jmRectangulo) {
            loadRectangulo();
        }
        //cuadrado
        if (e.getSource() == cuadrado.btnArea) {
            this.modelo.setA(Double.parseDouble(this.cuadrado.txtLadoa.getText()));
            this.cuadrado.txtRa.setText(this.modelo.areaCuadrado()+"");
        }
        if(e.getSource()==cuadrado.btnPerimetro){
           this.modelo.setA(Double.parseDouble(this.cuadrado.txtLadop.getText()));
           this.cuadrado.txtRp.setText(this.modelo.PerimetroCuadrado()+"");
        }
        //triangulo
        if(e.getSource()==tr.btnArea){
           this.modelo.setA(Double.parseDouble(this.tr.txtBase.getText()));
           this.modelo.setB(Double.parseDouble(this.tr.txtAltura.getText()));
           this.tr.txtRa.setText(this.modelo.areaTriangulo()+"");
        }
           if(e.getSource()==tr.btnPerimetro){
            this.modelo.setA(Double.parseDouble(this.tr.txtLado.getText()));
            this.tr.txtRp.setText(this.modelo.perimetrotriangulo()+"");
        }
        //rectangulo
        if(e.getSource()==rec.btnArea){
            this.modelo.setA(Double.parseDouble(this.rec.txtBasea.getText()));
            this.modelo.setB(Double.parseDouble(this.rec.txtAlturaa.getText()));
            this.rec.txtRa.setText(this.modelo.areaRectangulo()+"");
        }
        if(e.getSource()==rec.btnPerimetro){
            this.modelo.setA(Double.parseDouble(this.rec.txtBasep.getText()));
            this.modelo.setB(Double.parseDouble(this.rec.txtAlturap.getText()));
            this.rec.txtRp.setText(this.modelo.perimetroRectagulo()+"");
        }
    }
    public void loadCuadrado(){
        this.cuadrado.setTitle("Cuadrado");
        this.cuadrado.setLocationRelativeTo(null);
        this.cuadrado.setVisible(true);
    }
    public void loadTriangulo(){
        this.tr.setTitle("Triangulo");
        this.tr.setLocationRelativeTo(null);
        this.tr.setVisible(true);
    }
    public void loadRectangulo(){
        this.rec.setTitle("Rectangulo");
        this.rec.setLocationRelativeTo(null);
        this.rec.setVisible(true);
    }
}
