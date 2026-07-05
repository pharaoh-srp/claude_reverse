package io.sentry.android.replay.capture;

import defpackage.bz7;
import defpackage.iei;
import defpackage.ts9;
import io.sentry.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ n G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, int i) {
        super(1);
        this.F = i;
        this.G = nVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        iei ieiVar = iei.a;
        n nVar = this.G;
        switch (i) {
            case 0:
                k kVar = (k) obj;
                kVar.getClass();
                if (kVar instanceof i) {
                    i iVar = (i) kVar;
                    iVar.a(nVar.u, new n0());
                    nVar.m(nVar.e() + 1);
                    nVar.o(iVar.a.Y);
                }
                break;
            default:
                k kVar2 = (k) obj;
                kVar2.getClass();
                if (kVar2 instanceof i) {
                    ((i) kVar2).a(nVar.u, new n0());
                    nVar.m(nVar.e() + 1);
                }
                break;
        }
        return ieiVar;
    }
}
