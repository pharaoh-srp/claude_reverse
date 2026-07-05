package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class noe {
    public final bpe a;
    public final int b;

    public noe(bpe bpeVar, int i) {
        this.a = bpeVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof noe)) {
            return false;
        }
        noe noeVar = (noe) obj;
        return this.a == noeVar.a && this.b == noeVar.b;
    }

    public final int hashCode() {
        bpe bpeVar = this.a;
        int iHashCode = (bpeVar == null ? 0 : bpeVar.hashCode()) * 31;
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
