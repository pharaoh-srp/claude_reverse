package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tu6 extends av6 {
    public final String a;
    public final String b;
    public final /* synthetic */ int c;

    public tu6(String str, String str2, int i) {
        this.c = i;
        pqi.n(str);
        this.a = ouk.h(str);
        if ((str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""))) {
            pqi.l("Quoted value must have content", str2.length() > 1);
            str2 = str2.substring(1, str2.length() - 1);
        }
        this.b = ouk.g(str2);
    }

    @Override // defpackage.av6
    public final int a() {
        switch (this.c) {
            case 0:
                return 3;
            case 1:
                return 6;
            case 2:
                return 4;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    @Override // defpackage.av6
    public final boolean b(yj6 yj6Var, yj6 yj6Var2) {
        int i = this.c;
        String str = this.b;
        String str2 = this.a;
        switch (i) {
            case 0:
                return yj6Var2.u(str2) && str.equalsIgnoreCase(yj6Var2.g(str2));
            case 1:
                return yj6Var2.u(str2) && ouk.g(yj6Var2.g(str2)).contains(str);
            case 2:
                return yj6Var2.u(str2) && ouk.g(yj6Var2.g(str2)).endsWith(str);
            case 3:
                return !str.equalsIgnoreCase(yj6Var2.g(str2));
            default:
                return yj6Var2.u(str2) && ouk.g(yj6Var2.g(str2)).startsWith(str);
        }
    }

    public final String toString() {
        switch (this.c) {
            case 0:
                return ij0.l("[", this.a, "=", this.b, "]");
            case 1:
                return ij0.l("[", this.a, "*=", this.b, "]");
            case 2:
                return ij0.l("[", this.a, "$=", this.b, "]");
            case 3:
                return ij0.l("[", this.a, "!=", this.b, "]");
            default:
                return ij0.l("[", this.a, "^=", this.b, "]");
        }
    }
}
