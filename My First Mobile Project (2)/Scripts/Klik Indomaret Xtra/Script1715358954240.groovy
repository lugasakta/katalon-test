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

Mobile.startApplication('/Users/lugasaktafrimanda/Downloads/Klik Indomaret Xtra_1.3.11_Apkpure.apk', true)

Mobile.takeScreenshot('/var/folders/6z/7b7p68vs5j50258mnxxg8l2c0000gn/T/screenshot1295195609860856252.png')

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Gabung Sekarang'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Masukkan nomor handphone atau email'), '085156889651', 
    0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Lanjutkan'), 0)

Mobile.hideKeyboard()

Mobile.takeScreenshot('/var/folders/6z/7b7p68vs5j50258mnxxg8l2c0000gn/T/screenshot6991617703096376948.png')

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Kata Sandi'), 'T3st123', 0)

Mobile.hideKeyboard()

Mobile.takeScreenshot('/var/folders/6z/7b7p68vs5j50258mnxxg8l2c0000gn/T/screenshot3361424533333281120.png')

Mobile.verifyElementExist(findTestObject('Object Repository/android.widget.TextView - Masuk'), 0)

Mobile.closeApplication()

