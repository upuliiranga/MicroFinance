package edu.ijse.gdse39.microfinance.service;

import edu.ijse.gdse39.microfinance.dto.BranchDto;

import java.util.ArrayList;

/**
 * @author Pahansith on 10/9/2017
 * @project MicroFinance
 */

public interface BranchService {
    ArrayList<BranchDto> getBranchByProvince(int provinceId);
}
