import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author wucy
 * Date: 2018-01-12 10:43:00
 */
public class Student implements Comparable<Student>{

	private Integer stuNum;

	private Integer age;

	private String name;

	public Student(Integer stuNum, Integer age, String name) {
		this.stuNum = stuNum;
		this.age = age;
		this.name = name;
	}

	public Integer getStuNum() {
		return stuNum;
	}

	public void setStuNum(Integer stuNum) {
		this.stuNum = stuNum;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 按自己的排序规则实现排序
	 * @param o
	 * @return
	 */
	@Override
	public int compareTo(Student o) {

		if(this.age.compareTo(o.age) == 0){
			return o.stuNum - this.stuNum;
		}else {
			return this.age - o.age;
		}
	}

	@Override
	public String toString() {
		return "Student{" +
				"age=" + age +
				", stuNum=" + stuNum +
				", name='" + name + '\'' +
				'}';
	}

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();

		Student stu1 = new Student(1, 18, "001");
		Student stu2 = new Student(2, 17, "002");
		Student stu3 = new Student(3, 15, "003");
		Student stu4 = new Student(4, 18, "004");
		Student stu5 = new Student(5, 20, "005");
		Student stu6 = new Student(6, 20, "006");

		studentList.add(stu1);
		studentList.add(stu2);
		studentList.add(stu3);
		studentList.add(stu4);
		studentList.add(stu5);
		studentList.add(stu6);

		//排序调用
		Collections.sort(studentList);

		for (Student stu: studentList ) {
			System.out.println(stu);
		}

	}



}
