package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class orc extends zh4 {
    public final /* synthetic */ int r;
    public final String s;
    public final lz1 t;
    public final boolean u;

    public orc(String str, boolean z, int i) {
        this.r = i;
        switch (i) {
            case 1:
                lz1 lz1Var = lz1.F;
                Objects.requireNonNull(str, "name == null");
                this.s = str;
                this.t = lz1Var;
                this.u = z;
                break;
            default:
                lz1 lz1Var2 = lz1.F;
                Objects.requireNonNull(str, "name == null");
                this.s = str;
                this.t = lz1Var2;
                this.u = z;
                break;
        }
    }

    @Override // defpackage.zh4
    public final void j(zie zieVar, Object obj) {
        int i = this.r;
        boolean z = this.u;
        String str = this.s;
        lz1 lz1Var = this.t;
        switch (i) {
            case 0:
                if (obj != null) {
                    lz1Var.getClass();
                    String string = obj.toString();
                    if (string != null) {
                        epk epkVar = zieVar.j;
                        if (!z) {
                            epkVar.g(str, string);
                        } else {
                            epkVar.h(str, string);
                        }
                        break;
                    }
                }
                break;
            default:
                if (obj != null) {
                    lz1Var.getClass();
                    String string2 = obj.toString();
                    if (string2 != null) {
                        zieVar.a(str, string2, z);
                        break;
                    }
                }
                break;
        }
    }
}
