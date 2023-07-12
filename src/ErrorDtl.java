public class ErrorDtl {

    private String errorName;
    private String errorDesc;

    public String getErrorName() {
        return errorName;
    }

    public ErrorDtl ErrorName(String errorName) {
        this.errorName = errorName;
        return this;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public ErrorDtl ErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }

    @Override
    public String toString() {
        return "ErrorDtl{" +
                "errorName='" + errorName + '\'' +
                ", errorDesc='" + errorDesc + '\'' +
                '}';
    }
}
