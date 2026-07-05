package defpackage;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class jzb {
    public sf5 a;
    public boolean b;
    public dpf c;

    public abstract void a();

    public abstract void b();

    public abstract void c(hzb hzbVar);

    public abstract void d(hzb hzbVar);

    public final void e() {
        dpf dpfVar = this.c;
        if (dpfVar == null || !((LinkedHashSet) dpfVar.H).remove(this)) {
            return;
        }
        mzb mzbVar = (mzb) dpfVar.G;
        mzbVar.getClass();
        if (equals(mzbVar.f)) {
            if (mzbVar.g == -1) {
                a();
            }
            mzbVar.f = null;
            mzbVar.g = 0;
            mzbVar.h = null;
        }
        mzbVar.d.remove(this);
        mzbVar.e.remove(this);
        this.c = null;
        mzbVar.b();
    }

    public final void f(boolean z) {
        mzb mzbVar;
        if (this.b == z) {
            return;
        }
        this.b = z;
        dpf dpfVar = this.c;
        if (dpfVar == null || (mzbVar = (mzb) dpfVar.G) == null) {
            return;
        }
        mzbVar.b();
    }
}
