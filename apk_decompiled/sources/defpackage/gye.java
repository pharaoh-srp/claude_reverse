package defpackage;

import com.datadog.android.rum.internal.domain.scope.c;

/* JADX INFO: loaded from: classes3.dex */
public final class gye extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ sxe G;
    public final /* synthetic */ c H;
    public final /* synthetic */ long I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gye(sxe sxeVar, c cVar, long j, int i) {
        super(1);
        this.F = i;
        this.G = sxeVar;
        this.H = cVar;
        this.I = j;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        iei ieiVar = iei.a;
        long j = this.I;
        c cVar = this.H;
        sxe sxeVar = this.G;
        switch (i) {
            case 0:
                hf hfVar = (hf) obj;
                hfVar.getClass();
                String str = sxeVar.d;
                hfVar.h(str != null ? str : "", new sog(Long.valueOf(j), cVar.j));
                break;
            default:
                hf hfVar2 = (hf) obj;
                hfVar2.getClass();
                String str2 = sxeVar.d;
                hfVar2.i(str2 != null ? str2 : "", new sog(Long.valueOf(j), cVar.j));
                break;
        }
        return ieiVar;
    }
}
