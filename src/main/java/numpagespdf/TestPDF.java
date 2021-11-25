package numpagespdf;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;

import java.io.IOException;

public class TestPDF {
    public static void main(String[] args) throws IOException {
        PdfDocument pdfDoc =
                new PdfDocument(new PdfReader("C:\\projects\\pages_numerator\\src\\main\\java\\numpagespdf\\Пример 1.pdf"),
                        new PdfWriter("C:\\projects\\pages_numerator\\src\\main\\java\\numpagespdf\\Запись 1.pdf"));
// add content
        pdfDoc.close();
    }

}
