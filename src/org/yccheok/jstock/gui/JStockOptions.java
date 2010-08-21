/*
 * JStock - Free Stock Market Software
 * Copyright (C) 2010 Yan Cheng CHEOK <yccheok@yahoo.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */


package org.yccheok.jstock.gui;

import java.awt.Color;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.httpclient.Credentials;
import org.apache.commons.httpclient.NTCredentials;
import org.yccheok.jstock.portfolio.BrokingFirm;
import org.yccheok.jstock.engine.Country;

/**
 *
 * @author yccheok
 */
public class JStockOptions {

    /**
     * @return the yellowInformationBoxOption
     */
    public YellowInformationBoxOption getYellowInformationBoxOption() {
        return yellowInformationBoxOption;
    }

    /**
     * @param yellowInformationBoxOption the yellowInformationBoxOption to set
     */
    public void setYellowInformationBoxOption(YellowInformationBoxOption yellowInformationBoxOption) {
        this.yellowInformationBoxOption = yellowInformationBoxOption;
    }

    /**
     * @return the CCEmail
     */
    public String getCCEmail() {
        return CCEmail;
    }

    /**
     * @param CCEmail the CCEmail to set
     */
    public void setCCEmail(String CCEmail) {
        this.CCEmail = CCEmail;
    }

    /**
     * @return the locale
     */
    public Locale getLocale() {
        return locale;
    }

    /**
     * @param locale the locale to set
     */
    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    /**
     * @return the fallBelowAlertForegroundColor
     */
    public Color getFallBelowAlertForegroundColor() {
        return fallBelowAlertForegroundColor;
    }

    /**
     * @param fallBelowAlertForegroundColor the fallBelowAlertForegroundColor to set
     */
    public void setFallBelowAlertForegroundColor(Color fallBelowAlertForegroundColor) {
        this.fallBelowAlertForegroundColor = fallBelowAlertForegroundColor;
    }

    /**
     * @return the fallBelowAlertBackgroundColor
     */
    public Color getFallBelowAlertBackgroundColor() {
        return fallBelowAlertBackgroundColor;
    }

    /**
     * @param fallBelowAlertBackgroundColor the fallBelowAlertBackgroundColor to set
     */
    public void setFallBelowAlertBackgroundColor(Color fallBelowAlertBackgroundColor) {
        this.fallBelowAlertBackgroundColor = fallBelowAlertBackgroundColor;
    }

    /**
     * @return the riseAboveAlertForegroundColor
     */
    public Color getRiseAboveAlertForegroundColor() {
        return riseAboveAlertForegroundColor;
    }

    /**
     * @param riseAboveAlertForegroundColor the riseAboveAlertForegroundColor to set
     */
    public void setRiseAboveAlertForegroundColor(Color riseAboveAlertForegroundColor) {
        this.riseAboveAlertForegroundColor = riseAboveAlertForegroundColor;
    }

    /**
     * @return the riseAboveAlertBackgroundColor
     */
    public Color getRiseAboveAlertBackgroundColor() {
        return riseAboveAlertBackgroundColor;
    }

    /**
     * @param riseAboveAlertBackgroundColor the riseAboveAlertBackgroundColor to set
     */
    public void setRiseAboveAlertBackgroundColor(Color riseAboveAlertBackgroundColor) {
        this.riseAboveAlertBackgroundColor = riseAboveAlertBackgroundColor;
    }

    public enum YellowInformationBoxOption {
        Stay,
        Follow,
        Hide
    }

    public static final java.awt.Color DEFAULT_NORMAL_TEXT_FOREGROUND_COLOR = Color.BLACK;
    public static final java.awt.Color DEFAULT_HIGHER_NUMERICAL_VALUE_FOREGROUND_COLOR = new java.awt.Color(50, 150, 0);
    public static final java.awt.Color DEFAULT_LOWER_NUMERICAL_VALUE_FOREGROUND_COLOR = new java.awt.Color(200, 0, 50);
    public static final java.awt.Color DEFAULT_FIRST_ROW_BACKGROUND_COLOR = Color.WHITE;
    public static final java.awt.Color DEFAULT_SECOND_ROW_BACKGROUND_COLOR = new java.awt.Color(255, 255, 204);
    public static final java.awt.Color DEFAULT_AUTO_UPDATE_FOREGROUND_COLOR = Color.BLACK;
    public static final java.awt.Color DEFAULT_AUTO_UPDATE_BACKGROUND_COLOR = Color.RED;

    public static final java.awt.Color DEFAULT_FALL_BELOW_ALERT_FOREGROUND_COLOR = Color.YELLOW;
    public static final java.awt.Color DEFAULT_FALL_BELOW_ALERT_BACKGROUND_COLOR = Color.BLACK;
    public static final java.awt.Color DEFAULT_RISE_ABOVE_ALERT_FOREGROUND_COLOR = Color.YELLOW;
    public static final java.awt.Color DEFAULT_RISE_ABOVE_ALERT_BACKGROUND_COLOR = Color.BLACK;

    public static final java.awt.Color DEFAULT_CHAT_SYSTEM_MESSAGE_COLOR = Color.RED;
    public static final java.awt.Color DEFAULT_CHAT_OWN_MESSAGE_COLOR = new java.awt.Color(169, 169, 169);
    public static final java.awt.Color DEFAULT_CHAT_OTHER_MESSAGE_COLOR = new java.awt.Color(100, 149, 237);

