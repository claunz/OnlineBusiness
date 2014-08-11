
package shop.control;

import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;



@Named("navcontrol")
@ApplicationScoped
public class NavigationContoller  implements Serializable{
    private static final String browser_products = "browseProducts";

    public NavigationContoller() {
    }
    
    public String browseProducts(){
        return browser_products;
    }
    public String addProduct(){
        return null;
    }
    public String viewProduct(){
        return null;
    }
    public String browseOrders(){
        return null;
    }
    public String viewOrders(){
        return null;
    }
    public String viewCart(){
        return null;
    }
}
