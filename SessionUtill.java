import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Configuration;

public class SessionUtill {
	private static SessionFactory factory;
	static
	{
		factory=new Configuration().configure("com/harish/cfg/hibernate.cfg.xml").buildSessionFactory();
	}
	public static Session getSession()
	{
		return factory.openSession();
	}

	public static void closeSession(Session ses)
	{
		if(ses!=null)
			ses.close();
	}



}
