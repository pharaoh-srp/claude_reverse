package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qba extends rba implements i4a {
    public final m4a I;
    public final /* synthetic */ bvb J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qba(bvb bvbVar, m4a m4aVar, kbc kbcVar) {
        super(bvbVar, kbcVar);
        this.J = bvbVar;
        this.I = m4aVar;
    }

    @Override // defpackage.rba
    public final void b() {
        this.I.a().c(this);
    }

    @Override // defpackage.rba
    public final boolean c(m4a m4aVar) {
        return this.I == m4aVar;
    }

    @Override // defpackage.i4a
    public final void d(m4a m4aVar, y3a y3aVar) {
        m4a m4aVar2 = this.I;
        a4a a4aVarB = m4aVar2.a().b();
        if (a4aVarB == a4a.E) {
            this.J.h(this.E);
            return;
        }
        a4a a4aVar = null;
        while (a4aVar != a4aVarB) {
            a(e());
            a4aVar = a4aVarB;
            a4aVarB = m4aVar2.a().b();
        }
    }

    @Override // defpackage.rba
    public final boolean e() {
        return this.I.a().b().compareTo(a4a.H) >= 0;
    }
}
