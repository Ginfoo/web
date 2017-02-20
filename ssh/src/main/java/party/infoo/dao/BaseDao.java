package party.infoo.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by infoo on 2017/2/21.
 */
public interface BaseDao<T> {
    public Serializable insertObject(T o);

    public void deleteObject(T o);

    public void updateObject(T o);

    public T getObject(Class<T> c, Serializable id);

    public List<T> selectObjects(String hql, Object[] param);

    public Object login(String hql,String name,String pass);
}
