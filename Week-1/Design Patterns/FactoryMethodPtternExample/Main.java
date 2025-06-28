public class Main {
    public static void main(String[] args) {
       
        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();

        System.out.println("Creating and processing documents:\n");

        wordFactory.processDocument();  
        pdfFactory.processDocument();  
        excelFactory.processDocument(); 
    }
}