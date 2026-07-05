package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rba {
    public final kbc E;
    public boolean F;
    public int G = -1;
    public final /* synthetic */ bvb H;

    public rba(bvb bvbVar, kbc kbcVar) {
        this.H = bvbVar;
        this.E = kbcVar;
    }

    public final void a(boolean z) {
        if (z == this.F) {
            return;
        }
        this.F = z;
        int i = z ? 1 : -1;
        bvb bvbVar = this.H;
        int i2 = bvbVar.c;
        bvbVar.c = i + i2;
        if (!bvbVar.d) {
            bvbVar.d = true;
            while (true) {
                try {
                    int i3 = bvbVar.c;
                    if (i2 == i3) {
                        break;
                    }
                    boolean z2 = i2 == 0 && i3 > 0;
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        bvbVar.e();
                    } else if (z3) {
                        bvbVar.f();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    bvbVar.d = false;
                    throw th;
                }
            }
            bvbVar.d = false;
        }
        if (this.F) {
            bvbVar.c(this);
        }
    }

    public void b() {
    }

    public boolean c(m4a m4aVar) {
        return false;
    }

    public abstract boolean e();
}
