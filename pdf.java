/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vinit
 */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
 
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

public class pdf{
   
     
      public void crePf(String r)
    {
         Document document = new Document();
        try
          {
         PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("D:\\Result.pdf"));
         document.open();
          document.add(new Paragraph(r));  
         document.close();
         writer.close();
          } 
         catch (DocumentException e)
         {
         e.printStackTrace();
        } catch (FileNotFoundException e)
         {
         e.printStackTrace();
         }
    
}

    void crePf(JTextArea txtDisp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


 
    

