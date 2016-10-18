package DataService;
import po.MemberPO;
public interface MemberDataService {

	/**
	 * insert
	 * @param po
	 */
	public void insert(MemberPO po);
	
	/**
	 * update
	 * @param po
	 */
	public void update(MemberPO po);
}
