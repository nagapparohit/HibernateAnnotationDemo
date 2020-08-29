

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ecommerce.EProduct;
import com.ecommerce.HibernateUtil;


public class ListProducts extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListProducts() {
        super();
        // TODO Auto-generated constructor stub
    }

	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			SessionFactory factory = HibernateUtil.getSessionFactory();
			Session session = factory.openSession();
			
			List<EProduct> list = session.createQuery("from EProduct").list();
			
			session.close();
			PrintWriter out = response.getWriter();
			out.println("<html><head><style>table,th,td{border : 1px solid black}</style></head><body><table>");
			for(EProduct p:list) {
				String id = String.valueOf(p.getId());
				String name = p.getName();
				String price = String.valueOf(p.getPrice());
				out.println("<tr><td>"+id+"</td><td>"+name+"</td><td>"+price+"</td></tr>");
			}
			out.println("</table></body></html>");
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
