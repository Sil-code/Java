package com.java1234.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainFrm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JDesktopPane table=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrm frame = new MainFrm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrm() {
		setTitle("\u56FE\u4E66\u7BA1\u7406\u7CFB\u7EDF-\u4E3B\u9875");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 530);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu_2 = new JMenu("\u6587\u4EF6");
		mnNewMenu_2.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/about.png")));
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_6 = new JMenu("\u6253\u5F00\u56FE\u4E66");
		mnNewMenu_2.add(mnNewMenu_6);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("\u65B0\u5EFA");
		mnNewMenu_6.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("\u4ECE\u6587\u4EF6\u6253\u5F00...");
		mnNewMenu_6.add(mntmNewMenuItem_7);
		
		JMenu mnNewMenu_8 = new JMenu("\u5BFC\u51FA\u56FE\u4E66");
		mnNewMenu_2.add(mnNewMenu_8);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("\u53E6\u5B58\u4E3A...");
		mnNewMenu_8.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\u6CE8\u9500");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			/**
			 * 退出图书管理系统
			 */
			public void actionPerformed(ActionEvent e) {
				int result=JOptionPane.showConfirmDialog(null, "是否，退出图书管理系统？（Y/N）");
				System.out.println(result);
				if(result==0) {
					dispose();
				}
			}
		});
		mntmNewMenuItem_1.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/delete.png")));
		mnNewMenu_2.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_3 = new JMenu("\u4E66\u5E93\u89C6\u56FE");
		mnNewMenu_3.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/search.png")));
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u6D4F\u89C8\u5168\u4F53\u4E66\u5E93");
		mntmNewMenuItem.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/search.png")));
		mnNewMenu_3.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_12 = new JMenu("\u6309\u7C7B\u522B\u6D4F\u89C8");
		mnNewMenu_12.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/search.png")));
		mnNewMenu_3.add(mnNewMenu_12);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("\u519B\u4E8B\u5B66");
		mntmNewMenuItem_8.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/bookManager.png")));
		mnNewMenu_12.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("\u533B\u5B66");
		mntmNewMenuItem_9.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/bookManager.png")));
		mnNewMenu_12.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("\u519C\u5B66");
		mntmNewMenuItem_10.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/bookManager.png")));
		mnNewMenu_12.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("\u5DE5\u5B66");
		mntmNewMenuItem_11.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/bookManager.png")));
		mnNewMenu_12.add(mntmNewMenuItem_11);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("\u7406\u5B66");
		mntmNewMenuItem_12.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/bookManager.png")));
		mnNewMenu_12.add(mntmNewMenuItem_12);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("\u7BA1\u7406\u5B66");
		mntmNewMenuItem_13.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/bookManager.png")));
		mnNewMenu_12.add(mntmNewMenuItem_13);
		
		JMenuItem mntmNewMenuItem_14 = new JMenuItem("\u7ECF\u6D4E\u5B66");
		mntmNewMenuItem_14.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/bookManager.png")));
		mnNewMenu_12.add(mntmNewMenuItem_14);
		
		JMenuItem mntmNewMenuItem_15 = new JMenuItem("\u6CD5\u5B66");
		mntmNewMenuItem_15.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/bookManager.png")));
		mnNewMenu_12.add(mntmNewMenuItem_15);
		
		JMenuItem mntmNewMenuItem_16 = new JMenuItem("\u6559\u80B2\u5B66");
		mntmNewMenuItem_16.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/bookManager.png")));
		mnNewMenu_12.add(mntmNewMenuItem_16);
		
		JMenuItem mntmNewMenuItem_17 = new JMenuItem("\u827A\u672F\u5B66");
		mntmNewMenuItem_17.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/bookManager.png")));
		mnNewMenu_12.add(mntmNewMenuItem_17);
		
		JMenuItem mntmNewMenuItem_18 = new JMenuItem("\u5386\u53F2\u5B66");
		mntmNewMenuItem_18.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/bookManager.png")));
		mnNewMenu_12.add(mntmNewMenuItem_18);
		
		JMenuItem mntmNewMenuItem_19 = new JMenuItem("\u6587\u5B66");
		mntmNewMenuItem_19.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/bookManager.png")));
		mnNewMenu_12.add(mntmNewMenuItem_19);
		
		JMenuItem mntmNewMenuItem_20 = new JMenuItem("\u54F2\u5B66");
		mntmNewMenuItem_20.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/bookManager.png")));
		mnNewMenu_12.add(mntmNewMenuItem_20);
		
		JMenu mnNewMenu_13 = new JMenu("\u6309\u51FA\u7248\u793E\u6D4F\u89C8");
		mnNewMenu_13.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/search.png")));
		mnNewMenu_3.add(mnNewMenu_13);
		
		JMenuItem mntmNewMenuItem_21 = new JMenuItem("\u4EBA\u6C11\u6559\u80B2\u51FA\u7248\u793E");
		mntmNewMenuItem_21.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/bookTypeManager.png")));
		mnNewMenu_13.add(mntmNewMenuItem_21);
		
		JMenuItem mntmNewMenuItem_22 = new JMenuItem("\u9AD8\u7B49\u6559\u80B2\u51FA\u7248\u793E");
		mntmNewMenuItem_22.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/bookTypeManager.png")));
		mnNewMenu_13.add(mntmNewMenuItem_22);
		
		JMenuItem mntmNewMenuItem_23 = new JMenuItem("\u56FD\u5BB6\u56FE\u4E66\u9986\u51FA\u7248\u793E");
		mntmNewMenuItem_23.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/bookTypeManager.png")));
		mnNewMenu_13.add(mntmNewMenuItem_23);
		
		JMenuItem mntmNewMenuItem_24 = new JMenuItem("\u4E2D\u534E\u4E66\u5C40");
		mntmNewMenuItem_24.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/bookTypeManager.png")));
		mnNewMenu_13.add(mntmNewMenuItem_24);
		
		JMenuItem mntmNewMenuItem_25 = new JMenuItem("\u6587\u5316\u827A\u672F\u51FA\u7248\u793E");
		mntmNewMenuItem_25.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/bookTypeManager.png")));
		mnNewMenu_13.add(mntmNewMenuItem_25);
		
		JMenuItem mntmNewMenuItem_26 = new JMenuItem("\u5317\u4EAC\u5927\u5B66\u51FA\u7248\u793E");
		mntmNewMenuItem_26.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/bookTypeManager.png")));
		mnNewMenu_13.add(mntmNewMenuItem_26);
		
		JMenuItem mntmNewMenuItem_27 = new JMenuItem("\u590D\u65E6\u5927\u5B66\u51FA\u7248\u793E");
		mntmNewMenuItem_27.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/bookTypeManager.png")));
		mnNewMenu_13.add(mntmNewMenuItem_27);
		
		JMenuItem mntmNewMenuItem_28 = new JMenuItem("\u6E05\u534E\u5927\u5B66\u51FA\u7248\u793E");
		mntmNewMenuItem_28.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/bookTypeManager.png")));
		mnNewMenu_13.add(mntmNewMenuItem_28);
		
		JMenuItem mntmNewMenuItem_32 = new JMenuItem("\u5317\u4EAC\u90AE\u7535\u5927\u5B66\u51FA\u7248\u793E");
		mntmNewMenuItem_32.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/bookTypeManager.png")));
		mnNewMenu_13.add(mntmNewMenuItem_32);
		
		JMenuItem mntmNewMenuItem_29 = new JMenuItem("\u4E2D\u56FD\u6797\u4E1A\u51FA\u7248\u793E");
		mntmNewMenuItem_29.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/bookTypeManager.png")));
		mnNewMenu_13.add(mntmNewMenuItem_29);
		
		JMenuItem mntmNewMenuItem_31 = new JMenuItem("\u897F\u5357\u4EA4\u901A\u5927\u5B66\u51FA\u7248\u793E");
		mntmNewMenuItem_31.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/bookTypeManager.png")));
		mnNewMenu_13.add(mntmNewMenuItem_31);
		
		JMenuItem mntmNewMenuItem_30 = new JMenuItem("\u4E2D\u56FD\u4E2D\u533B\u836F\u51FA\u7248\u793E");
		mntmNewMenuItem_30.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/bookTypeManager.png")));
		mnNewMenu_13.add(mntmNewMenuItem_30);
		
		JMenuItem mntmNewMenuItem_33 = new JMenuItem("\u5176\u4ED6\u66F4\u591A......");
		mntmNewMenuItem_33.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/search.png")));
		mnNewMenu_13.add(mntmNewMenuItem_33);
		
		JMenu mnNewMenu_14 = new JMenu("\u6309\u4F5C\u8005\u6D4F\u89C8");
		mnNewMenu_14.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/search.png")));
		mnNewMenu_3.add(mnNewMenu_14);
		
		JMenuItem mntmNewMenuItem_36 = new JMenuItem("\u9C81\u8FC5");
		mntmNewMenuItem_36.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/userName.png")));
		mnNewMenu_14.add(mntmNewMenuItem_36);
		
		JMenuItem mntmNewMenuItem_34 = new JMenuItem("\u5DF4\u91D1");
		mntmNewMenuItem_34.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/userName.png")));
		mnNewMenu_14.add(mntmNewMenuItem_34);
		
		JMenuItem mntmNewMenuItem_35 = new JMenuItem("\u4E01\u73B2");
		mntmNewMenuItem_35.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/userName.png")));
		mnNewMenu_14.add(mntmNewMenuItem_35);
		
		JMenuItem mntmNewMenuItem_37 = new JMenuItem("\u51B0\u5FC3");
		mntmNewMenuItem_37.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/userName.png")));
		mnNewMenu_14.add(mntmNewMenuItem_37);
		
		JMenuItem mntmNewMenuItem_38 = new JMenuItem("\u5176\u4ED6\u66F4\u591A.....");
		mntmNewMenuItem_38.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/search.png")));
		mnNewMenu_14.add(mntmNewMenuItem_38);
		
		JMenu mnNewMenu = new JMenu("\u4E66\u7C4D\u7EF4\u62A4");
		mnNewMenu.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/base.png")));
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_4 = new JMenu("\u4E66\u7C4D\u7C7B\u522B\u7BA1\u7406");
		mnNewMenu_4.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/bookTypeManager.png")));
		mnNewMenu.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_41 = new JMenuItem("\u56FE\u4E66\u7C7B\u522B\u6DFB\u52A0");
		mntmNewMenuItem_41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * 图书添加功能
				 */
				BookTypeAddInterFrm BookTypeAddInterFrm=new BookTypeAddInterFrm();
				BookTypeAddInterFrm.setVisible(true);
				table.add(BookTypeAddInterFrm);
			}
		});
		mntmNewMenuItem_41.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/add.png")));
		mnNewMenu_4.add(mntmNewMenuItem_41);
		
		JMenuItem mntmNewMenuItem_42 = new JMenuItem("\u56FE\u4E66\u7C7B\u522B\u7EF4\u62A4");
		mntmNewMenuItem_42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookTypeManageInterFrm bookTypeManageInterFrm=new BookTypeManageInterFrm();
				bookTypeManageInterFrm.setVisible(true);
				table.add(bookTypeManageInterFrm);
			}
		});
		mntmNewMenuItem_42.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/edit.png")));
		mnNewMenu_4.add(mntmNewMenuItem_42);
		
		JMenu mnNewMenu_5 = new JMenu("\u4E66\u7C4D\u7BA1\u7406");
		mnNewMenu_5.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/bookManager.png")));
		mnNewMenu.add(mnNewMenu_5);
		
		JMenuItem mntmNewMenuItem_43 = new JMenuItem("\u56FE\u4E66\u6DFB\u52A0");
		mntmNewMenuItem_43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * 图书添加
				 */
				BookAddInterFrm bookAddInterFrm=new BookAddInterFrm();
				bookAddInterFrm.setVisible(true);
				table.add(bookAddInterFrm);
			}
		});
		mntmNewMenuItem_43.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/add.png")));
		mnNewMenu_5.add(mntmNewMenuItem_43);
		
		JMenuItem mntmNewMenuItem_44 = new JMenuItem("\u56FE\u4E66\u7EF4\u62A4");
		mntmNewMenuItem_44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * 图书维护
				 * 
				 */
				BookManageInterFrm bookManageInterFrm=new BookManageInterFrm();
				bookManageInterFrm.setVisible(true);
				table.add(bookManageInterFrm);
			}
		});
		mntmNewMenuItem_44.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/edit.png")));
		mnNewMenu_5.add(mntmNewMenuItem_44);
		
		JMenuItem mntmNewMenuItem_39 = new JMenuItem("\u9000\u51FA\u7EF4\u62A4");
		mntmNewMenuItem_39.addActionListener(new ActionListener() {
			/**
			 * 退出维护系统
			 */
			public void actionPerformed(ActionEvent e) {
				int result=JOptionPane.showConfirmDialog(null, "是否，退出维护系统？（Y/N）");
				System.out.println(result);
				if(result==0) {
					dispose();
				}
			}
		});
		mntmNewMenuItem_39.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/exit.png")));
		mnNewMenu.add(mntmNewMenuItem_39);
		
		JMenu mnNewMenu_1 = new JMenu("\u5173\u4E8E\u5F00\u53D1\u8005");
		mnNewMenu_1.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/me.png")));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_40 = new JMenuItem("\u5173\u4E8E\u4F5C\u8005");
		mntmNewMenuItem_40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Java1234InterFrm java1234InterFrm=new Java1234InterFrm();
				java1234InterFrm.setVisible(true);
				table.add(java1234InterFrm)	;			
			}
		});
		mntmNewMenuItem_40.setIcon(new ImageIcon(MainFrm.class.getResource("/Images/me.png")));
		mnNewMenu_1.add(mntmNewMenuItem_40);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		table = new JDesktopPane();
		table.setBackground(Color.WHITE);
		contentPane.add(table, BorderLayout.CENTER);
		
		/**
		 * 设置默认最大化
		 */
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
}
