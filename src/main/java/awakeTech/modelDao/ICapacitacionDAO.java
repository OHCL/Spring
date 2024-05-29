package awakeTech.modelDao;

import awakeTech.Spring.modelos.capacitacion;
import java.util.List;
import java.sql.SQLException;

public interface ICapacitacionDAO {
    // Method to save a capacitacion
    void save(capacitacion cap) throws SQLException;

    // Method to update a capacitacion
    boolean update(capacitacion cap) throws SQLException;

    // Method to delete a capacitacion
    boolean delete(int id) throws SQLException;

    // Method to get a single capacitacion
    capacitacion get(int id) throws SQLException;

    // Method to get all capacitaciones
    List<capacitacion> getAll() throws SQLException;
}
