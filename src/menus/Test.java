package menus;

public class Test {

	public static void main(String[] args) {
		String[] fileItems={"New", "Open", "Close", "Save",
				"Save As","Print",
        "Page Setup"};
        String[] editItems={"Cut","Copy","Paste","Paste Special",
        		"Select All","Find"};
        String[] viewItems={"Normal","Web Layout","Print Layout","Outline",
                                           "Tool Bars","Header And Footer"};
        new Menu_Demo(fileItems,editItems,viewItems);
	}

}
