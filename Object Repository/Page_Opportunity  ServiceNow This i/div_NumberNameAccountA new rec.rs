<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_NumberNameAccountA new rec</name>
   <tag></tag>
   <elementGuidId>b3e88259-c412-4221-a865-94d4ffe66315</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>vsplit col-sm-6</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>NumberNameAccountA new record with this value will be created automaticallyLookup using listView - Opens reference record in current windowForecast Stage-- None --0 - Lead (0%)1 - Opportunity (1%)2 - Discovery (5%)3 - Business Issue (10%)4 - Present Solution (20%)4 - Power Sponsorship (30%)5 - Power Validation (40%)6 - Validation Completed (70%)7 - Deal Imminent (90%)8 - Closed Won (100%)8 - Closed Lost (100%)8 - Closed No Decision (0%)9 - Administration of Duplicate, Merge or ErrorForecast Category-- None --LeadOmittedPipelineUpsideExpectCommitSubmittedClosedInactiveLostOpportunity Type-- None --Order ResetNew BusinessRenewalLicense UpsellServicesTrainingPoVSplit AdjusterContract Type-- None --Order Form OnlyMOAReseller AgreementExpress – Auto RenewalExpressOEMApp StoreApp Store TPPLMSInternet2GSAOrder Form Status-- None --Pre-NegotiationIn NegotiationQuote sent to CustomerOrder Form ApprovedOrder Form sent to CustomerSigned Awaiting POSigned Complete sent to SOPSSigned Complete sent to OMOM - Pending signatureOM - Pending infoFinalClose dateSelect DateOrder Term Start DateSelect DateTermTerm NewOrder Term End DateSelect DateData centerNot Yet DecidedAsiaAustraliaEuropeFedRAMPFISMANorth AmericaSelf HostedSouth AmericaSwitzerland--More--Base currencyAUDBRLCADCHFDKKEURGBPJPYMXNNZDUSDvar select = gel('sys_select.sales_opportunity.u_base_currency');
				setSelectValue(select, 'sales_opportunity.u_base_currency');function updateChoiceList_u_base_currency(control, oldValue, newValue, loading) {
		  if (loading)
		      return;
		
		  var ac = new AJAXReferenceChoice(gel('sys_select.sales_opportunity.u_base_currency'), 'sales_opportunity.u_base_currency', '', 'not_important');
		  ac.ajaxRequest();
	  }
	  var h = new GlideEventHandler('updateChoiceList_u_base_currency', updateChoiceList_u_base_currency, 'sales_opportunity.account');
		  g_event_handlers.push(h);View - Opens reference record in current windowNet new ACV$(USD)USD Net new ACV$Business Unit (for lump sum forecast)-- None --ITOMITSMvar select = gel('sys_select.sales_opportunity.u_business_unit_for_lump_sum_forecast');
				setSelectValue(select, 'sales_opportunity.u_business_unit_for_lump_sum_forecast');function updateChoiceList_u_business_unit_for_lump_sum_forecast(control, oldValue, newValue, loading) {
		  if (loading)
		      return;
		
		  var ac = new AJAXReferenceChoice(gel('sys_select.sales_opportunity.u_business_unit_for_lump_sum_forecast'), 'sales_opportunity.u_business_unit_for_lump_sum_forecast', '', 'not_important');
		  ac.ajaxRequest();
	  }View - Opens reference record in current windowForecast lump sum NNACV$(USD)Conversion-- None --Express to EnterpriseReason Code-- None --Opportunity IssueLine Item IssuePartner IssueQuoting IssueProduct IssueSAP Sync IssueAccount IssueOtherGross ACVDid Marketing Help?-- None --NoYes</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;d04344d32b97a10031a0ab84b4da15a0&quot;)/div[@class=&quot;row&quot;]/div[@class=&quot;vsplit col-sm-6&quot;]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>ref_element</name>
      <type>Main</type>
      <value>Object Repository/Page_Opportunity  ServiceNow This i (2)/iframe_gsft_main</value>
   </webElementProperties>
</WebElementEntity>
