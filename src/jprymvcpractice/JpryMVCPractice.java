package jprymvcpractice;
import Controller.clsController;
import Model.clsOperaciones;
import View.frmCuadrado;
import View.frmMain;
import View.frmRectangulo;
import View.frmTriangulo;
public class JpryMVCPractice {
    public static void main(String[] args) {
        frmMain vista = new frmMain();
        clsOperaciones model = new clsOperaciones();
        frmCuadrado cu=new frmCuadrado();
        frmTriangulo tr=new frmTriangulo();
        frmRectangulo rec=new frmRectangulo();
        clsController controller=new clsController(vista, model, cu, tr, rec);
        controller.load();
    }
}
