
public class StoreUnit {
    private String m_strName;
    private int m_iPrice;
    private int m_iQuantity;

    public StoreUnit(String p_strName, int p_Price, int p_Quantity) {
        setName(p_strName);
        setPrice(p_Price);
        setQuantity(p_Quantity);
    }
    
    

    public String getName() {
        return m_strName;
    }

    public void setName(String p_strName) {
        m_strName = p_strName;
    }

    public int getPrice() {
        return m_iPrice;
    }

    public void setPrice(int p_iPrice) {
        m_iPrice = p_iPrice;
    }

    public int getQuantity() {
        return m_iQuantity;
    }

    public void setQuantity(int p_iQuantity) {
        m_iQuantity = p_iQuantity;
    }
    
    public int getCost()
    {
        int iPrice = getPrice();
        int iQuantity = getQuantity();
        int iresult = iPrice * iQuantity;
        return iresult;
    }
}