    private static final YellowInformationBoxOption DEFAULT_YELLOW_INFORMATION_BOX_OPTION = YellowInformationBoxOption.Follow;
    
    private static final int DEFAULT_HISTORY_DURATION =  10;

    /** Creates a new instance of JStockOptions */
    public JStockOptions() {
        this.popupMessage = true;
        this.sendEmail = false;
        this.email = "";
        this.CCEmail = "";
        this.emailPassword = "";
        this.SMSEnabled = false;
        this.googleCalendarUsername = "";
        this.googleCalendarPassword = "";
        this.singleIndicatorAlert = true;
        this.proxyServer = "";
        this.proxyPort = -1;
        this.scanningSpeed = 1000;
        this.alertSpeed = 5;
        this.looknFeel = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
        this.country = Country.Malaysia;
        this.soundEnabled = false;

        this.normalTextForegroundColor = DEFAULT_NORMAL_TEXT_FOREGROUND_COLOR;
        this.higherNumericalValueForegroundColor = DEFAULT_HIGHER_NUMERICAL_VALUE_FOREGROUND_COLOR;
        this.lowerNumericalValueForegroundColor = DEFAULT_LOWER_NUMERICAL_VALUE_FOREGROUND_COLOR;
        
        this.firstRowBackgroundColor = DEFAULT_FIRST_ROW_BACKGROUND_COLOR;
        this.secondRowBackgroundColor = DEFAULT_SECOND_ROW_BACKGROUND_COLOR;
                
        this.enableColorChange = false;
        this.autoUpdateForegroundColor = DEFAULT_AUTO_UPDATE_FOREGROUND_COLOR;
        this.autoUpdateBackgroundColor = DEFAULT_AUTO_UPDATE_BACKGROUND_COLOR;

        this.enableColorAlert = false;
        this.fallBelowAlertForegroundColor = DEFAULT_FALL_BELOW_ALERT_FOREGROUND_COLOR;
        this.fallBelowAlertBackgroundColor = DEFAULT_FALL_BELOW_ALERT_BACKGROUND_COLOR;
        this.riseAboveAlertForegroundColor = DEFAULT_RISE_ABOVE_ALERT_FOREGROUND_COLOR;
        this.riseAboveAlertBackgroundColor = DEFAULT_RISE_ABOVE_ALERT_BACKGROUND_COLOR;

        this.isAutoUpdateNewsEnabled = true;
        this.newsID = "";

        this.historyDuration = DEFAULT_HISTORY_DURATION;

        this.isChatEnabled = false;
        this.chatUsername = "";
        this.chatPassword = "";
        this.isChatFlashNotificationEnabled = true;
        this.isChatSoundNotificationEnabled = true;

        this.chatSystemMessageColor = DEFAULT_CHAT_SYSTEM_MESSAGE_COLOR;
        this.chatOwnMessageColor = DEFAULT_CHAT_OWN_MESSAGE_COLOR;
        this.chatOtherMessageColor = DEFAULT_CHAT_OTHER_MESSAGE_COLOR;

        this.yellowInformationBoxOption = DEFAULT_YELLOW_INFORMATION_BOX_OPTION;
        this.locale = Locale.getDefault();
    }

    private boolean soundEnabled;
    private boolean singleIndicatorAlert;
    private boolean popupMessage;
    private boolean sendEmail;
    private String email;
    private String emailPassword;
    private String CCEmail;
    private String googleCalendarUsername;
    private String googleCalendarPassword;
    private boolean SMSEnabled;
    @Deprecated
    private transient boolean passwordProtectedIndicator;
    @Deprecated
    private transient String indicatorPassword;
    private String proxyServer;
    private int proxyPort;
    private int scanningSpeed;  /* In second. */
    private int alertSpeed;
    private String looknFeel;
    
    private Color normalTextForegroundColor;
    private Color lowerNumericalValueForegroundColor;
    private Color higherNumericalValueForegroundColor;
    private Color firstRowBackgroundColor;
    private Color secondRowBackgroundColor;
    private Color autoUpdateForegroundColor;
    private Color autoUpdateBackgroundColor;
    @Deprecated
    private transient Color alertForegroundColor;
    @Deprecated
    private transient Color alertBackgroundColor;
    // As replacement for alertForegroundColor and alertBackgroundColor.
    private Color fallBelowAlertForegroundColor;
    private Color fallBelowAlertBackgroundColor;
    private Color riseAboveAlertForegroundColor;
    private Color riseAboveAlertBackgroundColor;

    private boolean enableColorChange;
    private boolean enableColorAlert;

    private List<BrokingFirm> brokingFirms = new ArrayList<BrokingFirm>();
    private int selectedBrokingFirmIndex = -1;
    private boolean isAutoBrokerFeeCalculationEnabled = false;
    
    private double expectedProfitPercentage = 10.0;

    private Country country;

    private boolean isAutoUpdateNewsEnabled;
    @Deprecated
    private transient long newsVersion;
    private String newsID;

    private int historyDuration; /* In years */

    private boolean isChatEnabled = false;
    private String chatUsername = "";
    private String chatPassword = "";
    private boolean isChatSoundNotificationEnabled = true;
    private boolean isChatFlashNotificationEnabled = true;
    private Color chatSystemMessageColor;
    private Color chatOwnMessageColor;
    private Color chatOtherMessageColor;

