package numpagespdf;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.parser.PdfTextExtractor;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.VerticalAlignment;

import java.io.IOException;

public class TestPDF {
    public static void main(String[] args) throws IOException {
        PdfReader reader = new PdfReader("C:\\projects\\pages_numerator\\src\\main\\java\\numpagespdf\\Пример 1.pdf");
        PdfDocument pdfDoc =
                new PdfDocument(reader,
                        new PdfWriter("C:\\projects\\pages_numerator\\src\\main\\java\\numpagespdf\\Запись 1.pdf"));
        Document doc = new Document(pdfDoc);
// add content
        int numberOfPages = pdfDoc.getNumberOfPages();
        int k = 1;
        for (int i = 1; i <= numberOfPages; i++) {
            String text = PdfTextExtractor.getTextFromPage(pdfDoc.getPage(i)); // Выцепляет текст из страницы (Потом поставить i)
            // Write aligned text to the specified by parameters point
            String pattern = "ГЛАВГОССТРОЙНАДЗОР МОСКОВСКОЙ ОБЛАСТИ";
            if (text.contains(pattern)) {
                k = 1;
            }
            doc.showTextAligned(new Paragraph(String.format("%s", k++)),
                    300, 10, i, TextAlignment.CENTER, VerticalAlignment.BOTTOM, 0);
        }

        pdfDoc.close();
    }

}
