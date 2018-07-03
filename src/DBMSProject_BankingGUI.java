package dbmsproject_bankinggui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class DBMSProject_BankingGUI extends javax.swing.JFrame 
{
    Connection myconObj=null;
    Statement mystatObj=null;
    ResultSet myresObj=null;
    ResultSetMetaData mymetaObj=null;
    public static long N;
    public static long N2;
    public static long count;
    public static boolean check=false;
    public static String cmno;
    public static String lstat="month";
    public static boolean chk=false;
    
    public DBMSProject_BankingGUI() 
    {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        login();
        //selectall();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        last = new javax.swing.JButton();
        loan = new javax.swing.JButton();
        transfer = new javax.swing.JButton();
        statement = new javax.swing.JButton();
        checkbook = new javax.swing.JButton();
        balcheck = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Print = new javax.swing.JMenuItem();
        Close = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Banking Desktop Application");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        last.setBackground(new java.awt.Color(204, 204, 255));
        last.setText("Retreive Last N Transactions");
        last.setToolTipText("Retrieve details of yout last 'N' transactions.");
        last.setPreferredSize(new java.awt.Dimension(170, 30));
        last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastActionPerformed(evt);
            }
        });

        loan.setBackground(new java.awt.Color(204, 204, 255));
        loan.setText("Apply For A Loan");
        loan.setToolTipText("Request for a Loan.");
        loan.setPreferredSize(new java.awt.Dimension(170, 30));
        loan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanActionPerformed(evt);
            }
        });

        transfer.setBackground(new java.awt.Color(204, 204, 255));
        transfer.setText("Transfer Funds");
        transfer.setToolTipText("Transfer funds from one of your accounts to any other account.");
        transfer.setPreferredSize(new java.awt.Dimension(170, 30));
        transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferActionPerformed(evt);
            }
        });

        statement.setBackground(new java.awt.Color(204, 204, 255));
        statement.setText("View Monthly Statement");
        statement.setToolTipText("Retrieve details of all your transactions in the last month.");
        statement.setPreferredSize(new java.awt.Dimension(170, 30));
        statement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statementActionPerformed(evt);
            }
        });

        checkbook.setBackground(new java.awt.Color(204, 204, 255));
        checkbook.setText("Request For A Checkbook");
        checkbook.setToolTipText("Apply to receive a checkbook.");
        checkbook.setPreferredSize(new java.awt.Dimension(170, 30));
        checkbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbookActionPerformed(evt);
            }
        });

        balcheck.setBackground(new java.awt.Color(204, 204, 255));
        balcheck.setText("Balance Enquiry");
        balcheck.setToolTipText("Check your Balance on any of your accounts.");
        balcheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balcheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(statement, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(last, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkbook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(balcheck, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transfer, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(last, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transfer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(balcheck, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(statement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(checkbook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Transaction ID", "Date", "Month", "Year", "Account No.", "Amount", "Previous Balance", "New Balance", "Type", "Mode"
            }
        ));
        jScrollPane1.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setPreferredWidth(100);
            Table.getColumnModel().getColumn(1).setPreferredWidth(35);
            Table.getColumnModel().getColumn(2).setPreferredWidth(35);
            Table.getColumnModel().getColumn(3).setPreferredWidth(35);
            Table.getColumnModel().getColumn(4).setPreferredWidth(100);
            Table.getColumnModel().getColumn(5).setPreferredWidth(100);
            Table.getColumnModel().getColumn(6).setPreferredWidth(100);
            Table.getColumnModel().getColumn(7).setPreferredWidth(100);
            Table.getColumnModel().getColumn(8).setPreferredWidth(50);
            Table.getColumnModel().getColumn(9).setPreferredWidth(50);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        Print.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        Print.setText("Print");
        Print.setToolTipText("Print the Contents of the Table");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });
        jMenu1.add(Print);

        Close.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        Close.setText("Close");
        Close.setToolTipText("Close the Application");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        jMenu1.add(Close);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void login()
    {
        Login dbox = new Login(this,true);
        dbox.setLocationRelativeTo(null);
        dbox.setVisible(true);
    }
    public void selectall()
    {
            try
            {
                myconObj=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbmsproject_banking","root","whocares");
                mystatObj=myconObj.createStatement();
                myresObj=mystatObj.executeQuery("select * from dbmsproject_banking.Transactions");
                mymetaObj=myresObj.getMetaData();
                Table.setModel(DbUtils.resultSetToTableModel(myresObj));
                if (Table.getColumnModel().getColumnCount() > 0) {
                Table.getColumnModel().getColumn(0).setPreferredWidth(100);
                Table.getColumnModel().getColumn(0).setHeaderValue("Transaction ID");
                Table.getColumnModel().getColumn(1).setPreferredWidth(40);
                Table.getColumnModel().getColumn(1).setHeaderValue("Date");
                Table.getColumnModel().getColumn(2).setPreferredWidth(45);
                Table.getColumnModel().getColumn(2).setHeaderValue("Month");
                Table.getColumnModel().getColumn(3).setPreferredWidth(40);
                Table.getColumnModel().getColumn(3).setHeaderValue("Year");
                Table.getColumnModel().getColumn(4).setPreferredWidth(100);
                Table.getColumnModel().getColumn(4).setHeaderValue("Account No.");
                Table.getColumnModel().getColumn(5).setPreferredWidth(100);
                Table.getColumnModel().getColumn(5).setHeaderValue("Amount");
                Table.getColumnModel().getColumn(6).setPreferredWidth(100);
                Table.getColumnModel().getColumn(6).setHeaderValue("Prev. Balance");
                Table.getColumnModel().getColumn(7).setPreferredWidth(100);
                Table.getColumnModel().getColumn(7).setHeaderValue("New Balance");
                Table.getColumnModel().getColumn(8).setPreferredWidth(70);
                Table.getColumnModel().getColumn(8).setHeaderValue("Type");
                Table.getColumnModel().getColumn(9).setPreferredWidth(70);
                Table.getColumnModel().getColumn(9).setHeaderValue("Mode");
                }
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
    }
    
    private void statementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statementActionPerformed
        // TODO add your handling code here:
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int tm=localDate.getMonthValue();
        String mon=Integer.toString(tm);
        try
            {
                myconObj=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbmsproject_banking","root","whocares");
                mystatObj=myconObj.createStatement();
                myresObj=mystatObj.executeQuery("select * from dbmsproject_banking.Transactions where ano in (select ano from accounts where cno='"+cmno+"') and tm="+mon);
                mymetaObj=myresObj.getMetaData();
                Table.setModel(DbUtils.resultSetToTableModel(myresObj));
                if (Table.getColumnModel().getColumnCount() > 0) {
                Table.getColumnModel().getColumn(0).setPreferredWidth(100);
                Table.getColumnModel().getColumn(0).setHeaderValue("Transaction ID");
                Table.getColumnModel().getColumn(1).setPreferredWidth(40);
                Table.getColumnModel().getColumn(1).setHeaderValue("Date");
                Table.getColumnModel().getColumn(2).setPreferredWidth(45);
                Table.getColumnModel().getColumn(2).setHeaderValue("Month");
                Table.getColumnModel().getColumn(3).setPreferredWidth(40);
                Table.getColumnModel().getColumn(3).setHeaderValue("Year");
                Table.getColumnModel().getColumn(4).setPreferredWidth(100);
                Table.getColumnModel().getColumn(4).setHeaderValue("Account No.");
                Table.getColumnModel().getColumn(5).setPreferredWidth(100);
                Table.getColumnModel().getColumn(5).setHeaderValue("Amount");
                Table.getColumnModel().getColumn(6).setPreferredWidth(100);
                Table.getColumnModel().getColumn(6).setHeaderValue("Prev. Balance");
                Table.getColumnModel().getColumn(7).setPreferredWidth(100);
                Table.getColumnModel().getColumn(7).setHeaderValue("New Balance");
                Table.getColumnModel().getColumn(8).setPreferredWidth(70);
                Table.getColumnModel().getColumn(8).setHeaderValue("Type");
                Table.getColumnModel().getColumn(9).setPreferredWidth(70);
                Table.getColumnModel().getColumn(9).setHeaderValue("Mode");
                lstat="month";
                }
            }
            catch(SQLException e)
            {
                    e.printStackTrace();
            }
    }//GEN-LAST:event_statementActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_CloseActionPerformed

    private void balcheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balcheckActionPerformed
        // TODO add your handling code here:
        BalCheck dialogbox = new BalCheck(this,true);
        dialogbox.setLocationRelativeTo(balcheck);
        dialogbox.setVisible(true);
    }//GEN-LAST:event_balcheckActionPerformed

    private void transferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferActionPerformed
        // TODO add your handling code here:
        Transfer dialogbox = new Transfer(this,true);
        dialogbox.setLocationRelativeTo(transfer);
        dialogbox.setVisible(true);
    }//GEN-LAST:event_transferActionPerformed

    private void checkbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbookActionPerformed
        // TODO add your handling code here:
        Checkbook dbox = new Checkbook(this,true);
        dbox.setLocationRelativeTo(checkbook);
        dbox.setVisible(true);
    }//GEN-LAST:event_checkbookActionPerformed

    private void loanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanActionPerformed
        // TODO add your handling code here:
        Loan dbox = new Loan(this,true);
        dbox.setLocationRelativeTo(loan);
        dbox.setVisible(true);
    }//GEN-LAST:event_loanActionPerformed

    private void lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastActionPerformed
        // TODO add your handling code here:
        try
        {
            myconObj=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbmsproject_banking","root","whocares");
            mystatObj=myconObj.createStatement();
            myresObj=mystatObj.executeQuery("select count(*) from dbmsproject_banking.Transactions where ano in (select ano from accounts where cno='"+cmno+"')");
            myresObj.next();
            count=myresObj.getLong(1);
            //System.out.println(count);
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        chk=false;
        check=false;
        lastn db = new lastn(this,true);
        db.setLocationRelativeTo(last);
        db.setVisible(true);
        String n=Long.toString(N);
        if(!check)
        N2=N;
        System.out.println(chk);
        if(!check&&chk)
        {
            try
            {
                myconObj=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbmsproject_banking","root","whocares");
                mystatObj=myconObj.createStatement();
                myresObj=mystatObj.executeQuery("select * from (select * from dbmsproject_banking.Transactions where ano in (select ano from accounts where cno='"+cmno+"') order by ty desc,tm desc,td desc limit "+n+") sub order by ty,tm,td;");
                mymetaObj=myresObj.getMetaData();
                Table.setModel(DbUtils.resultSetToTableModel(myresObj));
                if (Table.getColumnModel().getColumnCount() > 0) {
                Table.getColumnModel().getColumn(0).setPreferredWidth(100);
                Table.getColumnModel().getColumn(0).setHeaderValue("Transaction ID");
                Table.getColumnModel().getColumn(1).setPreferredWidth(40);
                Table.getColumnModel().getColumn(1).setHeaderValue("Date");
                Table.getColumnModel().getColumn(2).setPreferredWidth(45);
                Table.getColumnModel().getColumn(2).setHeaderValue("Month");
                Table.getColumnModel().getColumn(3).setPreferredWidth(40);
                Table.getColumnModel().getColumn(3).setHeaderValue("Year");
                Table.getColumnModel().getColumn(4).setPreferredWidth(100);
                Table.getColumnModel().getColumn(4).setHeaderValue("Account No.");
                Table.getColumnModel().getColumn(5).setPreferredWidth(100);
                Table.getColumnModel().getColumn(5).setHeaderValue("Amount");
                Table.getColumnModel().getColumn(6).setPreferredWidth(100);
                Table.getColumnModel().getColumn(6).setHeaderValue("Prev. Balance");
                Table.getColumnModel().getColumn(7).setPreferredWidth(100);
                Table.getColumnModel().getColumn(7).setHeaderValue("New Balance");
                Table.getColumnModel().getColumn(8).setPreferredWidth(70);
                Table.getColumnModel().getColumn(8).setHeaderValue("Type");
                Table.getColumnModel().getColumn(9).setPreferredWidth(70);
                Table.getColumnModel().getColumn(9).setHeaderValue("Mode");
                lstat="last";
                }
            }
            catch(SQLException e)
            {
                    e.printStackTrace();
            }
        }
    }//GEN-LAST:event_lastActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        // TODO add your handling code here:
        MessageFormat header,footer; 
        try 
        {
            header = new MessageFormat("Monthly Statement");
            footer = new MessageFormat("Page {0,number}");
            if(lstat.equalsIgnoreCase("last"))
            {
                header = new MessageFormat("Last "+N2+" Transactions");
                footer = new MessageFormat("Page {0,number}");
            }
            //table.print(JTable.PrintMode.FIT_WIDTH, header, null);
            Table.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } 
        catch (java.awt.print.PrinterException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_PrintActionPerformed
   public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DBMSProject_BankingGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Close;
    private javax.swing.JMenuItem Print;
    private javax.swing.JTable Table;
    private javax.swing.JButton balcheck;
    private javax.swing.JButton checkbook;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton last;
    private javax.swing.JButton loan;
    private javax.swing.JButton statement;
    private javax.swing.JButton transfer;
    // End of variables declaration//GEN-END:variables
}