/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author KENKA
 */
public class DashboardController implements Initializable {

    @FXML
    private MenuBar dashboardMenubar;
    @FXML
    private Menu executiveMenu;
    @FXML
    private Menu exeReportsMenu;
    @FXML
    private Menu exeApprovalMenu;
    @FXML
    private Menu medicalDeptMenu;
    @FXML
    private Menu playerMenu;
    @FXML
    private Menu competitionOrganizationDeptMenu;
    @FXML
    private Menu financialDeptMenu;
    @FXML
    private Menu mediaDeptMenu;
    @FXML
    private Menu coachMenu;
    @FXML
    private Menu developementDeptMenu;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
   public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        root.setTop(dashboardMenubar);

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Dashboard");
        primaryStage.show();
    }

    @FXML
    private void playerRegistrationButtonOnClicked(ActionEvent event) throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("Player Registration.fxml"));
        Parent playerRegistrationPane = loader.load();
        Scene playerRegistrationScene = new Scene(playerRegistrationPane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(playerRegistrationScene);
        stage.setTitle("Player Registration");
    }

    @FXML
    private void matchScheduleButtonOnClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Match Schedule.fxml"));
        Parent matchSchedulePane = loader.load();
        Scene matchScheduleScene = new Scene(matchSchedulePane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(matchScheduleScene);
        stage.setTitle("Match Schedule");
    }

    @FXML
    private void decisionMakingButtonOnClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Decision Making.fxml"));
        Parent decisionMakingPane = loader.load();
        Scene decisionMakingScene = new Scene(decisionMakingPane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(decisionMakingScene);
        stage.setTitle("Decision Making");
    }

    @FXML
    private void communicateButtonOnClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Communicate.fxml"));
        Parent communicatePane = loader.load();
        Scene communicateScene = new Scene(communicatePane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(communicateScene);
        stage.setTitle("Communicate");
    }

    @FXML
    private void financialManagementButtonOnClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Financial Management.fxml"));
        Parent financialManagementPane = loader.load();
        Scene financialManagementScene = new Scene(financialManagementPane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(financialManagementScene);
        stage.setTitle("Financial Management");
    }

    @FXML
    private void legalAffairsButtonOnClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Legal Affairs.fxml"));
        Parent legalAffairsPane = loader.load();
        Scene legalAffairsScene = new Scene(legalAffairsPane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(legalAffairsScene);
        stage.setTitle("Legal Affairs");
    }
    
    @FXML
    private void transferButtonOnClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Transfer.fxml"));
        Parent transferPane = loader.load();
        Scene transferScene = new Scene(transferPane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(transferScene);
        stage.setTitle("Transfer");
    }

    @FXML
    private void contractsButtonOnClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Contract.fxml"));
        Parent contractPane = loader.load();
        Scene contractScene = new Scene(contractPane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(contractScene);
        stage.setTitle("Contract");
    }

    @FXML
    private void eventManagementButtonOnClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Event Management.fxml"));
        Parent eventManagementPane = loader.load();
        Scene eventManagementScene = new Scene(eventManagementPane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(eventManagementScene);
        stage.setTitle("Event Management");
    }

    @FXML
    private void disciplinaryMattersButtonOnClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Disciplinary Matters.fxml"));
        Parent disciplinaryMattersPane = loader.load();
        Scene disciplinaryMattersScene = new Scene(disciplinaryMattersPane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(disciplinaryMattersScene);
        stage.setTitle("Disciplinary Matters");
    }

    @FXML
    private void medPlayerRegistrationButtonOnClicked(ActionEvent event) throws IOException {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Medical New Player Registration.fxml"));
        Parent medicalNewPlayerRegistrationPane = loader.load();
        Scene medicalNewPlayerRegistrationScene = new Scene(medicalNewPlayerRegistrationPane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(medicalNewPlayerRegistrationScene);
        stage.setTitle("Medical Player Registration");
    }

    @FXML
    private void medHistoryRecordButtonOnClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Medical History Record.fxml"));
        Parent medicalHistoryRecordPane = loader.load();
        Scene medicalHistoryRecordScene = new Scene(medicalHistoryRecordPane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(medicalHistoryRecordScene);
        stage.setTitle("Medical History Record");
    }

    @FXML
    private void bookAppointmentButtonOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Book Appointment.fxml"));
        Parent bookAppointmentPane = loader.load();
        Scene bookAppointmentScene = new Scene(bookAppointmentPane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(bookAppointmentScene);
        stage.setTitle("Book Appointment");
    }

    @FXML
    private void injuryLogButtonOnClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Injury Log.fxml"));
        Parent injuryLogPane = loader.load();
        Scene injuryLogScene = new Scene(injuryLogPane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(injuryLogScene);
        stage.setTitle("Injury Log");
    }

    @FXML
    private void prescribeMedicineButtonOnClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Prescribe Medicine.fxml"));
        Parent prescribeMedicinePane = loader.load();
        Scene prescribeMedicineScene = new Scene(prescribeMedicinePane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(prescribeMedicineScene);
        stage.setTitle("Prescribe Medicine");
    }

    @FXML
    private void healthControlGuidelineButtonOnClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Health Control Guidelines.fxml"));
        Parent healthControlGuidelinesPane = loader.load();
        Scene healthControlGuidelinesScene = new Scene(healthControlGuidelinesPane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(healthControlGuidelinesScene);
        stage.setTitle("Health Control Guideline");
    }

    @FXML
    private void returnToPlayButtonOnClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Return to Play Assessment.fxml"));
        Parent returntoPlayAssessmentPane = loader.load();
        Scene returntoPlayAssessmentScene = new Scene(returntoPlayAssessmentPane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(returntoPlayAssessmentScene);
        stage.setTitle("Player Return-to-Play Assessment");
    }

    @FXML
    private void inventoryManagementButtonOnClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Inventory Management.fxml"));
        Parent inventoryManagementPane = loader.load();
        Scene inventoryManagementScene = new Scene(inventoryManagementPane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(inventoryManagementScene);
        stage.setTitle("Inventory Management");
    }

    @FXML
    private void playerMatchScheduleButtonOnClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLMatchSchedule.fxml"));
        Parent matchSchedulePane = loader.load();
        Scene matchScheduleScene = new Scene(matchSchedulePane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(matchScheduleScene);
        stage.setTitle("Match Schedule");


    }

    @FXML
    private void playerPracticeTimeScheduleButtonOnClicked(ActionEvent event) throws IOException {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLPracticeSchedule.fxml"));
        Parent practiceTimeSchedulePane = loader.load();
        Scene practiceTimeScheduleScene = new Scene(practiceTimeSchedulePane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(practiceTimeScheduleScene);
        stage.setTitle("Practice Time Schedule");

    }

    @FXML
    private void playerSalaryStatusButtonOnClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLSalaryStatus.fxml"));
        Parent salaryStatusPane = loader.load();
        Scene salaryStatusScene = new Scene(salaryStatusPane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(salaryStatusScene);
        stage.setTitle("Salary Status");
    }

    @FXML
    private void playerLeaveApplicationButtonOnClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLLeaveApplication.fxml"));
        Parent leaveApplicationPane = loader.load();
        Scene leaveApplicationScene = new Scene(leaveApplicationPane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(leaveApplicationScene);
        stage.setTitle("Leave Application");
    }

    @FXML
    private void playerViewFeedbackButtonOnClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLViewFeedback.fxml"));
        Parent viewFeedbackPane = loader.load();
        Scene viewFeedbackScene = new Scene(viewFeedbackPane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(viewFeedbackScene);
        stage.setTitle("View Feedback");
    }

    @FXML
    private void playerNoticeBoardButtonOnClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLNoticeBoard.fxml"));
        Parent noticeBoardPane = loader.load();
        Scene noticeBoardScene = new Scene(noticeBoardPane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(noticeBoardScene);
        stage.setTitle("Notice Board");
    }

    @FXML
    private void playerPressandMediaConferenceButtonOnClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLPressMediaConference.fxml"));
        Parent pressAndMediaConferencePane = loader.load();
        Scene pressAndMediaConferenceScene = new Scene(pressAndMediaConferencePane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(pressAndMediaConferenceScene);
        stage.setTitle("Press and Media Conference");

    }

    @FXML
    private void playerAppointmentForMedicalCheckupButtonOnClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLAppointmentMed.fxml"));
        Parent appointmentForMedicalCheckupPane = loader.load();
        Scene appointmentForMedicalCheckupScene = new Scene(appointmentForMedicalCheckupPane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(appointmentForMedicalCheckupScene);
        stage.setTitle("Appointment for Medical Checkup");
    }

    @FXML
    private void comMatchDetailsButtonOnClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLMatchDetails.fxml"));
        Parent matchDetailsPane = loader.load();
        Scene matchDetailsScene = new Scene(matchDetailsPane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(matchDetailsScene);
        stage.setTitle("Match Details");
    }

    @FXML
    private void comTicketPricingButtonOnClicked(ActionEvent event) throws IOException {        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TicketPricing.fxml"));
        Parent ticketPricingPane = loader.load();
        Scene ticketPricingScene = new Scene(ticketPricingPane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(ticketPricingScene);
        stage.setTitle("Ticket Pricing");

    }

    @FXML
    private void comTickedSoldButtonOnClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLTicketSold.fxml"));
        Parent ticketSoldPane = loader.load();
        Scene ticketSoldScene = new Scene(ticketSoldPane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(ticketSoldScene);
        stage.setTitle("Ticket Sold");
    }

    @FXML
    private void comPlayerListButtonOnClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLPlayerList.fxml"));
        Parent playerListPane = loader.load();
        Scene playerListScene = new Scene(playerListPane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(playerListScene);
        stage.setTitle("Player List");

    }

    @FXML
    private void comApprovalforBudgetButtonOnClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLBudgetApproval.fxml"));
        Parent approvalForBudgetPane = loader.load();
        Scene approvalForBudgetScene = new Scene(approvalForBudgetPane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(approvalForBudgetScene);
        stage.setTitle("Approval for Budget");
    }

    @FXML
    private void comNotificationofUpcomingMatchButtonOnClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLNotificationAboutMatch.fxml"));
        Parent notificationAboutTheUpcomingMatchesPane = loader.load();
        Scene notificationAboutTheUpcomingMatchesScene = new Scene(notificationAboutTheUpcomingMatchesPane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(notificationAboutTheUpcomingMatchesScene);
        stage.setTitle("Notificationt about the upcoming matches");

    }

    @FXML
    private void comRecandManageVolunteersButtonOnClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLRecruiteManageVolunteers.fxml"));
        Parent recruiteAndManageVolunteersPane = loader.load();
        Scene recruiteAndManageVolunteersScene = new Scene(recruiteAndManageVolunteersPane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(recruiteAndManageVolunteersScene);
        stage.setTitle("Recruite and Manage Volunteers"); 
    }

    @FXML
    private void comLeaveApplicationButtonOnClicked(ActionEvent event) throws IOException {FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLLeaveApplication.fxml"));
        Parent leaveApplicationPane = loader.load();
        Scene leaveApplicationScene = new Scene(leaveApplicationPane);
        Stage stage = (Stage) dashboardMenubar.getScene().getWindow();
        stage.setScene(leaveApplicationScene);
        stage.setTitle("Leave Application");
        
    }

    @FXML
    private void employeeSalaryButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void employeeBonusButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void decideBudgetButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void monthlyReportButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void tickedSellsReportButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void finLeaveApplicationButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void finNoticeBoardButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void finReceiveSalaryButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void sendNotificationButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void messageInterviewerButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void socialMediaButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void mediaNoticeBoardButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void mediaGetNotificationButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void mediaDailyUpdatesButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void mediaLeaveApplicationButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void mediaReceiveSalaryButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void logoutButtonOnClicked(ActionEvent event) {
    }

    
}
