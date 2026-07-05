package io.sentry.android.replay.capture;

import defpackage.iei;
import defpackage.ts9;
import defpackage.zy7;
import io.sentry.android.replay.y;
import io.sentry.p;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ c I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Object obj2, c cVar, int i) {
        super(0);
        this.F = i;
        this.G = obj;
        this.H = obj2;
        this.I = cVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        Object obj = this.G;
        iei ieiVar = iei.a;
        c cVar = this.I;
        Object obj2 = this.H;
        switch (i) {
            case 0:
                io.sentry.android.replay.l lVar = cVar.h;
                if (lVar != null) {
                    lVar.f("replay.id", String.valueOf(obj2));
                }
                break;
            case 1:
                y yVar = (y) obj2;
                if (yVar != null) {
                    io.sentry.android.replay.l lVar2 = cVar.h;
                    if (lVar2 != null) {
                        lVar2.f("config.height", String.valueOf(yVar.b));
                    }
                    io.sentry.android.replay.l lVar3 = cVar.h;
                    if (lVar3 != null) {
                        lVar3.f("config.width", String.valueOf(yVar.a));
                    }
                    io.sentry.android.replay.l lVar4 = cVar.h;
                    if (lVar4 != null) {
                        lVar4.f("config.frame-rate", String.valueOf(yVar.e));
                    }
                    io.sentry.android.replay.l lVar5 = cVar.h;
                    if (lVar5 != null) {
                        lVar5.f("config.bit-rate", String.valueOf(yVar.f));
                    }
                }
                break;
            case 2:
                Date date = (Date) obj2;
                io.sentry.android.replay.l lVar6 = cVar.h;
                if (lVar6 != null) {
                    lVar6.f("segment.timestamp", date == null ? null : p.o(date));
                }
                break;
            default:
                io.sentry.android.replay.l lVar7 = cVar.h;
                if (lVar7 != null) {
                    lVar7.f("replay.screen-at-start", String.valueOf(obj2));
                }
                break;
        }
        return ieiVar;
    }
}
