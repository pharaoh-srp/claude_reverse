package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uzj {
    public static final /* synthetic */ int c = 0;
    public final boolean a;
    public final int b;

    static {
        byte b = (byte) (((byte) (0 | 1)) | 2);
        if (b != 3) {
            StringBuilder sb = new StringBuilder();
            if ((b & 1) == 0) {
                sb.append(" hasDifferentDmaOwner");
            }
            if ((b & 2) == 0) {
                sb.append(" skipChecks");
            }
            sz6.j("Missing required properties:".concat(String.valueOf(sb)));
            return;
        }
        byte b2 = (byte) (((byte) (0 | 1)) | 2);
        if (b2 == 3) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b2 & 1) == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if ((b2 & 2) == 0) {
            sb2.append(" skipChecks");
        }
        sz6.j("Missing required properties:".concat(String.valueOf(sb2)));
    }

    public uzj(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uzj)) {
            return false;
        }
        uzj uzjVar = (uzj) obj;
        return this.a == uzjVar.a && sq6.c(this.b, uzjVar.b);
    }

    public final int hashCode() {
        return sq6.F(this.b) ^ (((this.a ? 1231 : 1237) ^ (-485106924)) * 583896283);
    }

    public final String toString() {
        return "FileComplianceOptions{fileOwner=, hasDifferentDmaOwner=false, skipChecks=" + this.a + ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + fsh.J(this.b) + "}";
    }
}
