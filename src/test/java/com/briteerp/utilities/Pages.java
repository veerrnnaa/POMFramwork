package com.briteerp.utilities;

import com.briteerp.pages.crm.AmountPage;
import com.briteerp.pages.crm.PricePage;
import com.briteerp.pages.login_navigation.LoginPage;

public class Pages {
    private LoginPage loginPage;
    private PricePage pricePage;
    private AmountPage amountPage;
    //        private CalendarEventsPage calendarEventsPage;
//        private DashboardPage dashboardPage;
//        private ManageDashboards manageDashboards;


//    public LoginPage getLoginPage() {
//        return loginPage;
//    }
public Pages(){
            return;
        }

    public LoginPage loginPage() {
            if (loginPage == null) {
                loginPage = new LoginPage();
            }
            return loginPage;
        }
    public PricePage pricePage() {
        if (pricePage == null)  {
            pricePage = new PricePage();
        }
        return pricePage;
    }
    public AmountPage amountPage() {
        if (amountPage == null)  {
            amountPage = new AmountPage();
        }
        return amountPage;
    }





        //        public CalendarEventsPage calendarEventsPage() {
//            if (calendarEventsPage == null) {
//                calendarEventsPage = new CalendarEventsPage();
//            }
//            return calendarEventsPage;
//        }
//
//        public DashboardPage dashboardPage() {
//            if (dashboardPage == null) {
//                dashboardPage = new DashboardPage();
//            }
//            return dashboardPage;
//        }
//
//        public ManageDashboards manageDashboards() {
//            if (manageDashboards == null) {
//                manageDashboards = new ManageDashboards();
//            }
//            return manageDashboards;
        }







