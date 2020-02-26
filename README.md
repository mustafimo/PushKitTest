Push Kit 

HUAWEI Push Kit is a messaging service provided by Huawei for developers. 
It establishes a messaging channel from the cloud to devices. By integrating HUAWEI Push Kit, 
developers can send messages to apps on users' devices in real time. This helps developers 
maintain closer ties with users and increases user awareness and engagement. 
The following points shows the process of sending messages from the cloud to a device:
1- App servers call APIs to send messages to HUAWEI Push Kit.
2- HUAWEI Push Kit forwards the messages to devices with corresponding apps installed.

What You Will Create
In this codelab, you will use the demo project that has been created for you to call HUAWEI Push Kit APIs.
Through the demo project, you will:
1- Apply for a token from the HUAWEI Push Kit server.
2- Receive test messages from the HUAWEI Push Kit server.

What You Will Need
- Hardware Requirements
A computer (desktop or laptop) running Windows 7 or Windows 10.
A Huawei phone (with the USB cable), which is used for debugging.
- Software Requirements
Java JDK installation package
Android SDK package
Android Studio 3.X
HMS Core 4.X or later

How to get SHA1 certificate fingerprint

For Windows open CMD:

keytool  -list -v -alias androiddebugkey -keystore %USERPROFILE%\.android\debug.keystore

keytool -list -v -keystore "%USERPROFILE%\.android\debug.keystore" -alias androiddebugkey -storepass android -keypass android

For Mac and Linux:
1) Open Terminal.
2) Type the below command:
 keytool -list -v -keystore ~/.android/debug.keystore -alias androiddebugkey -storepass android -keypass android
 
 useful links :
 Push kit : https://developer.huawei.com/consumer/en/codelab/HMSPushKit/index.html#0
 
 HMS : https://www.huaweicentral.com/huawei-mobile-services-hms-everything-you-need-to-know/
 
 
 EMUI : https://consumer.huawei.com/en/emui/
 
 AGC ; https://developer.huawei.com/consumer/en/service/josp/agc/index.html
