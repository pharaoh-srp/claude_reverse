package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class svc implements mee {
    public final Set E;
    public final wwb F = new wwb(0, new i18[16]);

    public svc(Set set) {
        this.E = set;
    }

    @Override // defpackage.mee
    public final void a() {
    }

    @Override // defpackage.mee
    public final void b() {
    }

    public final wwb c() {
        return this.F;
    }

    @Override // defpackage.mee
    public final void g() {
        wwb wwbVar = this.F;
        Object[] objArr = wwbVar.E;
        int i = wwbVar.G;
        for (int i2 = 0; i2 < i; i2++) {
            mee meeVar = ((i18) objArr[i2]).a;
            this.E.remove(meeVar);
            meeVar.g();
        }
    }
}
