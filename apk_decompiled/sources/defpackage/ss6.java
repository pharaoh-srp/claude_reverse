package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ss6 {
    public final ct6 a;
    public final int b;

    public /* synthetic */ ss6(int i, int i2) {
        this((ct6) null, (i2 & 2) != 0 ? 0 : i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss6)) {
            return false;
        }
        ss6 ss6Var = (ss6) obj;
        return this.a == ss6Var.a && this.b == ss6Var.b;
    }

    public final int hashCode() {
        ct6 ct6Var = this.a;
        int iHashCode = (ct6Var == null ? 0 : ct6Var.hashCode()) * 31;
        int i = this.b;
        return iHashCode + (i != 0 ? sq6.F(i) : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DdSession(plan=");
        sb.append(this.a);
        sb.append(", sessionPrecondition=");
        switch (this.b) {
            case 1:
                str = "USER_APP_LAUNCH";
                break;
            case 2:
                str = "INACTIVITY_TIMEOUT";
                break;
            case 3:
                str = "MAX_DURATION";
                break;
            case 4:
                str = "BACKGROUND_LAUNCH";
                break;
            case 5:
                str = "PREWARM";
                break;
            case 6:
                str = "FROM_NON_INTERACTIVE_SESSION";
                break;
            case 7:
                str = "EXPLICIT_STOP";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public ss6(ct6 ct6Var, int i) {
        this.a = ct6Var;
        this.b = i;
    }
}
