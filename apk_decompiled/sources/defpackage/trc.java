package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class trc extends zh4 {
    public final String r;
    public final lz1 s;
    public final boolean t;

    public trc(String str, boolean z) {
        lz1 lz1Var = lz1.F;
        Objects.requireNonNull(str, "name == null");
        this.r = str;
        this.s = lz1Var;
        this.t = z;
    }

    @Override // defpackage.zh4
    public final void j(zie zieVar, Object obj) {
        if (obj == null) {
            return;
        }
        this.s.getClass();
        String string = obj.toString();
        if (string == null) {
            return;
        }
        zieVar.b(this.r, string, this.t);
    }
}
