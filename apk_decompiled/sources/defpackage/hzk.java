package defpackage;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class hzk {
    public static final ytj b = ytj.a(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String a;

    public hzk(Context context, w2g w2gVar) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        y74.a(context);
        synchronized (c0l.class) {
            if (c0l.F == null) {
                c0l.F = new c0l(0);
            }
        }
        this.a = "common";
        poj pojVarI = poj.I();
        eqb eqbVar = new eqb(6, this);
        pojVarI.getClass();
        poj.L(eqbVar);
        poj pojVarI2 = poj.I();
        w2gVar.getClass();
        rxk rxkVar = new rxk(w2gVar, 2);
        pojVarI2.getClass();
        poj.L(rxkVar);
        ytj ytjVar = b;
        if (ytjVar.containsKey("common")) {
            si6.d(context, (String) ytjVar.get("common"), false);
        }
    }
}
