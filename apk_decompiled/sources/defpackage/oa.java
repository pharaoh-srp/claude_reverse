package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oa {
    public final wa a;
    public final int b;

    public oa(wa waVar, int i) {
        this.a = waVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa)) {
            return false;
        }
        oa oaVar = (oa) obj;
        return this.a == oaVar.a && this.b == oaVar.b;
    }

    public final int hashCode() {
        wa waVar = this.a;
        int iHashCode = (waVar == null ? 0 : waVar.hashCode()) * 31;
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
}
