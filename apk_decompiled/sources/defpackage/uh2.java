package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class uh2 extends lh2 {
    public final Iterable H;

    public /* synthetic */ uh2(Iterable iterable) {
        this(iterable, im6.E, -2, py1.E);
    }

    @Override // defpackage.lh2
    public final Object g(aid aidVar, tp4 tp4Var) {
        bmf bmfVar = new bmf(aidVar);
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            gb9.D(aidVar, null, null, new nn1((kp7) it.next(), bmfVar, (tp4) null, 13), 3);
        }
        return iei.a;
    }

    @Override // defpackage.lh2
    public final lh2 h(c45 c45Var, int i, py1 py1Var) {
        return new uh2(this.H, c45Var, i, py1Var);
    }

    @Override // defpackage.lh2
    public final d6e j(l45 l45Var) {
        pz7 dxVar = new dx(this, (tp4) null, 8);
        aid aidVar = new aid(zni.P(l45Var, this.E), wd6.P(this.F, 4, py1.E));
        aidVar.w0(o45.E, aidVar, dxVar);
        return aidVar;
    }

    public uh2(Iterable iterable, c45 c45Var, int i, py1 py1Var) {
        super(c45Var, i, py1Var);
        this.H = iterable;
    }
}
