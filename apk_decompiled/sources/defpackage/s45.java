package defpackage;

import com.segment.analytics.kotlin.core.BaseEvent;

/* JADX INFO: loaded from: classes.dex */
public final class s45 implements sr7 {
    public int a;
    public int b;

    @Override // defpackage.sr7
    public final boolean a() {
        return this.b >= this.a;
    }

    @Override // defpackage.sr7
    public final void b(gx gxVar) {
    }

    @Override // defpackage.sr7
    public final void c(BaseEvent baseEvent) {
        baseEvent.getClass();
        this.b++;
    }

    @Override // defpackage.sr7
    public final void d() {
    }

    @Override // defpackage.sr7
    public final void reset() {
        this.b = 0;
    }
}
