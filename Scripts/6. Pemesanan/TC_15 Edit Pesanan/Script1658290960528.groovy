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

WebUI.navigateToUrl('https://front-end-vue-office-booking-system-i79t00yv0-didiroyadi123.vercel.app/beranda')

WebUI.click(findTestObject('Beranda/navbar_menu'))

WebUI.click(findTestObject('Pemesanan/tab_kelola pemesanan'))

WebUI.click(findTestObject('Pemesanan/Kelola Pesanan/btn_edit'))

WebUI.selectOptionByLabel(findTestObject('Pemesanan/Tambah Pesanan/drpdwn_jenis gedung'), 'Ciputra World One, DBS Bank Tower Lantai 28', 
    false)

WebUI.setText(findTestObject('Pemesanan/Tambah Pesanan/nama'), 'Si A Nu')

WebUI.setText(findTestObject('Pemesanan/Tambah Pesanan/no handphone'), '082123456789')

WebUI.setText(findTestObject('Pemesanan/Tambah Pesanan/jumlah pemesanan'), '3 Hari')

WebUI.setText(findTestObject('Pemesanan/Tambah Pesanan/total harga'), 'Rp 3.000.000')

WebUI.setText(findTestObject('Pemesanan/Tambah Pesanan/tanggal masuk'), '21-07-2022')

WebUI.setText(findTestObject('Pemesanan/Tambah Pesanan/tanggal keluar'), '23-07-2022')

WebUI.click(findTestObject('Pemesanan/Kelola Pesanan/btn_buat'))

WebUI.verifyTextPresent('success', false, FailureHandling.CONTINUE_ON_FAILURE)

