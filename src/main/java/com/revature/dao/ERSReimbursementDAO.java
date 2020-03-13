package com.revature.dao;

import java.util.TreeSet;

import com.revature.dao.interfaces.ERSReimbursementDAOInterface;
import com.revature.enums.ERSReimbursementStatus;
import com.revature.model.ERSReimbursement;

public class ERSReimbursementDAO implements ERSReimbursementDAOInterface {

	public void createReimbursement(ERSReimbursement reimb) {
		// TODO Auto-generated method stub

	}

	public void deleteReimbursement(ERSReimbursement reimb) {
		// TODO Auto-generated method stub

	}

	public void deleteReimbursementByID(long ID) {
		// TODO Auto-generated method stub

	}

	public long getMaxID() {
		// TODO Auto-generated method stub
		return 0;
	}

	public TreeSet<ERSReimbursement> readAllReimbursements() {
		// TODO Auto-generated method stub
		return null;
	}

	public TreeSet<ERSReimbursement> readReimbursementsByID(long ID) {
		// TODO Auto-generated method stub
		return null;
	}

	public TreeSet<ERSReimbursement> readReimbursementsByOwnerID(long ID) {
		// TODO Auto-generated method stub
		return null;
	}

	public TreeSet<ERSReimbursement> readReimbursementsByStatus(ERSReimbursementStatus rs) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateReimbursement(ERSReimbursement reimb) {
		// TODO Auto-generated method stub

	}

}
