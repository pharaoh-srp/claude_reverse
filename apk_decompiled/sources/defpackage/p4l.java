package defpackage;

import com.google.android.gms.internal.play_billing.e;

/* JADX INFO: loaded from: classes3.dex */
public final class p4l extends x0l {
    public final /* synthetic */ u4l L;

    public p4l(u4l u4lVar) {
        this.L = u4lVar;
    }

    @Override // defpackage.x0l
    public final String b() {
        e eVar = (e) this.L.E.get();
        return eVar == null ? "Completer object has been garbage collected, future will fail soon" : ij0.j("tag=[", String.valueOf(eVar.a), "]");
    }
}
