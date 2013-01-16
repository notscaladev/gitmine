package org.gitmine.core.user.domain;

import java.util.Date;

public class User {
    private int mId;
    private String mUserName;
    private String mUserEmail;
    private String mUserSecondaryEmail;
    private String mUserPassword;
    private String mUserGender;
    private Date mRegisterDate;
    
    public User(){}

    public User(int mId, String mUserName, String mUserEmail, String mUserSecondaryEmail, String mUserPassword, String mUserGender, Date mRegisterDate) {
        this.mId = mId;
        this.mUserName = mUserName;
        this.mUserEmail = mUserEmail;
        this.mUserSecondaryEmail = mUserSecondaryEmail;
        this.mUserPassword = mUserPassword;
        this.mUserGender = mUserGender;
        this.mRegisterDate = mRegisterDate;
    }

    /**
     * @return the mId
     */
    public int getId() {
        return mId;
    }

    /**
     * @param mId the mId to set
     */
    public void setId(int mId) {
        this.mId = mId;
    }

    /**
     * @return the mUserName
     */
    public String getUserName() {
        return mUserName;
    }

    /**
     * @param mUserName the mUserName to set
     */
    public void setUserName(String mUserName) {
        this.mUserName = mUserName;
    }

    /**
     * @return the mUserEmail
     */
    public String getUserEmail() {
        return mUserEmail;
    }

    /**
     * @param mUserEmail the mUserEmail to set
     */
    public void setUserEmail(String mUserEmail) {
        this.mUserEmail = mUserEmail;
    }

    /**
     * @return the mUserSecondaryEmail
     */
    public String getUserSecondaryEmail() {
        return mUserSecondaryEmail;
    }

    /**
     * @param mUserSecondaryEmail the mUserSecondaryEmail to set
     */
    public void setUserSecondaryEmail(String mUserSecondaryEmail) {
        this.mUserSecondaryEmail = mUserSecondaryEmail;
    }

    /**
     * @return the mUserPassword
     */
    public String getUserPassword() {
        return mUserPassword;
    }

    /**
     * @param mUserPassword the mUserPassword to set
     */
    public void setUserPassword(String mUserPassword) {
        this.mUserPassword = mUserPassword;
    }

    /**
     * @return the mUserGender
     */
    public String getUserGender() {
        return mUserGender;
    }

    /**
     * @param mUserGender the mUserGender to set
     */
    public void setUserGender(String mUserGender) {
        this.mUserGender = mUserGender;
    }

    /**
     * @return the mRegisterDate
     */
    public Date getRegisterDate() {
        return mRegisterDate;
    }

    /**
     * @param mRegisterDate the mRegisterDate to set
     */
    public void setRegisterDate(Date mRegisterDate) {
        this.mRegisterDate = mRegisterDate;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.mId;
        hash = 89 * hash + (this.mUserName != null ? this.mUserName.hashCode() : 0);
        hash = 89 * hash + (this.mUserEmail != null ? this.mUserEmail.hashCode() : 0);
        hash = 89 * hash + (this.mUserSecondaryEmail != null ? this.mUserSecondaryEmail.hashCode() : 0);
        hash = 89 * hash + (this.mUserPassword != null ? this.mUserPassword.hashCode() : 0);
        hash = 89 * hash + (this.mUserGender != null ? this.mUserGender.hashCode() : 0);
        hash = 89 * hash + (this.mRegisterDate != null ? this.mRegisterDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (this.mId != other.mId) {
            return false;
        }
        if ((this.mUserName == null) ? (other.mUserName != null) : !this.mUserName.equals(other.mUserName)) {
            return false;
        }
        if ((this.mUserEmail == null) ? (other.mUserEmail != null) : !this.mUserEmail.equals(other.mUserEmail)) {
            return false;
        }
        if ((this.mUserSecondaryEmail == null) ? (other.mUserSecondaryEmail != null) : !this.mUserSecondaryEmail.equals(other.mUserSecondaryEmail)) {
            return false;
        }
        if ((this.mUserPassword == null) ? (other.mUserPassword != null) : !this.mUserPassword.equals(other.mUserPassword)) {
            return false;
        }
        if ((this.mUserGender == null) ? (other.mUserGender != null) : !this.mUserGender.equals(other.mUserGender)) {
            return false;
        }
        if (this.mRegisterDate != other.mRegisterDate && (this.mRegisterDate == null || !this.mRegisterDate.equals(other.mRegisterDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "mId=" + mId + ", mUserName=" 
                + mUserName + ", mUserEmail=" + mUserEmail 
                + ", mUserSecondaryEmail=" + mUserSecondaryEmail 
                + ", mUserPassword=" + mUserPassword + ", mUserGender=" 
                + mUserGender + ", mRegisterDate=" + mRegisterDate + '}';
    } 
}
