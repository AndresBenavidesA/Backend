package co.edu.iudigital.app.service.iface;

import co.edu.iudigital.app.model.entity.Users;

public interface UsersService {
	/**
	 * 
	 * @param users
	 */
	public void create(Users users);
	/**
	 * 
	 * @param users
	 * @return
	 * @throws Exception
	 */
	public Users login(Users users) throws Exception;
}
