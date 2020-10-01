/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author SUNREN
 */
public class CreatePerson {    
    private String name;
    private String gographicData;
    private String DateOfBirth;
    private String TelephoneNumbers;
    private String FAXNumber;
    private String EmailAddresses;
    private String SocialSecurityNumber;
    private String MedicalRecordNumber;
    private String HealthPlanBeneficiaryNumber;
    private String BankAccountNumbers;
    private String CertificatecenseNumber;
    private String VehicleIdentifiers;
    private String DeviceIdentifiers;
    private String LinkedIn;
    private String InternetProtocolAddresses;
    private String BiometricIdentifiers;
    private String filePath;
    private String uniqueCode;

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGographicData() {
        return gographicData;
    }

    public void setGographicData(String gographicData) {
        this.gographicData = gographicData;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public String getTelephoneNumbers() {
        return TelephoneNumbers;
    }

    public void setTelephoneNumbers(String TelephoneNumbers) {
        this.TelephoneNumbers = TelephoneNumbers;
    }

    public String getFAXNumber() {
        return FAXNumber;
    }

    public void setFAXNumber(String FAXNumber) {
        this.FAXNumber = FAXNumber;
    }

    public String getEmailAddresses() {
        return EmailAddresses;
    }

    public void setEmailAddresses(String EmailAddresses) {
        this.EmailAddresses = EmailAddresses;
    }

    public String getSocialSecurityNumber() {
        return SocialSecurityNumber;
    }

    public void setSocialSecurityNumber(String SocialSecurityNumber) {
        this.SocialSecurityNumber = SocialSecurityNumber;
    }

    public String getMedicalRecordNumber() {
        return MedicalRecordNumber;
    }

    public void setMedicalRecordNumber(String MedicalRecordNumber) {
        this.MedicalRecordNumber = MedicalRecordNumber;
    }

    public String getHealthPlanBeneficiaryNumber() {
        return HealthPlanBeneficiaryNumber;
    }

    public void setHealthPlanBeneficiaryNumber(String HealthPlanBeneficiaryNumber) {
        this.HealthPlanBeneficiaryNumber = HealthPlanBeneficiaryNumber;
    }

    public String getBankAccountNumbers() {
        return BankAccountNumbers;
    }

    public void setBankAccountNumbers(String BankAccountNumbers) {
        this.BankAccountNumbers = BankAccountNumbers;
    }

    public String getCertificatecenseNumber() {
        return CertificatecenseNumber;
    }

    public void setCertificatecenseNumber(String CertificatecenseNumber) {
        this.CertificatecenseNumber = CertificatecenseNumber;
    }

    public String getVehicleIdentifiers() {
        return VehicleIdentifiers;
    }

    public void setVehicleIdentifiers(String VehicleIdentifiers) {
        this.VehicleIdentifiers = VehicleIdentifiers;
    }

    public String getDeviceIdentifiers() {
        return DeviceIdentifiers;
    }

    public void setDeviceIdentifiers(String DeviceIdentifiers) {
        this.DeviceIdentifiers = DeviceIdentifiers;
    }

    public String getLinkedIn() {
        return LinkedIn;
    }

    public void setLinkedIn(String LinkedIn) {
        this.LinkedIn = LinkedIn;
    }

    public String getInternetProtocolAddresses() {
        return InternetProtocolAddresses;
    }

    public void setInternetProtocolAddresses(String InternetProtocolAddresses) {
        this.InternetProtocolAddresses = InternetProtocolAddresses;
    }

    public String getBiometricIdentifiers() {
        return BiometricIdentifiers;
    }

    public void setBiometricIdentifiers(String BiometricIdentifiers) {
        this.BiometricIdentifiers = BiometricIdentifiers;
    }
    
    public void setFilePath(String filePath){
        this.filePath = filePath;
    }
    
    public String getFilePath(){
        return this.filePath;
    }
   
    @Override
    public String toString()
    {
        return this.name;
        
   
    }
    
}
