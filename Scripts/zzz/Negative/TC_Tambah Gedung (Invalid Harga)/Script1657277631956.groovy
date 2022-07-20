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

WebUI.callTestCase(findTestCase('1. Login/TC00_ Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Beranda/navbar_menu'))

WebUI.click(findTestObject('Data Gedung/tab_tambah gedung'))

WebUI.selectOptionByValue(findTestObject('Data Gedung/Tambah Gedung/drpdwn_jenis gedung'), '', false)

WebUI.setText(findTestObject('Data Gedung/Tambah Gedung/Nama Gedung'), 'valid')

WebUI.setText(findTestObject('Data Gedung/Tambah Gedung/Lokasi'), 'valid')

WebUI.setText(findTestObject('Data Gedung/Tambah Gedung/Harga'), 'invalid')

WebUI.setText(findTestObject('Data Gedung/Tambah Gedung/Fasilitas'), 'valid')

WebUI.setText(findTestObject('Data Gedung/Tambah Gedung/Deskripsi'), 'valid')

WebUI.uploadFile(findTestObject('Data Gedung/Tambah Gedung/btn_insert img'), 'C:\\Users\\Ahzami\\Downloads\\logo.png')

WebUI.click(findTestObject('Data Gedung/Tambah Gedung/btn_buat'))

