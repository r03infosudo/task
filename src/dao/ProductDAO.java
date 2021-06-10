package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Product;
import bean.Incoming;

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

	public int insert(Product product) throws Exception {
		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
			"insert into product values(null, ?, ?)");
		st.setString(1, product.getName());
		st.setInt(2, product.getPrice());
		int line=st.executeUpdate();

		st.close();
		con.close();
		return line;
	}
}
