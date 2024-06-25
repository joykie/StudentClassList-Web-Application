9
package za.ac.tut.web;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import za.ac.tut.bl.StudentFacadeLocal;
import za.ac.tut.entity.Student;
import static za.ac.tut.entity.Student_.subjects;
import za.ac.tut.entity.Subjects;


@MultipartConfig
@WebServlet("/upload")
public class AddServlet extends HttpServlet {

   @EJB
   private StudentFacadeLocal sfl;
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        Long studno = Long.parseLong(request.getParameter("studno"));
        Part img = request.getPart("image");
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        Integer age = Integer.parseInt(request.getParameter("age"));
        String gender = request.getParameter("gender");
        Date creationDate = new Date();
        String[] sub = request.getParameterValues("module");
       
        
         List<Subjects> subjects = new ArrayList<>();
         
         for(int i=0 ;i<sub.length;i++ )
         {
           Subjects sub2 = new Subjects();
           sub2.setSubjects(sub[i]);
           subjects.add(sub2);
         }
        
        
        InputStream input = img.getInputStream();
        ByteArrayOutputStream data = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int readByte;
        
        while((readByte = input.read(buffer)) != -1){
      
           data.write(buffer, 0, readByte);
        }
        
        byte[] image = data.toByteArray();
        
       Student stud =new Student(studno, image, creationDate, name, surname, age, gender,subjects );
       //Student stud = createStud(studno, image, creationDate, name, surname, age, gender,subjects);
       sfl.create(stud);
       request.setAttribute("student", stud);
         RequestDispatcher disp = request.getRequestDispatcher("addOutcome.jsp");
      disp.forward(request, response);
        
    }

    private Student createStud(Long studno, byte[] image, Date creationDate, String name, String surname, Integer age, String gender, List<Subjects> subjects) {
        
        Student s = new  Student();
        s.setId(studno);
        s.setImage(image);
        s.setName(name);
        s.setSurname(surname);
        s.setAge(age);
        s.setGender(gender);
        s.setCreationDate(creationDate);
        s.setSubjects(subjects);
        return s;
        
    }

    

}