    // We want to avoid from having too frequent credentials creation during
    // runtime. We will immediately contruct credentials, once we load the
    // JStockOptions from disk.
    private transient Credentials credentials = null;
    private String proxyAuthPassword = "";
    private String proxyAuthUserName = "";
    private boolean isProxyAuthEnabled = false;

    /* For UK client. */
    private boolean penceToPoundConversionEnabled = false;

    private boolean rememberGoogleAccountEnabled = false;
    private String googleUsername = "";
    private String googlePassword = "";

    // Remember where we save/open the last file.
    private String lastFileIODirectory = System.getProperty("user.home");
    private String lastFileNameExtensionDescription = "CSV Documents (*.csv)";

    private Map<Country, Class> primaryStockServerFactoryClasses = new EnumMap<Country, Class>(Country.class);

    // Remember the last view page.
    private int lastSelectedPageIndex = 0;

    // Use -1 to indicate unlimited SMS per day.
    private int maxSMSPerDay = -1;

    private String portfolioName = org.yccheok.jstock.portfolio.Utils.getDefaultPortfolioName();

    private String watchlistName = org.yccheok.jstock.watchlist.Utils.getDefaultWatchlistName();

    private YellowInformationBoxOption yellowInformationBoxOption = YellowInformationBoxOption.Follow;

    private Locale locale = Locale.getDefault();
    
    public boolean isAutoBrokerFeeCalculationEnabled() {
        return this.isAutoBrokerFeeCalculationEnabled;
    }
    
    public void setAutoBrokerFeeCalculationEnabled(boolean isAutoBrokerFeeCalculationEnabled) {
        this.isAutoBrokerFeeCalculationEnabled = isAutoBrokerFeeCalculationEnabled;
    }

    public void insensitiveCopy(JStockOptions jStockOptions) {
        this.singleIndicatorAlert = jStockOptions.singleIndicatorAlert;
        this.popupMessage = jStockOptions.popupMessage;

        //this.sendEmail = jStockOptions.sendEmail;
        //this.email = jStockOptions.email;
        //this.CCEmail = jStockOptions.CCEmail;
        //this.emailPassword = jStockOptions.emailPassword;
        //this.googleCalendarUsername = jStockOptions.googleCalendarUsername;
        //this.googleCalendarPassword = jStockOptions.googleCalendarPassword;
        //this.SMSEnabled = jStockOptions.SMSEnabled;

        // Don't store proxy. Home and office proxy environment are most probably different.
        //this.proxyServer = jStockOptions.proxyServer;
        //this.proxyPort = jStockOptions.proxyPort;
        this.scanningSpeed = jStockOptions.scanningSpeed;
        this.alertSpeed = jStockOptions.alertSpeed;
        this.looknFeel = jStockOptions.looknFeel;

        this.normalTextForegroundColor = jStockOptions.normalTextForegroundColor;
        this.lowerNumericalValueForegroundColor = jStockOptions.lowerNumericalValueForegroundColor;
        this.higherNumericalValueForegroundColor = jStockOptions.higherNumericalValueForegroundColor;
        this.firstRowBackgroundColor = jStockOptions.firstRowBackgroundColor;
        this.secondRowBackgroundColor = jStockOptions.secondRowBackgroundColor;
        this.autoUpdateForegroundColor = jStockOptions.autoUpdateForegroundColor;
        this.autoUpdateBackgroundColor = jStockOptions.autoUpdateBackgroundColor;
        this.fallBelowAlertForegroundColor = jStockOptions.fallBelowAlertForegroundColor;
        this.fallBelowAlertBackgroundColor = jStockOptions.fallBelowAlertBackgroundColor;
        this.riseAboveAlertForegroundColor = jStockOptions.riseAboveAlertForegroundColor;
        this.riseAboveAlertBackgroundColor = jStockOptions.riseAboveAlertBackgroundColor;
        this.enableColorChange = jStockOptions.enableColorChange;
        this.enableColorAlert = jStockOptions.enableColorAlert;

        this.brokingFirms = jStockOptions.brokingFirms;
        this.selectedBrokingFirmIndex = jStockOptions.selectedBrokingFirmIndex;
        this.isAutoBrokerFeeCalculationEnabled = jStockOptions.isAutoBrokerFeeCalculationEnabled;

        this.expectedProfitPercentage = jStockOptions.expectedProfitPercentage;

        this.country = jStockOptions.country;

        this.isAutoUpdateNewsEnabled = jStockOptions.isAutoUpdateNewsEnabled;

        //this.newsID = jStockOptions.newsID;

        this.historyDuration = jStockOptions.historyDuration;

        //this.isChatEnabled = jStockOptions.isChatEnabled;
        //this.chatUsername = jStockOptions.chatUsername;
        //this.chatPassword = jStockOptions.chatPassword;
        this.isChatSoundNotificationEnabled = jStockOptions.isChatSoundNotificationEnabled;
        this.isChatFlashNotificationEnabled = jStockOptions.isChatFlashNotificationEnabled;
        this.chatSystemMessageColor = jStockOptions.chatSystemMessageColor;
        this.chatOwnMessageColor = jStockOptions.chatOwnMessageColor;
        this.chatOtherMessageColor = jStockOptions.chatOtherMessageColor;

        // Don't store proxy. Home and office proxy environment are most probably different.
        //
        // We want to avoid from having too frequent credentials creation during
        // runtime. We will immediately contruct credentials, once we load the
        // JStockOptions from disk.
        //this.credentials = jStockOptions.credentials;
        //this.proxyAuthPassword = jStockOptions.proxyAuthPassword;
        //this.proxyAuthUserName = jStockOptions.proxyAuthUserName;
        //this.isProxyAuthEnabled = jStockOptions.isProxyAuthEnabled;

        /* For UK client. */
        this.penceToPoundConversionEnabled = jStockOptions.penceToPoundConversionEnabled;

        //this.rememberGoogleAccountEnabled = jStockOptions.rememberGoogleAccountEnabled;
        //this.googleUsername = jStockOptions.googleUsername;
        //this.googlePassword = jStockOptions.googlePassword;

        // Don't save file location. Different machines may have different file location.
        //
        // Remember where we save/open the last file.
        //this.lastFileIODirectory = jStockOptions.lastFileIODirectory;
        //this.lastFileNameExtensionDescription = jStockOptions.lastFileNameExtensionDescription;

        this.primaryStockServerFactoryClasses = jStockOptions.primaryStockServerFactoryClasses;

        // Remember the last view page.
        this.lastSelectedPageIndex = jStockOptions.lastSelectedPageIndex;

        // Use -1 to indicate unlimited SMS per day.
        this.maxSMSPerDay = jStockOptions.maxSMSPerDay;

        this.portfolioName = jStockOptions.portfolioName;

        this.watchlistName = jStockOptions.watchlistName;

        this.yellowInformationBoxOption = jStockOptions.yellowInformationBoxOption;
        
        // We won't save locale into cloud. As to have effect on new locale,
        // restarting the entire application is required. We do not want user
        // to restart the application after loading from cloud.
        //this.locale = jStockOptions.locale;
    }

