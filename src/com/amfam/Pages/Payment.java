package com.amfam.Pages;

import org.xframium.page.Page;

public interface Payment extends Page {
	
	@ElementDefinition
    public String choose = "choose";
	
	@ElementDefinition
    public String SIGN1 = "SIGN1";
	
	@ElementDefinition
    public String SIGNATURESUBMIT1 = "SIGNATURESUBMIT1";
	
	@ElementDefinition
    public String SIGN2 = "SIGN2";
	
	@ElementDefinition
    public String SIGNATURESUBMIT2 = "SIGNATURESUBMIT2";

}
