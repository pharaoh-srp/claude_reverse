package io.sentry.android.replay;

import defpackage.bz7;
import defpackage.dae;
import defpackage.ts9;
import defpackage.z9e;
import io.sentry.t5;
import io.sentry.w6;
import io.sentry.y6;
import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ long G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Serializable I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(long j, Object obj, Serializable serializable, int i) {
        super(1);
        this.F = i;
        this.G = j;
        this.H = obj;
        this.I = serializable;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        Serializable serializable = this.I;
        long j = this.G;
        Object obj2 = this.H;
        switch (i) {
            case 0:
                m mVar = (m) obj;
                mVar.getClass();
                if (mVar.b >= j) {
                    dae daeVar = (dae) serializable;
                    if (daeVar.E == null) {
                        daeVar.E = mVar.c;
                    }
                } else {
                    ((l) obj2).d(mVar.a);
                }
                break;
            default:
                io.sentry.android.replay.capture.i iVar = (io.sentry.android.replay.capture.i) obj;
                io.sentry.android.replay.capture.f fVar = (io.sentry.android.replay.capture.f) obj2;
                iVar.getClass();
                y6 y6Var = iVar.a;
                if (y6Var.Y.getTime() < j) {
                    fVar.m(fVar.e() - 1);
                    File file = y6Var.T;
                    w6 w6Var = fVar.t;
                    if (file != null) {
                        try {
                            if (!file.delete()) {
                                w6Var.getLogger().h(t5.ERROR, "Failed to delete replay segment: %s", file.getAbsolutePath());
                            }
                        } catch (Throwable th) {
                            w6Var.getLogger().b(t5.ERROR, th, "Failed to delete replay segment: %s", file.getAbsolutePath());
                        }
                    }
                    ((z9e) serializable).E = true;
                    break;
                }
                break;
        }
        return Boolean.FALSE;
    }
}
