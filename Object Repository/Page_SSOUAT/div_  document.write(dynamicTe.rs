<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_  document.write(dynamicTe</name>
   <tag></tag>
   <elementGuidId>479b9439-975a-42ec-90aa-a8968bc6f54a</elementGuidId>
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
      <value>mainContainer</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>//  
document.write(dynamicText.loginHeading)
//Sign In to Community//  
document.write(dynamicText.loginDescription)
//Username (E-Mail)Password//  

           if(dynamicText.showForgotPassword == &quot;true&quot; || dynamicText.showForgotPassword  == undefined) {
			   document.write('&lt;p class=&quot;lgnText&quot;>Forgot your Password?&amp;nbsp;&lt;a href=&quot;#&quot; onclick=&quot;javascript:redirectToForgotPassword();&quot;>Reset your password&lt;/a>&lt;/p>');
			}
			if(dynamicText.showResetFactor == &quot;true&quot;) {
			   document.write('&lt;p class=&quot;lgnText&quot;>Lost your MultiFactor Token?&amp;nbsp;&lt;a href=&quot;#&quot; onclick=&quot;javascript:redirectToResetFactor();&quot;>Reset your MFA Token&lt;/a>&lt;/p>');
			}
			var pwdEnabled = 'true';	 
			if(dynamicText.loginHeading.toLowerCase() === &quot;sign in to surf&quot; &amp;&amp; pwdEnabled == 'true'){
				document.write('&lt;p class=&quot;lgnText&quot; style=&quot;display: inline;&quot;>Locked your account?&lt;a href=&quot;#&quot; onclick=&quot;javascript:checkVPNConnection()&quot;>Unlock your account&lt;/a>&lt;/p>&lt;span style=&quot;font-size: 11px;color: #777777;&quot;>(For ServiceNow Employees only)&lt;/span>');
			 document.write('');
			}
         
//Forgot your Password? Reset your password//  
document.write(dynamicText.loginHelp)
//For questions about your account or Community, please emailcommunity@servicenow.com//  

        if(dynamicText.showEmployeeTip == &quot;true&quot;) {
        document.write('&lt;p class=&quot;lgnText&quot; style=&quot;color: #777777; margin-top: 15px;&quot;>&lt;b>Note:&amp;nbsp;&lt;/b>ServiceNow employees, please sign in with your active directory credentials.&lt;/p>');
        }
      
//Note: ServiceNow employees, please sign in with your active directory credentials.//  

      if(dynamicText.showRegistration == &quot;true&quot;) {
      document.write('&lt;div class=&quot;colRight&quot;>');
      document.write('&lt;h1 class=&quot;headingText&quot;>' + dynamicText.registerHeading + '&lt;/h1>');
      document.write('&lt;p class=&quot;lgnText&quot;>' + dynamicText.registerDescription + '&lt;/p>');
      document.write('&lt;div class=&quot;separatorDiv&quot;>&lt;/div>');
      if(dynamicText.CustomRegisterLink != undefined) {
      var buttonText = dynamicText.CustomRegisterLinkText == undefined ? 'Register' : dynamicText.CustomRegisterLinkText ;
      document.write('&lt;input type=&quot;button&quot; id=&quot;registerButton&quot; style=&quot;margin: 10px 0px 20px 0px;&quot; value=' + dynamicText.CustomRegisterLinkText + ' onclick=&quot;location.href=\'' + dynamicText.CustomRegisterLink + '\';&quot;/>');
      } else {
      var buttonText = dynamicText.CustomRegisterLinkText == undefined ? 'Register' : dynamicText.CustomRegisterLinkText ;
      document.write('&lt;input type=&quot;button&quot; id=&quot;registerButton&quot; style=&quot;margin: 10px 0px 20px 0px;&quot; value=&quot;' + buttonText + '&quot; onclick=&quot;javascript:redirectToRegistration(); return false;&quot;/>');
      }
      if(dynamicText.requestAccess != undefined) {
      document.write('&lt;p class=&quot;lgnText&quot;>' + dynamicText.requestAccess + '&lt;/p>');
      }
      if(dynamicText.CustomRequestAccessLink != undefined) {
      document.write('&lt;input type=&quot;button&quot; id=&quot;registerButton&quot; style=&quot;margin: 10px 0px 20px 0px;padding-left: 22px;padding-right: 22px;&quot; value=' + dynamicText.CustomRequestAccessLinkText + ' onclick=&quot;location.href=\'' + dynamicText.CustomRequestAccessLink + '\';&quot;/>');
      }
      if(dynamicText.migratingPartner != undefined) {
      document.write('&lt;p class=&quot;lgnText&quot;>' + dynamicText.migratingPartner + '&lt;/p>');
      }
      
      document.write('&lt;/div>');
      }
    
//Create ServiceNow AccountIn order to register for the ServiceNow Community, you will need to create a ServiceNow Account. This will also serve as your credentials for your Knowledge Conference Registration and other ServiceNow sites as they become available.</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[@class=&quot;ltr date-calendar&quot;]/body[@class=&quot;windows chrome       non_standard_lists&quot;]/div[@class=&quot;wrapper&quot;]/div[@class=&quot;mainContainer&quot;]</value>
   </webElementProperties>
</WebElementEntity>
