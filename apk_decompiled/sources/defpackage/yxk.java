package defpackage;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class yxk {
    public static w5l i;
    public static final wpj j;
    public final String a;
    public final String b;
    public final pxk c;
    public final w2g d;
    public final r5l e;
    public final r5l f;
    public final String g;
    public final int h;

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        j = new wpj(0, objArr);
    }

    public yxk(Context context, w2g w2gVar, pxk pxkVar) {
        new HashMap();
        new HashMap();
        this.a = context.getPackageName();
        this.b = y74.a(context);
        this.d = w2gVar;
        this.c = pxkVar;
        lyk.v();
        this.g = "play-services-mlkit-language-id";
        poj pojVarI = poj.I();
        eqb eqbVar = new eqb(4, this);
        pojVarI.getClass();
        this.e = poj.L(eqbVar);
        poj pojVarI2 = poj.I();
        w2gVar.getClass();
        rxk rxkVar = new rxk(w2gVar, 0);
        pojVarI2.getClass();
        this.f = poj.L(rxkVar);
        wpj wpjVar = j;
        this.h = wpjVar.containsKey("play-services-mlkit-language-id") ? si6.d(context, (String) wpjVar.get("play-services-mlkit-language-id"), false) : -1;
    }
}
