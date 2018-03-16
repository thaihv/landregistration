package com.lo.pckg.activiti.document.dao;

import com.lo.pckg.activiti.dao.IBaseDao;
import com.lo.pckg.activiti.model.document.Invoice;
import com.lo.pckg.activiti.web.PagingCriteria;

import java.util.List;

/**
 * @author William Studer
 * Date: 5/20/14
 */
public interface InvoiceDao extends IBaseDao<Invoice> {

    String create(Invoice Invoice);

    void createWithId(Invoice obj);

    Invoice read(String InvoiceId);

    List<Invoice> readAll();

    int getCount();

    void delete(String InvoiceId);

    void update(Invoice Invoice);

    List<Invoice> readPage(PagingCriteria criteria);
}
