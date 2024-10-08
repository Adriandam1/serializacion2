import java.io.*;

public class Main {
    public static void main(String[] args) {
        String[] cod = {"p1", "p2", "p3"};
        String[] desc = {"parafusos", "cravos", "tachas"};
        double[] prezo = {3.0, 4.0, 5.0};

        //Serializar los objetos en el archivo 'products.dat'
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("products.dat"))) {
            for (int i = 0; i < cod.length; i++) {
                Product product = new Product(cod[i], desc[i], prezo[i]);
                oos.writeObject(product);
            }
            oos.writeObject(null); //Escribir un null al final para indicar el final
            System.out.println("Obxectos gravados correctamente en 'products.dat'.");
        } catch (IOException e) {
            System.out.println("Erro ao gravar os obxectos: " + e.getMessage());
        }

        // Desserializar los objetos del archivo 'products.dat'
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("products.dat"))) {
            Product product;
            while (true) {
                product = (Product) ois.readObject();
                if (product == null) break; // se para si encuentra null(acaba)
                System.out.println("Detalles do produto recuperado:");
                System.out.println("Código: " +product.getCodigo());
                System.out.println("Descrición: " +product.getDescricion());
                System.out.println("Prezo: " +product.getPrezo() +"\n"); // salto de linea para separar

            }
        } catch (EOFException e) {
            System.out.println("Fin do ficheiro alcanzado.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao ler os obxectos: " + e.getMessage());
        }
    }
}
