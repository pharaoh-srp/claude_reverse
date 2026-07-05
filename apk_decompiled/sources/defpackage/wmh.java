package defpackage;

import android.content.Context;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class wmh implements lp3 {
    public final /* synthetic */ xmh E;

    public wmh(xmh xmhVar) {
        this.E = xmhVar;
    }

    @Override // defpackage.lp3
    public final Object w(Context context, Object obj, String str, cxh cxhVar) {
        xmh xmhVar = this.E;
        return gb9.c0(xmhVar.h.b(), new v2h(xmhVar, context, (JsonObject) obj, null, 7), cxhVar);
    }
}
