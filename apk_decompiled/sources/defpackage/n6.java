package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n6 implements i4a {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ n6(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.i4a
    public final void d(m4a m4aVar, y3a y3aVar) {
        kwb kwbVarC;
        v0d v0dVar;
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                ((bz7) obj).invoke(y3aVar);
                return;
            case 1:
                aya ayaVar = ((vza) obj).a;
                int i2 = nza.a[y3aVar.ordinal()];
                if (i2 == 1) {
                    ayaVar.onPause();
                    return;
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    ayaVar.onResume();
                    return;
                }
            default:
                nwb nwbVar = (nwb) obj;
                int i3 = h2d.a[y3aVar.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2 && (v0dVar = (v0d) nwbVar.getValue()) != null) {
                        v0dVar.c();
                        return;
                    }
                    return;
                }
                v0d v0dVar2 = (v0d) nwbVar.getValue();
                if (v0dVar2 != null) {
                    v0dVar2.h = true;
                    p5e p5eVar = v0dVar2.f;
                    if (p5eVar != null) {
                        p5eVar.c(1000, "client backgrounded");
                    }
                    v0dVar2.f = null;
                    rcg rcgVarJ = ycg.j();
                    kwb kwbVar = rcgVarJ instanceof kwb ? (kwb) rcgVarJ : null;
                    if (kwbVar == null || (kwbVarC = kwbVar.C(null, null)) == null) {
                        sz6.j("Cannot create a mutable snapshot of an read-only snapshot");
                        return;
                    }
                    try {
                        rcg rcgVarJ2 = kwbVarC.j();
                        try {
                            v0dVar2.e.clear();
                            v0dVar2.c.setValue(r0d.a);
                            v0dVar2.d.setValue(Boolean.FALSE);
                            kwbVarC.w().p();
                            kwbVarC.c();
                            v0dVar2.g = 0;
                            return;
                        } finally {
                            rcg.q(rcgVarJ2);
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            kwbVarC.c();
                            throw th2;
                        }
                    }
                }
                return;
        }
    }
}
