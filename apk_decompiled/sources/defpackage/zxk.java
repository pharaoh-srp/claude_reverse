package defpackage;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zxk {
    public static c6l j;
    public static final wpj k;
    public final String a;
    public final String b;
    public final qxk c;
    public final w2g d;
    public final r5l e;
    public final r5l f;
    public final String g;
    public final int h;
    public final HashMap i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        k = new wpj(1, objArr);
    }

    public zxk(Context context, w2g w2gVar, qxk qxkVar) {
        new HashMap();
        this.a = context.getPackageName();
        this.b = y74.a(context);
        this.d = w2gVar;
        this.c = qxkVar;
        pyk.G0();
        this.g = "play-services-mlkit-language-id";
        poj pojVarI = poj.I();
        eqb eqbVar = new eqb(5, this);
        pojVarI.getClass();
        this.e = poj.L(eqbVar);
        poj pojVarI2 = poj.I();
        w2gVar.getClass();
        rxk rxkVar = new rxk(w2gVar, 1);
        pojVarI2.getClass();
        this.f = poj.L(rxkVar);
        wpj wpjVar = k;
        this.h = wpjVar.containsKey("play-services-mlkit-language-id") ? si6.d(context, (String) wpjVar.get("play-services-mlkit-language-id"), false) : -1;
    }
}
