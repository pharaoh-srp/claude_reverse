package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ewi {
    public final zwi a;
    public final int b;

    public ewi(zwi zwiVar, int i) {
        this.a = zwiVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewi)) {
            return false;
        }
        ewi ewiVar = (ewi) obj;
        return this.a == ewiVar.a && this.b == ewiVar.b;
    }

    public final int hashCode() {
        zwi zwiVar = this.a;
        int iHashCode = (zwiVar == null ? 0 : zwiVar.hashCode()) * 31;
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
