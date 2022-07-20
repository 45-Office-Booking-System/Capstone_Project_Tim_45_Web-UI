import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Beranda/drpdwn_admin'))

WebUI.click(findTestObject('Profile Admin/tab_profile'))

for (def rowNum = 1; rowNum <= findTestData('Ubah Password/Negative').getRowNumbers(); rowNum++) {
    WebUI.setText(findTestObject('Profile Admin/Profile/Old Password'), findTestData('Ubah Password/Negative').getValue(
            1, rowNum))

    WebUI.setText(findTestObject('Profile Admin/Profile/New Password'), findTestData('Ubah Password/Negative').getValue(
            2, rowNum))

    WebUI.setText(findTestObject('Profile Admin/Profile/Confirm New Password'), findTestData('Ubah Password/Negative').getValue(
            3, rowNum))

    WebUI.click(findTestObject('Profile Admin/Profile/btn_ubah'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.verifyTextPresent('failed', false, FailureHandling.CONTINUE_ON_FAILURE)
}

