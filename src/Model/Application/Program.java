package Model.Application;

import java.util.InputMismatchException;
import java.util.Scanner;

import Model.Entities.ContactProfile;
import Model.Entities.Course;
import Model.Entities.Student;
import Model.Entities.enums.ClassName;
import Model.Exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Cadastre o aluno:");
			System.out.print("Nome:");
			String name = sc.nextLine();
			System.out.println("Número de celular:");
			String phone = sc.next();
			System.out.println("Email:");
			String email = sc.next().toLowerCase();
			Student student = new Student(1, name, new ContactProfile(phone, email));
			System.out.println("Quantas aulas o aluno quer se matricular(máx 3 aulas)");
			int classQuantity = sc.nextInt();
			for (int i = 1; i <= classQuantity; i++) {
				System.out.println("Qual " + i + "°aula deseja se matricular:");
				ClassName className = ClassName.valueOf(sc.next().toUpperCase());
				Course course = new Course(1, className);
				student.addCourses(course);
				System.out.println();
			}
			System.out.println("\t\tDADOS DO ALUNO:");
			System.out.println(student);
		} catch (DomainException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Erro de digitação!");
		}catch (IllegalArgumentException e) {
			System.out.println("Erro no");
		}
		sc.close();
	}

}
