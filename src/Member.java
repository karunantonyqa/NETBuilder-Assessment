import java.util.ArrayList;

public class Member {
	
	String name;
	String sex;

	Member mother;
	Member father;
	Member child;
	
	public ArrayList<Member> parentsList = new ArrayList(2);
	public ArrayList<Member> childrenList = new ArrayList();

	
	public Member() {
	}

	public Member(String name, Member father, Member mother, ArrayList<Member> childrenList, String sex) {
		this.name = name;
		this.father = father;
		this.mother = mother;
		this.childrenList = childrenList; 
		this.sex = sex;
	}
	
	public Member(String name) {
		this.name = name;
	}
	
	public Member(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public ArrayList<Member> getParents() {
		return parentsList;
	}

	public void setParents(Member father, Member mother) {
		parentsList.add(father);
		parentsList.add(mother);
	}
	
	public void setMother(Member mother) {
		parentsList.add(mother);
	}
	
	public void setFather(Member father) {
		parentsList.add(father);
	}

	public ArrayList<Member> getChildren() {
		return childrenList;
	}

	public void setChildren(Member child, Member child2) {
		childrenList.add(child);
		childrenList.add(child2);
	}
	
	public void setChild(Member child) {
		childrenList.add(child);
	}

	public Member getMother() {
		return mother;
	}

	public Member getFather() {
		return father;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
