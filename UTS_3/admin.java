package UTS_3;

public class admin {
    
    public class Admin extends user {
        public Admin(int user_id, String password, String name, String age, String email_id, String doc) {
            super(user_id, password, name, age, email_id, doc);
        }
    
        public void updateVehicleDetails(int vehicle_id, String details) {
            formatOutput.printSuccess("New vehicle added: " + vehicle_id + " details updated: " + details);
        }
    
        public void addVehicle(String vehicle) {
            formatOutput.printSuccess("New vehicle added: " + vehicle);
        }
    
        public void retrieveComplain() {
            formatOutput.printInfo("Complaint retrieved and under review.");
        }
    
        public void verifyuser(customer customer) {
            customer.setVerification(true);
            formatOutput.printSuccess("User: " + customer.getName() + " has been verified.");
        }
    }

    public void updateVehicleDetails(int vehicleId, String vehicleDetails) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateVehicleDetails'");
    }

    public void verifyuser(customer customer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'verifyuser'");
    }
}

