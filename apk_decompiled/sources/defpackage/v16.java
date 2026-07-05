package defpackage;

import com.segment.analytics.kotlin.core.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class v16 extends ts9 implements bz7 {
    public final /* synthetic */ Settings F;
    public final /* synthetic */ int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v16(Settings settings, int i) {
        super(1);
        this.F = settings;
        this.G = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        n7d n7dVar = (n7d) obj;
        n7dVar.getClass();
        n7dVar.c(this.F, this.G);
        return iei.a;
    }
}
