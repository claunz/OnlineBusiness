
package shop.control;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import shop.dao.IProductDao;
import shop.dao.ProductDao;
import shop.entity.Product;

@ManagedBean
@SessionScoped
public class ProductController implements Serializable{
    private static final String browser_products = "browseProducts";
    private static final String add_product = "addProduct";
    private IProductDao productDao;
    private List<Product> productList;
    
    public ProductController() {
    }
    public String addProduct(){
        return add_product;
    }
    public String browseProducts(){
        productDao = new ProductDao();
        productList = (List<Product>) productDao.getProducts();
        System.out.println(" In get product list "+productList.size());
        return browser_products;
    }

    public List<Product> getProductList() {
        return productList;
    }
    
    
}
