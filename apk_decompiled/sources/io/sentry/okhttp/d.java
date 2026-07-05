package io.sentry.okhttp;

import defpackage.bz7;
import defpackage.iei;
import defpackage.pqe;
import defpackage.ts9;
import defpackage.w44;
import io.sentry.n7;
import io.sentry.p1;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, Object obj) {
        super(1);
        this.F = i;
        this.G = obj;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        iei ieiVar = iei.a;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                p1 p1Var = (p1) obj;
                p1Var.getClass();
                List list = (List) obj2;
                if (!list.isEmpty()) {
                    p1Var.f("proxies", w44.S0(list, null, null, null, c.H, 31));
                }
                break;
            default:
                p1 p1Var2 = (p1) obj;
                p1Var2.getClass();
                int i2 = ((pqe) obj2).H;
                p1Var2.f("http.response.status_code", Integer.valueOf(i2));
                if (p1Var2.e() == null) {
                    p1Var2.a(n7.fromHttpStatusCode(i2));
                }
                break;
        }
        return ieiVar;
    }
}
