package com.lo.pckg.activiti.alert;

import com.lo.pckg.activiti.dao.IBaseDao;
import com.lo.pckg.activiti.model.Alert;

import java.util.List;

public interface AlertDao extends IBaseDao<Alert> {

    /**
     * @param userId
     * @return sorted list (by createdDate) of alerts for the given user
     *         that have yet to be acknowledged
     */
    List<Alert> readActiveAlertsByUserId(String userId);

    /**
     * Sets the acknowledge flag to boolean TRUE
     * @param alertId
     */
    void acknowledgeAlert(String alertId);
}