    // User may not trust us to store their password in cloud server. To avoid
    // from getting trouble, we will clone another copy of JStockOptions, which
    // doesn't contain sensitive data.
    public JStockOptions insensitiveClone() {
        final JStockOptions jStockOptions = new JStockOptions();

        jStockOptions.singleIndicatorAlert = this.singleIndicatorAlert;
        jStockOptions.popupMessage = this.popupMessage;
        //jStockOptions.sendEmail = this.sendEmail;
        //jStockOptions.email = this.email;
        //jStockOptions.CCEmail = this.CCEmail;
        //jStockOptions.emailPassword = this.emailPassword;
        //jStockOptions.googleCalendarUsername = this.googleCalendarUsername;
        //jStockOptions.googleCalendarPassword = this.googleCalendarPassword;
        //jStockOptions.SMSEnabled = this.SMSEnabled;

        // Don't store proxy. Home and office proxy environment are most probably different.
        //jStockOptions.proxyServer = this.proxyServer;
        //jStockOptions.proxyPort this.proxyPort;
        jStockOptions.scanningSpeed = this.scanningSpeed;
        jStockOptions.alertSpeed = this.alertSpeed;
        jStockOptions.looknFeel = this.looknFeel;

        jStockOptions.normalTextForegroundColor = this.normalTextForegroundColor;
        jStockOptions.lowerNumericalValueForegroundColor = this.lowerNumericalValueForegroundColor;
        jStockOptions.higherNumericalValueForegroundColor = this.higherNumericalValueForegroundColor;
        jStockOptions.firstRowBackgroundColor = this.firstRowBackgroundColor;
        jStockOptions.secondRowBackgroundColor = this.secondRowBackgroundColor;
        jStockOptions.autoUpdateForegroundColor = this.autoUpdateForegroundColor;
        jStockOptions.autoUpdateBackgroundColor = this.autoUpdateBackgroundColor;
        jStockOptions.fallBelowAlertForegroundColor = this.getFallBelowAlertForegroundColor;
        jStockOptions.fallBelowAlertBackgroundColor = this.getFallBelowAlertBackgroundColor;
        jStockOptions.riseAboveAlertForegroundColor = this.getRiseAboveAlertForegroundColor;
        jStockOptions.riseAboveAlertBackgroundColor = this.getRiseAboveAlertBackgroundColor;
        jStockOptions.enableColorChange = this.enableColorChange;
        jStockOptions.enableColorAlert = this.enableColorAlert;

        jStockOptions.brokingFirms = this.brokingFirms;
        jStockOptions.selectedBrokingFirmIndex = this.selectedBrokingFirmIndex;
        jStockOptions.isAutoBrokerFeeCalculationEnabled = this.isAutoBrokerFeeCalculationEnabled;

        jStockOptions.expectedProfitPercentage = this.expectedProfitPercentage;

        jStockOptions.country = this.country;

        jStockOptions.isAutoUpdateNewsEnabled = this.isAutoUpdateNewsEnabled;

        //jStockOptions.newsID = this.newsID;

        jStockOptions.historyDuration = this.historyDuration;

        //jStockOptions.isChatEnabled = this.isChatEnabled;
        //jStockOptions.chatUsername = this.chatUsername;
        //jStockOptions.chatPassword = this.chatPassword;
        jStockOptions.isChatSoundNotificationEnabled = this.isChatSoundNotificationEnabled;
        jStockOptions.isChatFlashNotificationEnabled = this.isChatFlashNotificationEnabled;
        jStockOptions.chatSystemMessageColor = this.chatSystemMessageColor;
        jStockOptions.chatOwnMessageColor = this.chatOwnMessageColor;
        jStockOptions.chatOtherMessageColor = this.chatOtherMessageColor;

        // Don't store proxy. Home and office proxy environment are most probably different.
        //
        // We want to avoid from having too frequent credentials creation during
        // runtime. We will immediately contruct credentials, once we load the
        // JStockOptions from disk.
        //jStockOptions.credentials = this.credentials;
        //jStockOptions.proxyAuthPassword = this.proxyAuthPassword;
        //jStockOptions.proxyAuthUserName = this.proxyAuthUserName;
        //jStockOptions.isProxyAuthEnabled = this.isProxyAuthEnabled;

        /* For UK client. */
        jStockOptions.penceToPoundConversionEnabled = this.penceToPoundConversionEnabled;

        //jStockOptions.rememberGoogleAccountEnabled = this.rememberGoogleAccountEnabled;
        //jStockOptions.googleUsername = this.googleUsername;
        //jStockOptions.googlePassword = this.googlePassword;

        // Don't save file location. Different machines may have different file location.
        //
        // Remember where we save/open the last file.
        //jStockOptions.lastFileIODirectory = this.lastFileIODirectory;
        //jStockOptions.lastFileNameExtensionDescription = this.lastFileNameExtensionDescription;

        jStockOptions.primaryStockServerFactoryClasses = this.primaryStockServerFactoryClasses;

        // Remember the last view page.
        jStockOptions.lastSelectedPageIndex = this.lastSelectedPageIndex;

        // Use -1 to indicate unlimited SMS per day.
        jStockOptions.maxSMSPerDay = this.maxSMSPerDay;

        jStockOptions.portfolioName = this.portfolioName;

        jStockOptions.watchlistName = this.watchlistName;

        jStockOptions.yellowInformationBoxOption = this.yellowInformationBoxOption;
        // We won't save locale into cloud. As to have effect on new locale,
        // restarting the entire application is required. We do not want user
        // to restart the application after loading from cloud.
        //jStockOptions.locale = this.locale;

        return jStockOptions;
    }

