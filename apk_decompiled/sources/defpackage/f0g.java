package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class f0g {
    public rtk a;
    public rtk b;
    public rtk c;
    public rtk d;
    public s35 e;
    public s35 f;
    public s35 g;
    public s35 h;
    public hj6 i;
    public hj6 j;
    public hj6 k;
    public hj6 l;

    public static g81 a(Context context, AttributeSet attributeSet, int i, int i2) {
        y yVar = new y(MTTypesetterKt.kLineSkipLimitMultiplier);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s0e.h, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, resourceId2);
        }
        TypedArray typedArrayObtainStyledAttributes2 = contextThemeWrapper.obtainStyledAttributes(s0e.l);
        try {
            int i3 = typedArrayObtainStyledAttributes2.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes2.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes2.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes2.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes2.getInt(1, i3);
            s35 s35VarB = b(typedArrayObtainStyledAttributes2, 5, yVar);
            s35 s35VarB2 = b(typedArrayObtainStyledAttributes2, 8, s35VarB);
            s35 s35VarB3 = b(typedArrayObtainStyledAttributes2, 9, s35VarB);
            s35 s35VarB4 = b(typedArrayObtainStyledAttributes2, 7, s35VarB);
            s35 s35VarB5 = b(typedArrayObtainStyledAttributes2, 6, s35VarB);
            g81 g81Var = new g81(3);
            g81Var.a = gmk.f(i4);
            g81Var.e = s35VarB2;
            g81Var.b = gmk.f(i5);
            g81Var.f = s35VarB3;
            g81Var.c = gmk.f(i6);
            g81Var.g = s35VarB4;
            g81Var.d = gmk.f(i7);
            g81Var.h = s35VarB5;
            return g81Var;
        } finally {
            typedArrayObtainStyledAttributes2.recycle();
        }
    }

    public static s35 b(TypedArray typedArray, int i, s35 s35Var) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new y(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new dee(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return s35Var;
    }

    public final boolean c(RectF rectF) {
        boolean z = this.l.getClass().equals(hj6.class) && this.j.getClass().equals(hj6.class) && this.i.getClass().equals(hj6.class) && this.k.getClass().equals(hj6.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.b instanceof zve) && (this.a instanceof zve) && (this.c instanceof zve) && (this.d instanceof zve));
    }

    public final g81 d() {
        g81 g81Var = new g81();
        g81Var.a = this.a;
        g81Var.b = this.b;
        g81Var.c = this.c;
        g81Var.d = this.d;
        g81Var.e = this.e;
        g81Var.f = this.f;
        g81Var.g = this.g;
        g81Var.h = this.h;
        g81Var.i = this.i;
        g81Var.j = this.j;
        g81Var.k = this.k;
        g81Var.l = this.l;
        return g81Var;
    }
}
