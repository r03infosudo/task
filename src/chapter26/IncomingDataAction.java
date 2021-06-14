package chapter26;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Incoming;
import bean.Product;
import dao.EmployeeDAO;
import dao.ProductDAO;
import dao.SupplierDAO;
import dao.WarehouseDAO;
import tool.Action;

public class IncomingDataAction extends Action {
	public String execute(
		HttpServletRequest request, HttpServletResponse response
		) throws Exception {
		
			Map<String, List<Product>> proMap = new HashMap<String, List<Product>>();
		
			ProductDAO proDao=new ProductDAO();     //商品マスタ(材料マスタ)
			SupplierDAO supDao=new SupplierDAO();   //仕入先マスタ
			WarehouseDAO warDao=new WarehouseDAO(); //倉庫マスタ
			EmployeeDAO empDao = new EmployeeDAO(); //社員マスタ

			//データベースから取得したデータをそれぞれリストに代入
			List<Incoming> proList=proDao.search();
			for (Incoming a : proList) {
				proMap.put(a.getProductCode(), proDao.search(a.getProductCode()));
			}
			
			//単一のキーと複数の値の連想配列
			for (Incoming i : proList) {
				List<Product> hoge = proMap.get(i.getProductCode());
				for (Product p : hoge) {
					System.out.println(p.getProductName());
				}
			}
			List<Incoming> supList=supDao.search();
			List<Incoming> warList=warDao.search();
			List<Incoming> empList=empDao.search();

			//リクエスト属性に設定する
			request.setAttribute("supList", supList);
			request.setAttribute("proList", proList);
			request.setAttribute("warList", warList);
			request.setAttribute("empList", empList);
			request.setAttribute("proMap", proMap);

			return "incoming.jsp";
	}
}