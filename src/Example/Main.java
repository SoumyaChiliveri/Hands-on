package Example;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	static Comparator<Project> projComparator=new Comparator<Project>()
			{

				@Override
				public int compare(Project o1, Project o2) {
					String dom1=o1.getDomain();
					String dom2=o2.getDomain();
					return dom1.compareTo(dom2);
				}
		
			};
			
			
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Employee e1=new Employee(101,"Soumya",20000.00,"soumya@gmail.com");
		Employee e2=new Employee(102,"Abc",15000.00,"abc@gmail.com");
		Employee e3=new Employee(103,"harry",30000.00,"harry@gmail.com");
		Employee e4=new Employee(104,"arjun",10000.00,"harry@gmail.com");
		Employee e5=new Employee(105,"devi",40000.00,"harry@gmail.com");
		Employee e6=new Employee(100,"manu",25000.00,"harry@gmail.com");
		Employee e7=new Employee(111,"rach",15000.00,"harry@gmail.com");
		Employee e8=new Employee(107,"deep",35000.00,"harry@gmail.com");
		Employee e9=new Employee(106,"laya",9000.00,"harry@gmail.com");
		Employee e10=new Employee(109,"ash",21000.00,"harry@gmail.com");
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		Date d1=new Date("11/10/2018");
		Date d2=new Date("11/10/2019");
		Project p1=new Project(201,"c",d1,d2);
		Project p2=new Project(202,"java",d1,d2);
		Project p3=new Project(220,"php",d1,d2);
		Project p4=new Project(210,"adv java",d1,d2);
		Project p5=new Project(203,"c++",d1,d2);
		Project p6=new Project(204,"linux",d1,d2);
		Project p7=new Project(207,"mysql",d1,d2);
		Project p8=new Project(205,"oracle",d1,d2);
		Project p9=new Project(209,"js",d1,d2);
		Project p10=new Project(252,"html",d1,d2);
		Map<Project,Employee> empMap=new TreeMap<Project,Employee>(projComparator);
		empMap.put(p1, e1);
		empMap.put(p2,e2);
		empMap.put(p3,e3);
		empMap.put(p4,e4);
		empMap.put(p5,e5);
		empMap.put(p6,e6);
		empMap.put(p7,e7);
		empMap.put(p8,e8);
		empMap.put(p9,e9);
		empMap.put(p10,e10);
		//System.out.println(empMap);
		displayByProjectID(empMap);
		displayByProjectDomain(empMap);
	}

	private static void displayByProjectDomain(Map<Project, Employee> empMap) {
		// TODO Auto-generated method stub
		TreeMap<Project,Employee> empMap1=new TreeMap<Project,Employee>();
		//System.out.println(empMap1);
		empMap1.entrySet().stream().forEach(t->System.out.println(t));
	}

	private static void displayByProjectID(Map<Project, Employee> empMap) {
		// TODO Auto-generated method stub
		//TreeMap<Project,Employee> empMap2=new TreeMap<Project,Employee>();
		 empMap.entrySet().stream().forEach(t->System.out.println(t));
	}

}
