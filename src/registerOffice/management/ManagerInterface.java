package registerOffice.management;

import java.util.List;

public interface ManagerInterface<TEntity> {
	public TEntity get(Condition<TEntity> condition);
	public List<TEntity> getAll();
	public boolean save(TEntity obj);
	public boolean delete(TEntity obj);
	
	/**
	 * inne metody
	 */

}
