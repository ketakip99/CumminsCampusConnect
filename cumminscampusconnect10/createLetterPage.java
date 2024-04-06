package com.example.cumminscampusconnect10;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import androidx.appcompat.app.AppCompatActivity;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class createLetterPage extends Activity
{
    private EditText nameEditText;
    private EditText branchEditText;
    private EditText yearEditText;
    private EditText divEditText;
    private EditText uceEditText;
    private EditText reasonEditText;
    private EditText lab1EditText;
    private EditText lab1DateEditText;
    private EditText lab2EditText;
    private EditText lab2DateEditText;
    String formattedDate;
    private EditText classInchargeEditText;

    private Button generatePdfButton;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_letter_page);
        nameEditText = findViewById(R.id.editTextText);
        branchEditText = findViewById(R.id.editTextText3);
        yearEditText = findViewById(R.id.editTextText2);
        divEditText = findViewById(R.id.editTextText4);
        uceEditText = findViewById(R.id.editTextText5);
        reasonEditText = findViewById(R.id.editTextTextMultiLine);
        lab1EditText = findViewById(R.id.editTextText6);
        lab1DateEditText = findViewById(R.id.editTextDate);
        lab2EditText = findViewById(R.id.editTextText7);
        lab2DateEditText = findViewById(R.id.editTextDate2);
        classInchargeEditText = findViewById(R.id.editTextText8);
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        formattedDate = dateFormat.format(currentDate);
        generatePdfButton = findViewById(R.id.button2);

        generatePdfButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generatePdf();
                Toast.makeText(createLetterPage.this, "File Downloaded", Toast.LENGTH_SHORT).show();

            }
        });
    }
    private void generatePdf() {
        Log.d("GeneratePDF", "Button clicked");
        Document document = new Document();
        FileOutputStream fos = null;

        File pdfFile = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "compensation.pdf");
        String name = nameEditText.getText().toString();
        String branch = branchEditText.getText().toString();
        String year = yearEditText.getText().toString();

        String div = divEditText.getText().toString();
        String uceNo = uceEditText.getText().toString();
        String reason = reasonEditText.getText().toString();
        String lab1 = lab1EditText.getText().toString();
        String lab1Date = lab1DateEditText.getText().toString();
        String lab2 = lab2EditText.getText().toString();
        String lab2Date = lab2DateEditText.getText().toString();
        String classIncharge = classInchargeEditText.getText().toString();

        if(name.equals("") || branch.equals("") || year.equals("") || div.equals("") || uceNo.equals("") || reason.equals("") || lab1.equals("") || lab1Date.equals("") || classIncharge.equals(""))
        {
            Toast.makeText(createLetterPage.this, "Please Enter All Details!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            try{
//to log the file path
                String filePath = pdfFile.getAbsolutePath();
                Log.d("GeneratePDF", "PDF File Path: " + filePath);
                fos = new FileOutputStream(pdfFile);
                PdfWriter.getInstance(document, fos);
                document.open();
// Create a list for bullet points
                List bulletList = new List(List.UNORDERED);
                bulletList.setListSymbol(new Chunk("\u2022")); // Unicodecharacter for a bullet point
                Font boldFont = new Font(Font.FontFamily.HELVETICA, 15, Font.BOLD);
                Font sizeFont = new Font(Font.FontFamily.HELVETICA, 15);
// Create the content of the PDF using user input
                document.add(new Paragraph("Respected, Current Date: " + (formattedDate), sizeFont) );
                document.add(new Paragraph(classIncharge, sizeFont));
                document.add(new Paragraph(" "));
                document.add(new Paragraph("SUBJECT: Request for Lab Compensation", boldFont));
                document.add(new Paragraph(" "));
                document.add(new Paragraph("I am " + name + " from " + year + " "+ branch + " "+div, sizeFont));
                document.add(new Paragraph(reason, sizeFont));
                document.add(new Paragraph(" "));
                document.add(new Paragraph("Lab(s) to be compensated:", sizeFont));
                bulletList.add(new ListItem(" Lab " + lab1+ " conducted on " + lab1Date, sizeFont));
                if(!lab2.equals(""))
                {
                    bulletList.add(new ListItem(" Lab " + lab2 + " conducted on " + lab2Date, sizeFont));
                }
                document.add(bulletList);
                document.add(new Paragraph(" "));
                document.add(new Paragraph("I sincerely request to grant me permission to compensate the lab(s).", sizeFont));
                document.add(new Paragraph("Thank You.", sizeFont));
                document.add(new Paragraph(" "));
                document.add(new Paragraph("Sincerely,", sizeFont));
                document.add(new Paragraph(name, sizeFont));
                document.add(new Paragraph(uceNo, sizeFont));
                document.add(new Paragraph(" "));
                document.add(new Paragraph(" "));
                document.add(new Paragraph(" "));
                document.add(new Paragraph(" "));
                document.add(new Paragraph("Class Incharge Signature "+"Lab Incharge Signature", sizeFont));
                document.add(new Paragraph(" "));
                document.add(new Paragraph(" "));
                LineSeparator line = new LineSeparator();
                line.setLineColor(new BaseColor(0, 0, 0)); // Set line color to black
                line.setLineWidth(1f); // Set line width
                Chunk chunk = new Chunk(line);
                document.add(chunk);
                document.close();
// fos.close();
//to save, share, or display the PDF.
            }
            catch (DocumentException | FileNotFoundException e)
            {
                e.printStackTrace();
            }
            finally
            {
                try
                {
                    if (fos != null)
                    {
                        fos.close();
                    }
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            Toast.makeText(createLetterPage.this, "File Downloaded",

                    Toast.LENGTH_LONG).show();
        }
    }
}