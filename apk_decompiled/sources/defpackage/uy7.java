package defpackage;

import com.segment.analytics.kotlin.core.BaseEvent;

/* JADX INFO: loaded from: classes.dex */
public final class uy7 implements sr7 {
    public long a;
    public fkg b;
    public boolean c;

    @Override // defpackage.sr7
    public final boolean a() {
        return false;
    }

    @Override // defpackage.sr7
    public final void b(gx gxVar) {
        el5 el5Var = gxVar.F;
        if (this.c) {
            return;
        }
        this.c = true;
        this.b = gb9.D((mp4) el5Var.I, (e45) el5Var.H, null, new cx(this, gxVar, (tp4) null), 2);
    }

    @Override // defpackage.sr7
    public final void c(BaseEvent baseEvent) {
        baseEvent.getClass();
    }

    @Override // defpackage.sr7
    public final void d() {
        if (this.c) {
            this.c = false;
            fkg fkgVar = this.b;
            if (fkgVar != null) {
                fkgVar.d(null);
            }
        }
    }

    @Override // defpackage.sr7
    public final void reset() {
    }
}
