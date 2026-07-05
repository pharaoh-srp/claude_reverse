package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class vff {
    public final /* synthetic */ int a;
    public final List b;
    public final y3i[] c;
    public final ig0 d;

    public vff(List list, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = list;
                this.c = new y3i[list.size()];
                ig0 ig0Var = new ig0(new jke(6, this));
                this.d = ig0Var;
                ig0Var.r(3);
                break;
            default:
                this.b = list;
                this.c = new y3i[list.size()];
                this.d = new ig0(new jke(2, this));
                break;
        }
    }

    public void a(long j, ssc sscVar) {
        if (sscVar.a() < 9) {
            return;
        }
        int iM = sscVar.m();
        int iM2 = sscVar.m();
        int iZ = sscVar.z();
        if (iM == 434 && iM2 == 1195456820 && iZ == 3) {
            this.d.d(j, sscVar);
        }
    }

    public final void b(yd7 yd7Var, t6f t6fVar) {
        int i = this.a;
        List list = this.b;
        y3i[] y3iVarArr = this.c;
        switch (i) {
            case 0:
                for (int i2 = 0; i2 < y3iVarArr.length; i2++) {
                    t6fVar.d();
                    t6fVar.i();
                    y3i y3iVarN = yd7Var.n(t6fVar.c, 3);
                    jw7 jw7Var = (jw7) list.get(i2);
                    String str = jw7Var.o;
                    fd9.F("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: %s", str);
                    String str2 = jw7Var.a;
                    if (str2 == null) {
                        t6fVar.i();
                        str2 = (String) t6fVar.e;
                    }
                    iw7 iw7Var = new iw7();
                    iw7Var.a = str2;
                    iw7Var.m = gkb.k("video/mp2t");
                    iw7Var.n = gkb.k(str);
                    iw7Var.e = jw7Var.e;
                    iw7Var.d = jw7Var.d;
                    iw7Var.K = jw7Var.L;
                    iw7Var.q = jw7Var.r;
                    qy1.n(iw7Var, y3iVarN);
                    y3iVarArr[i2] = y3iVarN;
                }
                break;
            default:
                for (int i3 = 0; i3 < y3iVarArr.length; i3++) {
                    t6fVar.d();
                    t6fVar.i();
                    y3i y3iVarN2 = yd7Var.n(t6fVar.c, 3);
                    jw7 jw7Var2 = (jw7) list.get(i3);
                    String str3 = jw7Var2.o;
                    fd9.F("application/cea-608".equals(str3) || "application/cea-708".equals(str3), "Invalid closed caption MIME type provided: %s", str3);
                    iw7 iw7Var2 = new iw7();
                    t6fVar.i();
                    iw7Var2.a = (String) t6fVar.e;
                    iw7Var2.m = gkb.k("video/mp2t");
                    iw7Var2.n = gkb.k(str3);
                    iw7Var2.e = jw7Var2.e;
                    iw7Var2.d = jw7Var2.d;
                    iw7Var2.K = jw7Var2.L;
                    iw7Var2.q = jw7Var2.r;
                    qy1.n(iw7Var2, y3iVarN2);
                    y3iVarArr[i3] = y3iVarN2;
                }
                break;
        }
    }
}
