package defpackage;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes.dex */
public abstract class jz {
    public static final Canvas a = new Canvas();

    public static final iz a(Canvas canvas) {
        iz izVar = new iz();
        izVar.a = canvas;
        return izVar;
    }

    public static final Canvas b(fb2 fb2Var) {
        fb2Var.getClass();
        return ((iz) fb2Var).a;
    }
}
