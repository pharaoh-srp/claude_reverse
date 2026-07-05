package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c88 {
    public final /* synthetic */ int a = 1;
    public String b;
    public String c;

    public c88(String str, String str2) {
        dgj.p(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.b = str;
        this.c = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public boolean equals(Object obj) {
        switch (this.a) {
            case 1:
                return false;
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.a) {
            case 1:
                String str = this.b;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.c;
                return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "Pair{" + ((Object) this.b) + " " + ((Object) this.c) + "}";
            case 2:
                return "<" + this.b + ">: " + this.c;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ c88() {
    }

    public c88(vi2 vi2Var, String str) {
        vi2Var.getClass();
        this.b = vi2Var.Q0();
        this.c = str;
    }

    public c88(vi2 vi2Var, String str, Object[] objArr) {
        vi2Var.getClass();
        this.b = vi2Var.Q0();
        this.c = String.format(str, objArr);
    }
}
