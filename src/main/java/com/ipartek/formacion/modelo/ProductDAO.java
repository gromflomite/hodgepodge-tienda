package com.ipartek.formacion.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAO {

    /**
     * 
     * Busca productos de acuerdo con los parámetros indicados
     * 
     * @param nombreProducto	String	Busca la cadena dentro del nombre del producto. Si queremos todos, pasar vacío ("")
     * @param precioMin		float	Si no queremos filtrar, pasar 0 ó valor negativo
     * @param precioMax		float	Si no queremos filtrar, pasar 0 ó valor negativo
     * @param idFabricante	int	Si queremos todos, pasar vacío ("")
     * @return	 		Listado de productos. Si no hay resultados, devuelve lista vacía pero inicializada
     *     
     */

    public ArrayList<Producto> buscar(String nombreProducto, float precioMin, float precioMax, int idFabricante) throws ClassNotFoundException, SQLException {

	ArrayList<Producto> dbRegisters = new ArrayList<Producto>();
	
	String sqlQuery = " SELECT p.id AS 'producto_id', p.nombre AS 'producto_nombre', p.precio, p.descripcion, p.fk_fabricante, f.id AS 'fabricante_id', f.nombre AS 'fabricante_nombre' FROM productos AS p, fabricantes AS f WHERE p.fk_fabricante = f.id ORDER by p.id DESC LIMIT 10; ";
	
	try (
		Connection dBconnection = ConnectionManager.getConnection(); 
		PreparedStatement pst = dBconnection.prepareStatement(sqlQuery);) {

	    try (ResultSet dbResultSet = pst.executeQuery()) {

		Producto producto;
		Fabricante fabricante;

		while (dbResultSet.next()) {

		    producto = new Producto();

		    producto.setId		(dbResultSet.getInt("producto_id"));
		    producto.setNombre		(dbResultSet.getString("producto_nombre"));
		    producto.setPrecio		(dbResultSet.getFloat("precio"));
		    producto.setDescripcion	(dbResultSet.getString("descripcion"));
		    
		    fabricante = new Fabricante();
		    
		    fabricante.setId		(dbResultSet.getInt("fabricante_id"));
		    fabricante.setNombre	(dbResultSet.getString("fabricante_nombre"));
		    
		    producto.setFabricante(fabricante);		    		    

		    dbRegisters.add(producto);
		}

	    }

	}

	return dbRegisters;
    }

}
