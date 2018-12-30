package com.icix.producttest;

import org.testng.annotations.Test;
import com.icix.functionality.TwoActorRequestLogics;

/*This class holding ther Test Scenario and Steps for sending Two Actor Request*/

public class QA_28_Test {
	@Test
	public void OpenRequestPage() throws Exception {
		TwoActorRequestLogics.openReqPage();
		TwoActorRequestLogics.clickNewBtn();
		TwoActorRequestLogics.SendTwoActorRequest();
		TwoActorRequestLogics.searchCreatedRequest();
	}

}