    private Object readResolve() {
        /* For backward compatible */
        if (lastSelectedPageIndex < 0) {
            lastSelectedPageIndex = 0;
        }

        /* For backward compatible */
        if (brokingFirms == null) {
            brokingFirms = new ArrayList<BrokingFirm>();
        }
        
        /* For backward compatible */
        if (country == null) {
            country = Country.Malaysia;
        }

        if (historyDuration <= 0) {
            historyDuration = DEFAULT_HISTORY_DURATION;
        }

        if (getChatUsername() == null) {
            setChatUsername("");
        }

        if (getChatPassword() == null) {
            setChatPassword("");
        }

        if (this.getChatSystemMessageColor() == null) {
            this.setChatSystemMessageColor(DEFAULT_CHAT_SYSTEM_MESSAGE_COLOR);
        }

        if (this.getChatOwnMessageColor() == null) {
            this.setChatOwnMessageColor(DEFAULT_CHAT_OWN_MESSAGE_COLOR);
        }

        if (this.getChatOtherMessageColor() == null) {
            this.setChatOtherMessageColor(DEFAULT_CHAT_OTHER_MESSAGE_COLOR);
        }

        if (this.getFallBelowAlertForegroundColor() == null) {
            this.setFallBelowAlertForegroundColor(DEFAULT_FALL_BELOW_ALERT_FOREGROUND_COLOR);
        }

        if (this.getFallBelowAlertBackgroundColor() == null) {
            this.setFallBelowAlertBackgroundColor(DEFAULT_FALL_BELOW_ALERT_BACKGROUND_COLOR);    
        }

        if (this.getRiseAboveAlertForegroundColor() == null) {
            this.setRiseAboveAlertForegroundColor(DEFAULT_RISE_ABOVE_ALERT_FOREGROUND_COLOR);
        }

        if (this.getRiseAboveAlertBackgroundColor() == null) {
            this.setRiseAboveAlertBackgroundColor(DEFAULT_RISE_ABOVE_ALERT_BACKGROUND_COLOR);    
        }

        if (this.proxyAuthUserName == null) {
            this.proxyAuthUserName = "";
        }

        if (this.proxyAuthPassword == null) {
            this.proxyAuthPassword = "";
        }

        if (this.getGoogleUsername() == null) {
            this.setGoogleUsername("");
        }

        if (this.getGooglePassword() == null) {
            this.setGooglePassword("");
        }
    
        setCredentials(new NTCredentials(this.proxyAuthUserName, Utils.decrypt(this.proxyAuthPassword), "", ""));

        if (this.getLastFileIODirectory() == null) {
            this.setLastFileIODirectory("");
        }

        if (this.getLastSavedFileNameExtensionDescription() == null) {
            this.setLastFileNameExtensionDescription("CSV Documents (*.csv)");
        }

        if (this.getGoogleCalendarUsername() == null) {
            this.setGoogleCalendarUsername("");
            this.setSMSEnabled(false);
        }

        if (this.getGoogleCalendarPassword() == null) {
            setGoogleCalendarPassword("");
            this.setSMSEnabled(false);
        }

        if (this.primaryStockServerFactoryClasses == null) {
            primaryStockServerFactoryClasses = new EnumMap<Country, Class>(Country.class);
        }

        if (this.portfolioName == null) {
            this.portfolioName = org.yccheok.jstock.portfolio.Utils.getDefaultPortfolioName();
        }

        if (this.watchlistName == null) {
            this.watchlistName = org.yccheok.jstock.watchlist.Utils.getDefaultWatchlistName();
        }

        if (this.maxSMSPerDay <= 0) {
            maxSMSPerDay = -1;
        }

        if (this.getNewsID() == null) {
            this.setNewsID("");
        }

        if (this.yellowInformationBoxOption == null) {
            this.yellowInformationBoxOption = YellowInformationBoxOption.Follow;
        }

        if (this.getCCEmail() == null) {
            this.setCCEmail("");
        }

        if (this.getLocale() == null) {
            this.setLocale(Locale.getDefault());
        }
        
        return this;
    }    
    
