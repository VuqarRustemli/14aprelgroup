package main2;

class SchoolBell {

    private static SchoolBell instance;

    private SchoolBell() {
    	
    }

    public static SchoolBell getInstance() {
        if (instance == null) {
            instance = new SchoolBell();
        }
        return instance;
    }

    public void ring() {
        System.out.println("Zeng calindi");
    }
    
    

}