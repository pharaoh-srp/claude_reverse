package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jxk extends wpk {
    @Override // defpackage.wpk
    public final void m(yyk yykVar, yyk yykVar2) {
        yykVar.b = yykVar2;
    }

    @Override // defpackage.wpk
    public final void n(yyk yykVar, Thread thread) {
        yykVar.a = thread;
    }

    @Override // defpackage.wpk
    public final boolean o(x0l x0lVar, tjk tjkVar, tjk tjkVar2) {
        synchronized (x0lVar) {
            try {
                if (x0lVar.F != tjkVar) {
                    return false;
                }
                x0lVar.F = tjkVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wpk
    public final boolean p(x0l x0lVar, Object obj, Object obj2) {
        synchronized (x0lVar) {
            try {
                if (x0lVar.E != obj) {
                    return false;
                }
                x0lVar.E = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wpk
    public final boolean q(x0l x0lVar, yyk yykVar, yyk yykVar2) {
        synchronized (x0lVar) {
            try {
                if (x0lVar.G != yykVar) {
                    return false;
                }
                x0lVar.G = yykVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
