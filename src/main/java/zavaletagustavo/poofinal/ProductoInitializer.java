package zavaletagustavo.poofinal;

import zavaletagustavo.poofinal.productos.*;

public class ProductoInitializer {

    public static ProductoBase[] inicializarProductos() {
        ProductoBase[] productos = new ProductoBase[25];

       
        productos[0] = new Bebidas("Coca Cola", "Coca Cola", 50, 2.5);
        productos[0].agregarClasificacion("Enlatados");
        
        productos[1] = new Bebidas("Pepsi", "PepsiCo", 30, 2.3);
        productos[1].agregarClasificacion("Enlatados");
        
        productos[2] = new Carnes("Pollo", "Pollo S.A.", 20, 5.5);
        productos[2].agregarClasificacion("Congelables");
        
        productos[3] = new Carnes("Carne de Res", "Carnes Ricas", 25, 10);
        productos[3].agregarClasificacion("Congelables");
        
        productos[4] = new Cereales("Avena", "Avena S.A.", 10, 1.5);
        productos[4].agregarClasificacion("Perecibles");
        
        productos[5] = new Cereales("Corn Flakes", "Kellogg's", 15, 3.0);
        productos[5].agregarClasificacion("Perecibles");
        
        productos[6] = new Chucherias("Chicle", "Fruval", 40, 0.5);
        productos[6].agregarClasificacion("Perecibles");
        
        productos[7] = new Chucherias("Galletas", "Nabisco", 60, 1.0);
        productos[7].agregarClasificacion("Perecibles");
        
        productos[8] = new Complementos("Aceite de Oliva", "Olivar", 15, 4.0);
        productos[8].agregarClasificacion("Perecibles");
        
        productos[9] = new Complementos("Sal", "Salinas", 25, 2.0);
        productos[9].agregarClasificacion("Perecibles");
        
        productos[10] = new Lacteos("Leche", "La Lechera", 100, 1.2);
        productos[10].agregarClasificacion("Perecibles");
        
        productos[11] = new Lacteos("Yogurt", "Yoplait", 50, 2.0);
        productos[11].agregarClasificacion("Perecibles");
        
        productos[12] = new Tragos("Vodka", "Smirnoff", 20, 5.0);
        productos[12].agregarClasificacion("Congelables");
        
        productos[13] = new Tragos("Whisky", "Johnnie Walker", 15, 15.0);
        productos[13].agregarClasificacion("Congelables");
        
        productos[14] = new Bebidas("Jugo de Naranja", "Tropicana", 30, 3.0);
        productos[14].agregarClasificacion("Perecibles");
        
        productos[15] = new Carnes("Pechuga de Pollo", "Pollo Real", 20, 7.0);
        productos[15].agregarClasificacion("Congelables");
        
        productos[16] = new Chucherias("Chocolates", "Lindt", 40, 2.5);
        productos[16].agregarClasificacion("Perecibles");
        
        productos[17] = new Cereales("Muesli", "Quaker", 10, 3.5);
        productos[17].agregarClasificacion("Perecibles");
        
        productos[18] = new Complementos("Mayonesa", "Hellmann's", 50, 1.5);
        productos[18].agregarClasificacion("Perecibles");
        
        productos[19] = new Lacteos("Queso", "Laive", 30, 4.0);
        productos[19].agregarClasificacion("Perecibles");
        
        productos[20] = new Tragos("Tequila", "Jose Cuervo", 25, 10.0);
        productos[20].agregarClasificacion("Congelables");
        
        productos[21] = new Bebidas("Agua", "Nestle", 100, 1.0);
        productos[21].agregarClasificacion("Enlatados");
        
        productos[22] = new Carnes("Pescado", "Pesca S.A.", 35, 6.5);
        productos[22].agregarClasificacion("Congelables");
        
        productos[23] = new Cereales("Rice Krispies", "Kellogg's", 15, 2.0);
        productos[23].agregarClasificacion("Perecibles");
        
        productos[24] = new Chucherias("Gomitas", "Haribo", 40, 1.0);
        productos[24].agregarClasificacion("Perecibles");

        return productos;
    }
}