    public int getBrokingFirmSize() {        
        return brokingFirms.size();
    }
    
    public BrokingFirm getBrokingFirm(int index) {
        return brokingFirms.get(index);
    }
    
    public int getSelectedBrokingFirmIndex() {
        return selectedBrokingFirmIndex;
    }
    
    public void setSelectedBrokingFirmIndex(int selectedBrokingFirmIndex) {
        this.selectedBrokingFirmIndex = selectedBrokingFirmIndex;
    }
    
    public void clearBrokingFirms() {
        this.brokingFirms.clear();
    }
    
    public void addBrokingFirm(BrokingFirm brokingFirm) {
        this.brokingFirms.add(brokingFirm);
    }
    
    public BrokingFirm getSelectedBrokingFirm() {
        if ((this.selectedBrokingFirmIndex < 0) || (this.selectedBrokingFirmIndex >= this.getBrokingFirmSize()))
            return null;
        
        return this.brokingFirms.get(this.selectedBrokingFirmIndex);
    }
    
    public String getLooknFeel() {
        return looknFeel;
    }
    
    public void setLookNFeel(String looknFeel) {
        this.looknFeel = looknFeel;
    }
    
    public boolean isSingleIndicatorAlert() {
        return singleIndicatorAlert;
    }
    
    public void setSingleIndicatorAlert(boolean singleIndicatorAlert) {
        this.singleIndicatorAlert = singleIndicatorAlert;
    }
    
    public boolean isPopupMessage() {
        return popupMessage;
    }

    public void setPopupMessage(boolean popupMessage) {
        this.popupMessage = popupMessage;
    }

    public boolean isSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailPassword() {
        return emailPassword;
    }

    public void setEmailPassword(String emailPassword) {
        this.emailPassword = emailPassword;
    }

    public String getProxyServer() {
        return proxyServer;
    }

    public void setProxyServer(String proxyServer) {
        this.proxyServer = proxyServer;
    }

    public int getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(int proxyPort) {
        this.proxyPort = proxyPort;
    }

    public int getScanningSpeed() {
        return scanningSpeed;
    }

    public int getAlertSpeed() {
        return alertSpeed;
    }
    
    public void setScanningSpeed(int scanningSpeed) {
        this.scanningSpeed = scanningSpeed;
    }
    
    public void setAlertSpeed(int alertSpeed) {
        this.alertSpeed = alertSpeed;
    }    

    public Color getNormalTextForegroundColor() {
        return normalTextForegroundColor;
    }

    public void setNormalTextForegroundColor(Color normalTextForegroundColor) {
        this.normalTextForegroundColor = normalTextForegroundColor;
    }

    public Color getLowerNumericalValueForegroundColor() {
        return lowerNumericalValueForegroundColor;
    }

    public void setLowerNumericalValueForegroundColor(Color lowerNumericalValueForegroundColor) {
        this.lowerNumericalValueForegroundColor = lowerNumericalValueForegroundColor;
    }

    public Color getHigherNumericalValueForegroundColor() {
        return higherNumericalValueForegroundColor;
    }

    public void setHigherNumericalValueForegroundColor(Color higherNumericalValueForegroundColor) {
        this.higherNumericalValueForegroundColor = higherNumericalValueForegroundColor;
    }

    public Color getFirstRowBackgroundColor() {
        return firstRowBackgroundColor;
    }

    public void setFirstRowBackgroundColor(Color firstRowBackgroundColor) {
        this.firstRowBackgroundColor = firstRowBackgroundColor;
    }

    public Color getSecondRowBackgroundColor() {
        return secondRowBackgroundColor;
    }

    public void setSecondRowBackgroundColor(Color secondRowBackgroundColor) {
        this.secondRowBackgroundColor = secondRowBackgroundColor;
    }

    public Color getAutoUpdateForegroundColor() {
        return autoUpdateForegroundColor;
    }

    public void setAutoUpdateForegroundColor(Color autoUpdateForegroundColor) {
        this.autoUpdateForegroundColor = autoUpdateForegroundColor;
    }

    public Color getAutoUpdateBackgroundColor() {
        return autoUpdateBackgroundColor;
    }

    public void setAutoUpdateBackgroundColor(Color autoUpdateBackgroundColor) {
        this.autoUpdateBackgroundColor = autoUpdateBackgroundColor;
    }

