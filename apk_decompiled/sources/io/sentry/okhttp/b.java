package io.sentry.okhttp;

import defpackage.bz7;
import defpackage.iei;
import defpackage.ts9;
import io.sentry.n7;
import io.sentry.p1;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ IOException G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(IOException iOException, int i) {
        super(1);
        this.F = i;
        this.G = iOException;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        iei ieiVar = iei.a;
        IOException iOException = this.G;
        switch (i) {
            case 0:
                p1 p1Var = (p1) obj;
                p1Var.getClass();
                p1Var.a(n7.INTERNAL_ERROR);
                p1Var.k(iOException);
                break;
            case 1:
                p1 p1Var2 = (p1) obj;
                p1Var2.getClass();
                if (!p1Var2.h()) {
                    p1Var2.a(n7.INTERNAL_ERROR);
                    p1Var2.k(iOException);
                }
                break;
            default:
                p1 p1Var3 = (p1) obj;
                p1Var3.getClass();
                if (!p1Var3.h()) {
                    p1Var3.a(n7.INTERNAL_ERROR);
                    p1Var3.k(iOException);
                }
                break;
        }
        return ieiVar;
    }
}
