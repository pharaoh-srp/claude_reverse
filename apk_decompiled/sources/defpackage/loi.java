package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class loi implements l45 {
    public final /* synthetic */ mp4 E;
    public final h86 F;
    public final fn0 G;
    public final ArrayList H = new ArrayList();

    public loi(fn0 fn0Var, h86 h86Var) {
        this.E = fd9.c(nai.Z(iuj.g(), h86Var.a()));
        this.F = h86Var;
        this.G = fn0Var;
    }

    @Override // defpackage.l45
    public final c45 getCoroutineContext() {
        return this.E.E;
    }
}
