package awakeTech.modelDao;

import awakeTech.Spring.modelos.capacitacion;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class CapacitacionDAOImpl implements ICapacitacionDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");

    public void save(capacitacion cap) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(cap);
        em.getTransaction().commit();
        em.close();
    }

    public capacitacion get(int id) {
        EntityManager em = emf.createEntityManager();
        capacitacion cap = em.find(capacitacion.class, id);
        em.close();
        return cap;
    }

    public List<capacitacion> getAll() {
        EntityManager em = emf.createEntityManager();
        TypedQuery<capacitacion> query = em.createQuery("SELECT c FROM capacitacion c", capacitacion.class);
        List<capacitacion> caps = query.getResultList();
        em.close();
        return caps;
    }

    public boolean delete(int id) {
        EntityManager em = emf.createEntityManager();
        capacitacion cap = em.find(capacitacion.class, id);
        if (cap != null) {
            em.getTransaction().begin();
            em.remove(cap);
            em.getTransaction().commit();
            em.close();
            return true;
        } else {
            em.close();
            return false;
        }
    }

    public boolean update(capacitacion cap) {
        EntityManager em = emf.createEntityManager();
        capacitacion existingCap = em.find(capacitacion.class, cap.getId());
        if (existingCap != null) {
            em.getTransaction().begin();
            existingCap.setNombre(cap.getNombre());
            existingCap.setDescripcion(cap.getDescripcion());
            em.getTransaction().commit();
            em.close();
            return true;
        } else {
            em.close();
            return false;
        }
    }
}
