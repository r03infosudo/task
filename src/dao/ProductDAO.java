package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Incoming;
import bean.Product;

public class ProductDAO extends DAO {

	public List<Incoming> search() throws Exception {
		List<Incoming> list=new ArrayList<>();

		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
			"select * from product_master");

		ResultSet rs=st.executeQuery();

		while (rs.next()) {
			Incoming i=new Incoming();
			i.setProductCode(rs.getString("product_code"));
			list.add(i);
		}

		st.close();
		con.close();

		return list;
	}
	
	public List<Product> search(String keyword) throws Exception {
		List<Product> list=new ArrayList<>();

		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
			"select * from product_master where product_code = ?");
		st.setString(1, keyword);
		ResultSet rs=st.executeQuery();

		while (rs.next()) {
			Product p=new Product();
			p.setProductName(rs.getString("product_name"));
			list.add(p);
		}

		st.close();
		con.close();

		return list;
	}
}
