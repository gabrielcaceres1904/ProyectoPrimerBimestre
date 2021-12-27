package ec.edu.epn.PPB;

public class iBDDResponse {
    enum BDDStatus{
        OK,ERROR;
    }
    private BDDStatus status;

    public iBDDResponse(BDDStatus status) {
        this.status = status;
    }

    public BDDStatus getStatus() {
        return status;
    }
}
