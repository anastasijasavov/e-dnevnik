package uni.fmi;

import static org.junit.Assert.assertEquals;
import java.util.*;

import uni.fmi.models.Subject;

public class Test {

	public void testSetWithStrings() {
		final Set<String> testInstance = new HashSet<String>();
		String value1 = "value1";
		testInstance.add(value1);
		String value2 = "value2";
		testInstance.add(value2);
		String value3 = "value3";
		testInstance.add(value3);
		assertEquals(2, testInstance.size());
	}
	
	public void testSetWithSubjects() {
		final Set<Subject> testInstance = new HashSet<Subject>();
		Subject subj1 = new Subject();
		subj1.setName("Verovatnoca i statistika");
		testInstance.add(subj1);
		Subject subj2 = new Subject();
		subj2.setName("Mobilne aplikacije");
		testInstance.add(subj2);
		Subject subj3 = new Subject();
		subj3.setName("Mobilne aplikacije");
		testInstance.add(subj3);
		assertEquals(2, testInstance.size());
	}

}
