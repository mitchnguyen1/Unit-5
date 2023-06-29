package org.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;



@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {

    // declare a MockitoRule rule to further configure and manage the mocks.
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();


    // Create a mock object of MyDependency
    @Mock
    private StudentDataObject studentDataObject;

    @Mock
    private InstructorDataObject instructorDataObject;

    @Mock
    private ClassDataObject classDataObject;

    // Inject the mock objects into the fields of the tested object
    @InjectMocks
    private ClientBusinessObjectImpl clientBusinessObjectImpl;

    @Test
    public void testStudentsByClass() {
        // Given
        Student student1 = new Student("Joy Ma", "Spanish");
        Student student2 = new Student("Julio Hernandez", "Algebra");
        Student student3 = new Student("Jenny Jones", "Calculus");
        List<Student> allStudents = new ArrayList<>();
        allStudents.add(student1);
        allStudents.add(student2);
        allStudents.add(student3);

        given(studentDataObject.getAllStudents()).willReturn(allStudents);

        // When
        List<String> mathStudents = clientBusinessObjectImpl.getAllStudentsBySubject("math");

        // Then
        assertThat(mathStudents.size(), is(2));
        assertThat(mathStudents, hasItems(student1, student2);
    }


    @Test
    public void testMarkInactive() {

        // Given
        Class geo = new Class("Geometry", "Summer 2022");
        Class sci = new Class("Environmental Science", "Fall 2022");
        Class comp = new Class("Comparative Literature", "Spring 2023");
        List<Class> allClasses = new ArrayList<>();
        allClasses.add(geo);
        allClasses.add(sci);
        allClasses.add(comp);

        given(classDataObject.getAllClasses()).willReturn(allClasses);

        // When
        clientBusinessObjectImpl.markCurrentClassesInactive();

        // Then
        verify(classDataObject).markInactive(geo);

        verify(classDataObject, Mockito.never()).markInactive(sci);

        verify(classDataObject, Mockito.never()).markInactive(comp);

        verify(classDataObject, Mockito.times(1)).markInactive(geo);
        // atLeastOnce, atLeast

    }
    @Captor
    ArgumentCaptor<Class> classArgumentCaptor;


    @Test
    public void testMarkInactive_argumentCaptor() {
        // Given
        Class geo = new Class("Geometry", "Summer 2022");
        Class sci = new Class("Environmental Science", "Fall 2022");
        Class comp = new Class("Comparative Literature", "Spring 2023");
        List<Class> allClasses = new ArrayList<>();
        allClasses.add(geo);
        allClasses.add(sci);
        allClasses.add(comp);

        given(classDataObject.getAllClasses()).willReturn(allClasses);

        // When
        clientBusinessObjectImpl.markCurrentClassesInactive();

        // Then
        verify(classDataObject).markInactive(classArgumentCaptor.capture());

        assertEquals(geo, classArgumentCaptor.getValue());
    }

}
