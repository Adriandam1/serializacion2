import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;

public class Product  implements Serializable {

    private String codigo;
    private String descricion;
    private Double prezo;

    // Constructor pordefecto con valores null, null y 0
    public Product() {
        this.codigo = null;
        this.descricion = null;
        this.prezo = 0.0;
    }
    // Constructor con parametros
    public Product(String codigo, String descricion, Double prezo) {
        this.codigo = codigo;
        this.descricion = descricion;
        this.prezo = prezo;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDescricion() {
        return descricion;
    }
    public void setDescricion(String descricion) {
        this.descricion = descricion;
    }
    public Double getPrezo() {
        return prezo;
    }
    public void setPrezo(Double prezo) {
        this.prezo = prezo;
    }
    //Metodo guardar un producto
    public void guardarProducto(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeUTF(codigo);
        dataOutputStream.writeUTF(descricion);
        dataOutputStream.writeDouble(prezo);
    }
    // Metodo para cargar un producto
    public void cargarProducto(DataInputStream dataInputStream) throws IOException {
        this.codigo = dataInputStream.readUTF();
        this.descricion = dataInputStream.readUTF();
        this.prezo = dataInputStream.readDouble();
    }
}
