package Com.dailycodebuffer.SOLID;

public class SingleRespoonsibilityPrinciple {
	// BAD: Violates SRP
	class InvoiceBad {
	    void calculateTotal() { /* logic */ }
	    void printInvoice() { /* logic */ }
	    void saveToDB() { /* logic */ }
	}

	// GOOD: Follows SRP
	class Invoice {
	    void calculateTotal() { /* logic */ }
	}

	class InvoicePrinter {
	    void print(Invoice invoice) { /* logic */ }
	}

	class InvoiceRepository {
	    void save(Invoice invoice) { /* logic */ }
	}

}
