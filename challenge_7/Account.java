package interfaces_and_abstract_classes;

abstract  class Account {
    private int id;
    private String name;
    private DataSource myData;

    public void performOperation(DataSource _myData) {
        myData = _myData;
        myData.execute();

    }
}
