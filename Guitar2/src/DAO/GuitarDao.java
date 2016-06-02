package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Util.DbUtil;
import model.GuitarSpec;
import model.Inventory;

public class GuitarDao {
	public static Inventory inventory() // »ñÈ¡ËùÓÐ¼ªËû¼ÓÔØµ½inventoryÄÚ
	{
		Inventory inventory = new Inventory();
		// List<guitar> guitars = new ArrayList<guitar>();
		Connection connection = DbUtil.getConnection();
		PreparedStatement pstat;
		ResultSet rs;
		try {
			pstat = connection.prepareStatement("select * from guitar");
			rs = pstat.executeQuery();
			while (rs.next()) {
				GuitarSpec guitarspec = new GuitarSpec(null, null, null, null, null);
				guitarspec.setBuilder(rs.getString("builder"));
				guitarspec.setTopWood(rs.getString("topWood"));
				guitarspec.setBackWood(rs.getString("backWood"));
				guitarspec.setType(rs.getString("type"));
				guitarspec.setModel(rs.getString("model"));
                
	//			System.out.println(guitarspec.getModel());
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return inventory;
	}
}