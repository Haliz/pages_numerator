package numpagespdf;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.VerticalAlignment;

import java.io.File;


public class StampPageXofY {
    public static final String DEST = "C:\\Users\\Igor\\Downloads\\восточный2.pdf";
    public static final String SRC = "C:\\Users\\Igor\\Downloads\\восточный.pdf";

    public static void main(String[] args) throws Exception {
        File file = new File(DEST);
        file.getParentFile().mkdirs();

        new StampPageXofY().manipulatePdf(DEST);
    }

    protected void manipulatePdf(String dest) throws Exception {
        PdfDocument pdfDoc = new PdfDocument(new PdfReader(SRC), new PdfWriter(dest));
        Document doc = new Document(pdfDoc);

        int numberOfPages = pdfDoc.getNumberOfPages();
        for (int i = 1; i <= numberOfPages; i++) {

            // Write aligned text to the specified by parameters point
            doc.showTextAligned(new Paragraph(String.format("page %s of %s", i, numberOfPages)),
                    559, 806, i, TextAlignment.RIGHT, VerticalAlignment.TOP, 0);
        }

        doc.close();
    }
}