    public boolean isEnableColorChange() {
        return enableColorChange;
    }

    public void setEnableColorChange(boolean enableColorChange) {
        this.enableColorChange = enableColorChange;
    }
    
    public boolean isAutoUpdateNewsEnabled()
    {
        return this.isAutoUpdateNewsEnabled;
    }

    public boolean isChatEnabled() {
        return this.isChatEnabled;
    }

    public boolean isChatSoundNotificationEnabled() {
        return this.isChatSoundNotificationEnabled;
    }

    public boolean isChatFlashNotificationEnabled() {
        return this.isChatFlashNotificationEnabled;
    }
    
    public void setAutoUpdateNewsEnabled(boolean isAutoUpdateNewsEnabled)
    {
        this.isAutoUpdateNewsEnabled = isAutoUpdateNewsEnabled;
    }

    public void setChatEnabled(boolean isChatEnabled) {
        this.isChatEnabled = isChatEnabled;
    }

    public void setChatFlashNotificationEnabled(boolean isChatFlashNotificationEnabled) {
        this.isChatFlashNotificationEnabled = isChatFlashNotificationEnabled;
    }

    public void setChatSoundNotificationEnabled(boolean isChatSoundNotificationEnabled) {
        this.isChatSoundNotificationEnabled = isChatSoundNotificationEnabled;
    }

    public double getExpectedProfitPercentage() {
        return expectedProfitPercentage;
    }
    
