package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fza implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ vza F;

    public /* synthetic */ fza(vza vzaVar, int i) {
        this.E = i;
        this.F = vzaVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        vza vzaVar = this.F;
        switch (i) {
            case 0:
                vzaVar.e.setValue(Boolean.TRUE);
                if (vzaVar.j == 0) {
                    vzaVar.j = SystemClock.elapsedRealtime();
                }
                return ieiVar;
            case 1:
                vzaVar.d.setValue(Boolean.TRUE);
                return ieiVar;
            case 2:
                return Integer.valueOf(vzaVar.m.h());
            default:
                return Boolean.valueOf(vzaVar.c());
        }
    }
}
