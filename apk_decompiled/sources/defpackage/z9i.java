package defpackage;

import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.capture.c;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class z9i extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z9i(int i, Object obj) {
        super(1);
        this.F = i;
        this.G = obj;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                ntd ntdVar = (ntd) obj;
                ntdVar.getClass();
                return ajk.l(ntdVar, (cbi) ((aai) obj2).a.f);
            case 1:
                ((String) obj).getClass();
                return Integer.valueOf(((AtomicInteger) ((cbf) obj2).G).getAndIncrement());
            case 2:
                ((tqb) obj).getClass();
                return (yr9) obj2;
            default:
                Date date = (Date) obj;
                date.getClass();
                ReplayIntegration replayIntegration = (ReplayIntegration) obj2;
                c cVar = replayIntegration.Q;
                if (cVar != null) {
                    cVar.m(cVar.e() + 1);
                }
                c cVar2 = replayIntegration.Q;
                if (cVar2 != null) {
                    cVar2.o(date);
                }
                return iei.a;
        }
    }
}
