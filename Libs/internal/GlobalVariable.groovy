package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object MKUsername
     
    /**
     * <p></p>
     */
    public static Object MKPassword
     
    /**
     * <p></p>
     */
    public static Object CK1Username
     
    /**
     * <p></p>
     */
    public static Object CK1Password
     
    /**
     * <p></p>
     */
    public static Object CK2Username
     
    /**
     * <p></p>
     */
    public static Object CK2Password
     
    /**
     * <p></p>
     */
    public static Object CPName
     
    /**
     * <p></p>
     */
    public static Object Url
     
    /**
     * <p></p>
     */
    public static Object G_Timeout_Small
     

    static {
        def allVariables = [:]        
        allVariables.put('default', [:])
        allVariables.put('CP_Details', allVariables['default'] + ['MKUsername' : 'Siddhika', 'MKPassword' : 'tJrv5JzdMgJS+E3YB3qLdQ==', 'CK1Username' : 'Ankita', 'CK1Password' : '0su8JPdqOrtdMpZY9tcdMw==', 'CK2Username' : 'Ashavini', 'CK2Password' : 'HgYW5rTyICd068gsXDIB7Q==', 'CPName' : 'AIDNI FO KNAB', 'Url' : 'http://siachen:8003/AXIS_LERM_WEB_UAT_V4/login.aspx', 'G_Timeout_Small' : 45])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        MKUsername = selectedVariables['MKUsername']
        MKPassword = selectedVariables['MKPassword']
        CK1Username = selectedVariables['CK1Username']
        CK1Password = selectedVariables['CK1Password']
        CK2Username = selectedVariables['CK2Username']
        CK2Password = selectedVariables['CK2Password']
        CPName = selectedVariables['CPName']
        Url = selectedVariables['Url']
        G_Timeout_Small = selectedVariables['G_Timeout_Small']
        
    }
}
