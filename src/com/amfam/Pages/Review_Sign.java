package com.amfam.Pages;

import org.xframium.page.Page;

public interface Review_Sign extends Page {
	
	@ElementDefinition
    public String REVIEWDOCUMENTS = "REVIEWDOCUMENTS";
	
	@ElementDefinition
    public String SIGN1 = "SIGN1";
	
	@ElementDefinition
    public String SIGNATURESUBMIT1 = "SIGNATURESUBMIT1";
	
	@ElementDefinition
    public String SIGN2 = "SIGN2";
	
	@ElementDefinition
    public String SIGNATURESUBMIT2 = "SIGNATURESUBMIT2";
	
	@TimeMethod
	@ScreenShot
	public boolean setReviewSign();

}
