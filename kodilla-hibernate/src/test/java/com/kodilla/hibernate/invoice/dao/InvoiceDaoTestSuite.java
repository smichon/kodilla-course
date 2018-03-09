package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Tea");

        Item item1 = new Item(new BigDecimal(7.8), 2, new BigDecimal(15.6));
        Item item2 = new Item(new BigDecimal(12.7), 2, new BigDecimal(25.4));
        Item item3 = new Item(new BigDecimal(9.9), 2, new BigDecimal(19.8));
        Invoice invoice = new Invoice("FV001");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        product.getItems().add(item1);
        product.getItems().add(item2);
        product.getItems().add(item3);

        item1.setProduct(product);
        item2.setProduct(product);
        item3.setProduct(product);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        productDao.save(product);
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        int id = invoice.getId();

        //Then
        Assert.assertEquals(1, invoiceDao.count());
        Assert.assertEquals(3, itemDao.count());

        //CleanUp
        itemDao.delete(item1.getId());
        itemDao.delete(item2.getId());
        itemDao.delete(item3.getId());
        productDao.delete(product.getId());
        invoiceDao.delete(id);
    }

}
