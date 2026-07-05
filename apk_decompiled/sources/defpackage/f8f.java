package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class f8f extends vp4 {
    public Activity E;
    public View F;
    public Bitmap G;
    public Canvas H;
    public int[] I;
    public Iterator J;
    public View K;
    public int L;
    public int M;
    public int N;
    public /* synthetic */ Object O;
    public final /* synthetic */ j8f P;
    public int Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8f(j8f j8fVar, vp4 vp4Var) {
        super(vp4Var);
        this.P = j8fVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.O = obj;
        this.Q |= Integer.MIN_VALUE;
        return this.P.a(null, this);
    }
}