    public void setExpectedProfitPercentage(double expectedProfitPercentage) {
        this.expectedProfitPercentage = expectedProfitPercentage;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    /**
     * @return the historyDuration
     */
    public int getHistoryDuration() {
        return historyDuration;
    }

    /**
     * @param historyDuration the historyDuration to set
     */
    public void setHistoryDuration(int historyDuration) {
        this.historyDuration = historyDuration;
    }

    /**
     * @return the chatUsername
     */
    public String getChatUsername() {
        return chatUsername;
    }

    /**
     * @param chatUsername the chatUsername to set
     */
    public void setChatUsername(String chatUsername) {
        this.chatUsername = chatUsername;
    }

    /**
     * @return the chatSystemMessageColor
     */
    public Color getChatSystemMessageColor() {
        return chatSystemMessageColor;
    }

    /**
     * @param chatSystemMessageColor the chatSystemMessageColor to set
     */
    public void setChatSystemMessageColor(Color chatSystemMessageColor) {
        this.chatSystemMessageColor = chatSystemMessageColor;
    }

    /**
     * @return the chatOwnMessageColor
     */
    public Color getChatOwnMessageColor() {
        return chatOwnMessageColor;
    }

    /**
     * @param chatOwnMessageColor the chatOwnMessageColor to set
     */
    public void setChatOwnMessageColor(Color chatOwnMessageColor) {
        this.chatOwnMessageColor = chatOwnMessageColor;
    }

    /**
     * @return the chatOtherMessageColor
     */
    public Color getChatOtherMessageColor() {
        return chatOtherMessageColor;
    }

    /**
     * @param chatOtherMessageColor the chatOtherMessageColor to set
     */
    public void setChatOtherMessageColor(Color chatOtherMessageColor) {
        this.chatOtherMessageColor = chatOtherMessageColor;
    }

    /**
     * @return the chatPassword
     */
    public String getChatPassword() {
        return chatPassword;
    }

    /**
     * @param chatPassword the chatPassword to set
     */
    public void setChatPassword(String chatPassword) {
        this.chatPassword = chatPassword;
    }

    /**
     * @return the enableColorAlert
     */
    public boolean isEnableColorAlert() {
        return enableColorAlert;
    }

    /**
     * @param enableColorAlert the enableColorAlert to set
     */
    public void setEnableColorAlert(boolean enableColorAlert) {
        this.enableColorAlert = enableColorAlert;
    }

    /**
     * @return the proxyAuthPassword
     */
    public String getProxyAuthPassword() {
        return proxyAuthPassword;
    }

    /**
     * @param proxyAuthPassword the proxyAuthPassword to set
     */
    public void setProxyAuthPassword(String proxyAuthPassword) {
        this.proxyAuthPassword = proxyAuthPassword;
        // Update credentials as well.
        setCredentials(new NTCredentials(this.proxyAuthUserName, Utils.decrypt(this.proxyAuthPassword), "", ""));
    }

    /**
     * @return the proxyAuthUserName
     */
    public String getProxyAuthUserName() {
        return proxyAuthUserName;
    }

    /**
     * @param proxyAuthUserName the proxyAuthUserName to set
     */
    public void setProxyAuthUserName(String proxyAuthUserName) {
        this.proxyAuthUserName = proxyAuthUserName;
        // Update credentials as well.
        setCredentials(new NTCredentials(this.proxyAuthUserName, Utils.decrypt(this.proxyAuthPassword), "", ""));
    }

    /**
     * @return the isProxyAuthEnabled
     */
    public boolean isProxyAuthEnabled() {
        return isProxyAuthEnabled;
    }

    /**
     * @param isProxyAuthEnabled the isProxyAuthEnabled to set
     */
    public void setIsProxyAuthEnabled(boolean isProxyAuthEnabled) {
        this.isProxyAuthEnabled = isProxyAuthEnabled;
    }

    /**
     * @return the credentials
     */
    public Credentials getCredentials() {
        return credentials;
    }

    /**
     * @param credentials the credentials to set
     */
    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    /**
     * @return the lastFileIODirectory
     */
    public String getLastFileIODirectory() {
        return lastFileIODirectory;
    }

    /**
     * @param lastFileIODirectory the lastFileIODirectory to set
     */
    public void setLastFileIODirectory(String lastFileIODirectory) {
        this.lastFileIODirectory = lastFileIODirectory;
    }

    /**
     * @return the lastFileNameExtensionDescription
     */
    public String getLastSavedFileNameExtensionDescription() {
        return lastFileNameExtensionDescription;
    }

    /**
     * @param lastFileNameExtensionDescription the lastFileNameExtensionDescription to set
     */
    public void setLastFileNameExtensionDescription(String lastFileNameExtensionDescription) {
        this.lastFileNameExtensionDescription = lastFileNameExtensionDescription;
    }

    /**
     * @return the lastSelectedPageIndex
     */
    public int getLastSelectedPageIndex() {
        return lastSelectedPageIndex;
    }

    /**
     * @param lastSelectedPageIndex the lastSelectedPageIndex to set
     */
    public void setLastSelectedPageIndex(int lastSelectedPageIndex) {
        this.lastSelectedPageIndex = lastSelectedPageIndex;
    }

    /**
     * @return the googleCalendarUsername
     */
    public String getGoogleCalendarUsername() {
        return googleCalendarUsername;
    }

    /**
     * @param googleCalendarUsername the googleCalendarUsername to set
     */
    public void setGoogleCalendarUsername(String googleCalendarUsername) {
        this.googleCalendarUsername = googleCalendarUsername;
    }

    /**
     * @return the googleCalendarPassword
     */
    public String getGoogleCalendarPassword() {
        return googleCalendarPassword;
    }

    /**
     * @param googleCalendarPassword the googleCalendarPassword to set
     */
    public void setGoogleCalendarPassword(String googleCalendarPassword) {
        this.googleCalendarPassword = googleCalendarPassword;
    }

    /**
     * @return the SMSEnabled
     */
    public boolean isSMSEnabled() {
        return SMSEnabled;
    }

    /**
     * @param SMSEnabled the SMSEnabled to set
     */
    public void setSMSEnabled(boolean SMSEnabled) {
        this.SMSEnabled = SMSEnabled;
    }

    public Class addPrimaryStockServerFactoryClass(Country country, Class c) {
        return primaryStockServerFactoryClasses.put(country, c);
    }

    public Class getPrimaryStockServerFactoryClass(Country country) {
        return primaryStockServerFactoryClasses.get(country);
    }

    /**
     * @return the portfolioName
     */
    public String getPortfolioName() {
        return portfolioName;
    }

    /**
     * @param portfolioName the portfolioName to set
     */
    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    /**
     * @return the watchlistName
     */
    public String getWatchlistName() {
        return watchlistName;
    }

    /**
     * @param watchlistName the watchlistName to set
     */
    public void setWatchlistName(String watchlistName) {
        this.watchlistName = watchlistName;
    }

    /**
     * @return the maxSMSPerDay
     */
    public int getMaxSMSPerDay() {
        return maxSMSPerDay;
    }

    /**
     * @param maxSMSPerDay the maxSMSPerDay to set
     */
    public void setMaxSMSPerDay(int maxSMSPerDay) {
        this.maxSMSPerDay = maxSMSPerDay;
    }

    /**
     * @return the newsID
     */
    public String getNewsID() {
        return newsID;
    }

    /**
     * @param newsID the newsID to set
     */
    public void setNewsID(String newsID) {
        this.newsID = newsID;
    }

    /**
     * @return the penceToPoundConversionEnabled
     */
    public boolean isPenceToPoundConversionEnabled() {
        return penceToPoundConversionEnabled;
    }

    /**
     * @param penceToPoundConversionEnabled the penceToPoundConversionEnabled to set
     */
    public void setPenceToPoundConversionEnabled(boolean penceToPoundConversionEnabled) {
        this.penceToPoundConversionEnabled = penceToPoundConversionEnabled;
    }

    /**
     * @return the rememberGoogleAccountEnabled
     */
    public boolean isRememberGoogleAccountEnabled() {
        return rememberGoogleAccountEnabled;
    }

    /**
     * @param rememberGoogleAccountEnabled the rememberGoogleAccountEnabled to set
     */
    public void setRememberGoogleAccountEnabled(boolean rememberGoogleAccountEnabled) {
        this.rememberGoogleAccountEnabled = rememberGoogleAccountEnabled;
    }

    /**
     * @return the googleUsername
     */
    public String getGoogleUsername() {
        return googleUsername;
    }

    /**
     * @param googleUsername the googleUsername to set
     */
    public void setGoogleUsername(String googleUsername) {
        this.googleUsername = googleUsername;
    }

    /**
     * @return the googlePassword
     */
    public String getGooglePassword() {
        return googlePassword;
    }

    /**
     * @param googlePassword the googlePassword to set
     */
    public void setGooglePassword(String googlePassword) {
        this.googlePassword = googlePassword;
    }

    /**
     * @return the soundEnabled
     */
    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    /**
     * @param soundEnabled the soundEnabled to set
     */
    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }
}
