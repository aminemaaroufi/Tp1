package extention;

import dao.IDao;

public class DaoImplExt implements IDao {
    @Override
    public double getValue() {
        return 150.0;
    }
}