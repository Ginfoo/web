package party.infoo.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import party.infoo.dao.BaseDao;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * Created by infoo on 2017/2/21.
 */
@Repository("baseDao")
public class BaseDaoImpl<T> implements BaseDao<T> {
    @Resource
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public Serializable insertObject(T o) {

        return this.getCurrentSession().save(o);
    }

    @Override
    public void deleteObject(T o) {
        this.getCurrentSession().delete(o);
    }

    @Override
    public void updateObject(T o) {
        this.getCurrentSession().saveOrUpdate(o);
    }

    @Override
    public T getObject(Class<T> c, Serializable id) {
        return (T) this.getCurrentSession().get(c, id);
    }

    @Override
    public List<T> selectObjects(String hql, Object[] param) {
        Query query = this.getCurrentSession().createQuery(hql);
        if (param != null && param.length > 0) {
            for (int i = 0; i < param.length; i++) {
                query.setParameter(i, param[i]);
            }
        }
        return query.list();
    }

    @Override
    public Object login(String hql, String name,String pass) {
        Query query = this.getCurrentSession().createQuery(hql);
        query.setParameter(0, name);
        query.setParameter(1, pass);
        if (query.list().size() == 1) {
            return query.list().toArray()[0];
        } else {
            return null;
        }
    }
}
