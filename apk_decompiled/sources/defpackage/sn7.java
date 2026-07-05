package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class sn7 extends fhi implements cs9 {
    public final j7g F;
    public final j7g G;

    public sn7(j7g j7gVar, j7g j7gVar2) {
        j7gVar.getClass();
        j7gVar2.getClass();
        this.F = j7gVar;
        this.G = j7gVar2;
    }

    @Override // defpackage.yr9
    public fab G() {
        return o0().G();
    }

    @Override // defpackage.yr9
    public final List H() {
        return o0().H();
    }

    @Override // defpackage.yr9
    public final r9i K() {
        return o0().K();
    }

    @Override // defpackage.yr9
    public final u9i O() {
        return o0().O();
    }

    @Override // defpackage.yr9
    public final boolean b0() {
        return o0().b0();
    }

    public abstract j7g o0();

    public abstract String p0(g06 g06Var, g06 g06Var2);

    public String toString() {
        return g06.e.Z(this);
    }
}
