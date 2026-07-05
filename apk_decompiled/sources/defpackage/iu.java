package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class iu implements by5 {
    public final /* synthetic */ lu a;

    public iu(lu luVar) {
        this.a = luVar;
    }

    @Override // defpackage.by5
    public final boolean D() {
        return ((Boolean) this.a.q.getValue()).booleanValue();
    }

    @Override // defpackage.by5
    public final void I() {
        lu luVar = this.a;
        Set setT1 = w44.t1(luVar.Q());
        if (setT1.isEmpty()) {
            return;
        }
        luVar.q.setValue(Boolean.TRUE);
        luVar.r.setValue(Boolean.FALSE);
        gb9.D(luVar.a, null, null, new o0(luVar, setT1, null, 5), 3);
    }

    @Override // defpackage.by5
    public final gh2 M() {
        return this.a.s;
    }

    @Override // defpackage.by5
    public final boolean s() {
        return ((Boolean) this.a.r.getValue()).booleanValue();
    }
}
