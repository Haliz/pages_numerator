package numpagespdf;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.VerticalAlignment;

import java.io.IOException;

public class TestPDF {
    public static void main(String[] args) throws IOException {
        PdfDocument pdfDoc =
                new PdfDocument(new PdfReader("C:\\projects\\pages_numerator\\src\\main\\java\\numpagespdf\\Пример 1.pdf"),
                        new PdfWriter("C:\\projects\\pages_numerator\\src\\main\\java\\numpagespdf\\Запись 1.pdf"));
        Document doc = new Document(pdfDoc);
// add content
        int numberOfPages = pdfDoc.getNumberOfPages();
        for (int i = 1; i <= numberOfPages; i++) {

            // Write aligned text to the specified by parameters point
            doc.showTextAligned(new Paragraph(String.format("%s", i)),
                    300, 10, i, TextAlignment.CENTER, VerticalAlignment.BOTTOM, 0);
        }

        pdfDoc.close();
    }

}
