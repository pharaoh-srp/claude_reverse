package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class aej implements i4a {
    public final /* synthetic */ mp4 E;
    public final /* synthetic */ a70 F;
    public final /* synthetic */ x7e G;
    public final /* synthetic */ dae H;

    public aej(mp4 mp4Var, a70 a70Var, x7e x7eVar, dae daeVar) {
        this.E = mp4Var;
        this.F = a70Var;
        this.G = x7eVar;
        this.H = daeVar;
    }

    @Override // defpackage.i4a
    public final void d(m4a m4aVar, y3a y3aVar) {
        boolean z;
        ta2 ta2VarY = null;
        switch (zdj.a[y3aVar.ordinal()]) {
            case 1:
                gb9.D(this.E, null, o45.H, new zw(this.H, this.G, m4aVar, this, null, 24), 1);
                return;
            case 2:
                a70 a70Var = this.F;
                if (a70Var != null) {
                    bm7 bm7Var = (bm7) a70Var.G;
                    synchronized (bm7Var.b) {
                        try {
                            synchronized (bm7Var.b) {
                                z = bm7Var.a;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) bm7Var.c;
                                bm7Var.c = (ArrayList) bm7Var.d;
                                bm7Var.d = arrayList;
                                bm7Var.a = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((tp4) arrayList.get(i)).resumeWith(iei.a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                x7e x7eVar = this.G;
                synchronized (x7eVar.d) {
                    if (x7eVar.u) {
                        x7eVar.u = false;
                        ta2VarY = x7eVar.y();
                    }
                    break;
                }
                if (ta2VarY != null) {
                    ((ua2) ta2VarY).resumeWith(iei.a);
                    return;
                }
                return;
            case 3:
                x7e x7eVar2 = this.G;
                synchronized (x7eVar2.d) {
                    x7eVar2.u = true;
                }
                return;
            case 4:
                this.G.x();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                mr9.b();
                return;
        }
    }
}
