package defpackage;

import com.datadog.android.rum.internal.domain.scope.r;

/* JADX INFO: loaded from: classes.dex */
public final class aze implements j0j {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ aze(r rVar, int i) {
        this.a = i;
        this.b = rVar;
    }

    @Override // defpackage.j0j
    public final void a(i0j i0jVar) {
        int i = this.a;
        r rVar = this.b;
        switch (i) {
            case 0:
                rVar.c0 = i0jVar;
                break;
            default:
                rVar.a0 = i0jVar;
                rVar.u.getClass();
                break;
        }
    }
}
