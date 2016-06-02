package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.GuitarDao;
import model.GuitarSpec;
import model.Inventory;

/**
 * Servlet implementation class search
 */
@WebServlet("/search")
public class search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public search(){
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		GuitarSpec spec = new GuitarSpec(null, null, null, null, null);
		spec.setBackWood(request.getParameter("backWood"));
		spec.setBuilder(request.getParameter("builder"));
		spec.setModel(request.getParameter("model"));
		spec.setTopWood(request.getParameter("topWood"));
		spec.setType(request.getParameter("type"));
		// 新建一个guitar List 用来存储匹配到的guitars
		List matchingGuitars = new LinkedList();
		matchingGuitars = GuitarDao.inventory().search(spec);		
		System.out.println(matchingGuitars);		
		request.setAttribute("res", matchingGuitars);
		request.getRequestDispatcher("search.jsp").forward(request, response);
	}
}