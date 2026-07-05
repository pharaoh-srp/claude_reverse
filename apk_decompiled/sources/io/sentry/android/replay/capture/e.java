package io.sentry.android.replay.capture;

import defpackage.bz7;
import defpackage.iei;
import defpackage.ts9;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ f G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i) {
        super(1);
        this.F = i;
        this.G = fVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        iei ieiVar = iei.a;
        f fVar = this.G;
        switch (i) {
            case 0:
                k kVar = (k) obj;
                kVar.getClass();
                if (kVar instanceof i) {
                    fVar.x.add(kVar);
                    fVar.m(fVar.e() + 1);
                }
                break;
            default:
                k kVar2 = (k) obj;
                kVar2.getClass();
                if (kVar2 instanceof i) {
                    fVar.x.add(kVar2);
                    fVar.m(fVar.e() + 1);
                }
                break;
        }
        return ieiVar;
    }
}
