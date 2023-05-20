package oops;

class Subject {
	private String subID;
	private String name;
	private int maxMarks;
	private int marksObtains;
//	public int length;

	public Subject(String subID, String name, int maxMarks) {
		super();
		this.subID = subID;
		this.name = name;
		this.maxMarks = maxMarks;
	}

	public String getSubID() {return subID;}
	public String getName() {return name;}
	public int getMaxMarks() {return maxMarks;}
	public int getMarksObtains() {return marksObtains;}

	public void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}

	public void setMarksObtains(int marksObtains) {
		this.marksObtains = marksObtains;
	}

	boolean isQualified() {
		return marksObtains >= maxMarks / 10 * 4;
	}

	public String toString() {
		return "\n SubjectID: " + subID + "\n Name " + name + "\n MarksObtained " + marksObtains;
	}

}

class Student {

	private int rollNo;
	private String name;
	private String dept;
	private Subject[] subjects;

	public Student(int roll, String name, String dept) {
		rollNo = roll;
		this.name = name;
		this.dept = dept;
		subjects = new Subject[0];
	}

	public Student(int roll, String name, String dept, Subject[] subs) {
		rollNo = roll;
		this.name = name;
		this.dept = dept;
		setSubjects(subs);
	}

	public int getRollNo() {return rollNo;}
	public String getName() {return name;}
	public String getDept() {return dept;}
	public Subject[] getSubjects() {return subjects;}

	public void setSubjects(Subject... s) {

		subjects = new Subject[s.length];

		for (int i = 0; i < s.length; i++)
		{
			subjects[i] = s[i];
		}
	}

	public String toString() {

		System.out.println("Student Details");

		System.out.println("RollNo:" + rollNo + "\nName:" + name + "\nDept:" + dept);

		if (subjects.length == 0)
			System.out.println("No Subjects");
		else {
			for (Subject s : subjects) {
				System.out.println(s);
			}
		}
		return "";
	}

}

public class _8SubjectStudent {

	public static void main(String args[]) {
		Subject s[] = new Subject[2];
		s[0] = new Subject("s101", "DS", 100);
		s[1] = new Subject("s102", "Algos", 100);
		s[1].setMarksObtains(80);
		s[0].setMarksObtains(80);
//for(Subject ss: s) System.out.println(ss);
		Student stud1 = new Student(1, "Jack", "CS");
		Student stud2 = new Student(2, "Ben", "IT", s);
		System.out.println(stud1);
		System.out.println(stud2);
	}
}
