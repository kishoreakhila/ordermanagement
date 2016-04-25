package org.akhila.cloudservices.rest.services;

import net.sf.json.JSONArray;
import org.akhila.cloudservices.rest.model.Product;

public interface ProductService {
    public Product getProductByProductCode(int productCode);
    public JSONArray getAllProducts();
}
