package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class ixb implements ta2, x5j {
    public final ua2 E;
    public final /* synthetic */ jxb F;

    public ixb(jxb jxbVar, ua2 ua2Var) {
        this.F = jxbVar;
        this.E = ua2Var;
    }

    @Override // defpackage.x5j
    public final void a(lff lffVar, int i) {
        this.E.a(lffVar, i);
    }

    @Override // defpackage.tp4
    public final c45 getContext() {
        return this.E.I;
    }

    @Override // defpackage.ta2
    public final sqb h(Object obj, rz7 rz7Var) {
        jxb jxbVar = this.F;
        lca lcaVar = new lca(jxbVar, this);
        sqb sqbVarH = this.E.H((iei) obj, lcaVar);
        if (sqbVarH != null) {
            jxb.N.set(jxbVar, null);
        }
        return sqbVarH;
    }

    @Override // defpackage.ta2
    public final void o(Object obj, rz7 rz7Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = jxb.N;
        jxb jxbVar = this.F;
        atomicReferenceFieldUpdater.set(jxbVar, null);
        tl8 tl8Var = new tl8(jxbVar, 19, this);
        ua2 ua2Var = this.E;
        ua2Var.E(ua2Var.G, new nn(7, tl8Var), (iei) obj);
    }

    @Override // defpackage.ta2
    public final boolean q(Throwable th) {
        return this.E.q(th);
    }

    @Override // defpackage.tp4
    public final void resumeWith(Object obj) {
        this.E.resumeWith(obj);
    }

    @Override // defpackage.ta2
    public final void u(Object obj) {
        this.E.u(obj);
    }
}
