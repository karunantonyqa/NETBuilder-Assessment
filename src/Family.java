import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Family {	
	
	String childName = "";
	String parentName = "";
	String sex = "";
	
	ArrayList<Member> members = new ArrayList();
	
	public Family() {

	}
	
	public boolean male(String name) {
		
		Member member = searchMember(name);
		
		//if no one exists, create new person and set sex to male
		// else if sex is null, set sex to male
		if(member.equals(null)) {
			member = new Member(name, "male");
			members.add(member);
			System.out.println("Member created and set to male");
			return true;
		} else if(member.sex==null){
			member.setSex("male");
			System.out.println("Gender set to male");
			return true;
		}
				
		return false;
		
	}
	
	public boolean female(String name) {
		
		Member member = searchMember(name);
		
		//if no one exists, create new person and set sex to female
		// else if sex is null, set sex to female
		if(member.equals(null)) {
			member = new Member(name, "female");
			members.add(member);
			System.out.println("Member created and set to female");

			return true;
		} else if(member.sex.equals(null)){
			member.setSex("female");
			System.out.println("Gender set to female");
			return true;
		}
				
		
		return false;
	}
	
	public boolean isMale(String name) {
		
		Member member = searchMember(name);
		
		if(member.getSex()=="male") {
			System.out.println("Member is male");
			return true;
		}
		
		return false;
	}

	public boolean isFemale(String name) {
	
		Member member = searchMember(name);
		
		if(member.getSex()=="female") {
			System.out.println("Member is female");

			return true;
		}
		
		return false;
	}
	
	public boolean setParent(String childName, String parentName) {
		
		
		
		Member child = searchMember(childName);
		Member parent = searchMember(parentName);
		
		ArrayList<Member> parents = new ArrayList();
		
		if(!(child==null)) {
			parents = child.getParents();
			System.out.println("Child exists ---getting parents");
		}
		
		if(child==null) {
			child = new Member(childName);
			System.out.println("Child created");
			members.add(child);
		}
		
		if(parent==null) {
			parent = new Member(parentName);
			System.out.println("Parent created");
			members.add(parent);
		}
		
		if(child.getFather()==null) {
			if(isMale(parentName)) {
				child.setFather(parent);
				System.out.println("Father has been set");
			}
		}
		
		if(child.getMother()==null) {
			if(isFemale(parentName)) {
				child.setMother(parent);
				System.out.println("Mother has been set");
			}
		}
		
		parent.childrenList.add(child);
		child.parentsList.add(parent);
		
		
		return true;
		
	}
	
	public void getParents(String childName) {
		int i = 0;
		String[] parents = new String[2];
		for(Member m : searchMember(childName).parentsList) {
			parents[i] = m.getName();
			i++;
		}
		Arrays.sort(parents);
		
		System.out.println(Arrays.toString(parents));		
	}
	
	public void getChildren(String parentName) {
		int i = 0;
		int array = searchMember(parentName).childrenList.size();
		String[] children = new String[array];
		for(Member m : searchMember(parentName).childrenList) {
			children[i] = m.getName();
			i++;
		}
		
		Arrays.sort(children);

		
		System.out.println(Arrays.toString(children));
	}
	
	public Member searchMember(String name) {
		for(Member member : members) {
			if(member.name.equals(name)) {
				return member;
			}
		}
		return null;
	}

}
