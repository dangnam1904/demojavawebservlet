package jweb.p.a103.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jweb.p.a103.connect.ConnectDB;
import jweb.p.a103.model.Personal;

public class PersonalDAO {
	public static void insertPresonal(String firstName, String lastName, String gender, String mobile, String email,
			String hobbies, String description, String nationality) {
		try (Connection con = ConnectDB.getConnection()) {
			String sql = " insert into Personal(FIRST_NAME,LAST_NAME,GENDER,MOBILE,EMAIL,HOBBIES,DESCRIPTION, NATIONALITY) VALUES(?,?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement = null;
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, firstName);
			preparedStatement.setString(2, lastName);
			preparedStatement.setString(3, gender);
			preparedStatement.setString(4, mobile);
			preparedStatement.setString(5, email);
			preparedStatement.setString(6, hobbies);
			preparedStatement.setString(7, description);
			preparedStatement.setString(8, nationality);
			preparedStatement.executeUpdate();
			if (preparedStatement != null) {
				preparedStatement.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static List<Personal> getAllPersonal() {
		List<Personal> persionList = new ArrayList<>();
		try (Connection con = ConnectDB.getConnection()) {
			String sql = "select * from Personal";
			PreparedStatement pStatement = null;
			pStatement = con.prepareStatement(sql);
			ResultSet rs = pStatement.executeQuery();
			while (rs.next()) {
				persionList.add(
						new Personal(rs.getInt("PERSONAL_ID"), rs.getString("FIRST_NAME"), rs.getString("LAST_NAME"),
								rs.getString("GENDER"), rs.getString("MOBILE"), rs.getString("EMAIL"),
								rs.getString("HOBBIES"), rs.getString("DESCRIPTION"), rs.getString("NATIONALITY")));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return persionList;

	}
	
	public static List<Personal> SearchPersonal(String fisrtname) {
		List<Personal> persionList = new ArrayList<>();
		try (Connection con = ConnectDB.getConnection()) {
			String sql = "select * from Personal where FIRST_NAME like ? ";
			PreparedStatement pStatement = null;
			pStatement = con.prepareStatement(sql);
			pStatement.setString(1, "%"+ fisrtname+"%");
			ResultSet rs = pStatement.executeQuery();
			while (rs.next()) {
				persionList.add(
						new Personal(rs.getInt("PERSONAL_ID"), rs.getString("FIRST_NAME"), rs.getString("LAST_NAME"),
								rs.getString("GENDER"), rs.getString("MOBILE"), rs.getString("EMAIL"),
								rs.getString("HOBBIES"), rs.getString("DESCRIPTION"), rs.getString("NATIONALITY")));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return persionList;

	}
	
	public static Personal SearchPersonalById(int id) {
		Personal personal=null;
		try (Connection con = ConnectDB.getConnection()) {
			String sql = "select * from Personal where PERSONAL_ID=?";
			PreparedStatement pStatement = null;
			pStatement = con.prepareStatement(sql);
			pStatement.setInt(1, id);
			ResultSet rs = pStatement.executeQuery();
			while (rs.next()) {
				
					personal=	new Personal(rs.getInt("PERSONAL_ID"), rs.getString("FIRST_NAME"), rs.getString("LAST_NAME"),
								rs.getString("GENDER"), rs.getString("MOBILE"), rs.getString("EMAIL"),
								rs.getString("HOBBIES"), rs.getString("DESCRIPTION"), rs.getString("NATIONALITY"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return personal;

	}
	
	public static void updatePresonal(String firstName, String lastName, String gender, String mobile, String email,
			String hobbies, String description, String nationality, int personal_jd) {
		try (Connection con = ConnectDB.getConnection()) {
			String sql = " update Personal set FIRST_NAME=?,LAST_NAME=?,GENDER=?,MOBILE=?,EMAIL=?,HOBBIES=?,DESCRIPTION=?, NATIONALITY=? where PERSONAL_ID=? ";
			PreparedStatement preparedStatement = null;
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, firstName);
			preparedStatement.setString(2, lastName);
			preparedStatement.setString(3, gender);
			preparedStatement.setString(4, mobile);
			preparedStatement.setString(5, email);
			preparedStatement.setString(6, hobbies);
			preparedStatement.setString(7, description);
			preparedStatement.setString(8, nationality);
			preparedStatement.setInt(9, personal_jd);
			preparedStatement.executeUpdate();
			if (preparedStatement != null) {
				preparedStatement.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void deletePresonal(int personal_jd) {
		try (Connection con = ConnectDB.getConnection()) {
			String sql = " delete from personal where PERSONAL_ID=? ";
			PreparedStatement preparedStatement = null;
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, personal_jd);
			preparedStatement.executeUpdate();
			if (preparedStatement != null) {
				preparedStatement.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
