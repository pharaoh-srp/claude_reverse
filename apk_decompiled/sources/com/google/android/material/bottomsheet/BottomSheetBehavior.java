package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import defpackage.bwa;
import defpackage.cwa;
import defpackage.dmk;
import defpackage.f0g;
import defpackage.ive;
import defpackage.ltk;
import defpackage.mk6;
import defpackage.ru1;
import defpackage.s0e;
import defpackage.sz6;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends ltk {
    public final boolean b;
    public int c;
    public boolean d;
    public final cwa e;
    public final ColorStateList f;
    public final boolean g;
    public final f0g h;
    public boolean i;
    public final ValueAnimator j;
    public final int k;
    public final boolean l;
    public int m;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        this.b = true;
        new ive(this);
        this.m = 4;
        new ArrayList();
        new SparseIntArray();
        context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s0e.a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f = dmk.g(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.h = f0g.a(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).d();
        }
        f0g f0gVar = this.h;
        if (f0gVar != null) {
            cwa cwaVar = new cwa(f0gVar);
            this.e = cwaVar;
            cwaVar.E.b = new mk6(context);
            cwaVar.h();
            ColorStateList colorStateList = this.f;
            if (colorStateList != null) {
                cwa cwaVar2 = this.e;
                bwa bwaVar = cwaVar2.E;
                if (bwaVar.c != colorStateList) {
                    bwaVar.c = colorStateList;
                    cwaVar2.onStateChange(cwaVar2.getState());
                }
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.e.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f);
        this.j = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.j.addUpdateListener(new ru1(this));
        typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) {
            q(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            q(i);
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (this.l != z) {
            this.l = z;
            if (!z && this.m == 5 && this.m != 4) {
                this.m = 4;
            }
        }
        typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.b != z2) {
            this.b = z2;
            int i2 = (z2 && this.m == 6) ? 3 : this.m;
            if (this.m != i2) {
                this.m = i2;
            }
            r(this.m);
        }
        typedArrayObtainStyledAttributes.getBoolean(12, false);
        typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.getInt(10, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f <= MTTypesetterKt.kLineSkipLimitMultiplier || f >= 1.0f) {
            sz6.p("ratio must be a float value between 0 and 1");
            throw null;
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
            if (dimensionPixelOffset < 0) {
                sz6.p("offset must be greater than or equal to 0");
                throw null;
            }
            this.k = dimensionPixelOffset;
            r(this.m);
        } else {
            int i3 = typedValuePeekValue2.data;
            if (i3 < 0) {
                sz6.p("offset must be greater than or equal to 0");
                throw null;
            }
            this.k = i3;
            r(this.m);
        }
        typedArrayObtainStyledAttributes.getInt(11, 500);
        typedArrayObtainStyledAttributes.getBoolean(17, false);
        typedArrayObtainStyledAttributes.getBoolean(18, false);
        typedArrayObtainStyledAttributes.getBoolean(19, false);
        typedArrayObtainStyledAttributes.getBoolean(20, true);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        typedArrayObtainStyledAttributes.getBoolean(15, false);
        typedArrayObtainStyledAttributes.getBoolean(16, false);
        this.g = typedArrayObtainStyledAttributes.getBoolean(23, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void q(int i) {
        boolean z = this.d;
        if (i == -1) {
            if (z) {
                return;
            }
            this.d = true;
        } else if (z || this.c != i) {
            this.d = false;
            this.c = Math.max(0, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(int r8) {
        /*
            r7 = this;
            r0 = 2
            if (r8 != r0) goto L5
            goto L6f
        L5:
            int r8 = r7.m
            r1 = 3
            r2 = 1
            r3 = 0
            if (r8 != r1) goto L20
            boolean r8 = r7.g
            if (r8 != 0) goto L1e
            boolean r8 = r7.b
            if (r8 == 0) goto L16
            r8 = r3
            goto L1c
        L16:
            int r8 = r7.k
            int r8 = java.lang.Math.max(r8, r3)
        L1c:
            if (r8 != 0) goto L20
        L1e:
            r8 = r2
            goto L21
        L20:
            r8 = r3
        L21:
            boolean r1 = r7.i
            if (r1 == r8) goto L6f
            cwa r1 = r7.e
            if (r1 != 0) goto L2a
            goto L6f
        L2a:
            r7.i = r8
            android.animation.ValueAnimator r4 = r7.j
            r5 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r4 == 0) goto L4f
            boolean r7 = r4.isRunning()
            if (r7 == 0) goto L3d
            r4.reverse()
            return
        L3d:
            if (r8 == 0) goto L40
            goto L41
        L40:
            r5 = r6
        L41:
            float r6 = r6 - r5
            float[] r7 = new float[r0]
            r7[r3] = r6
            r7[r2] = r5
            r4.setFloatValues(r7)
            r4.start()
            return
        L4f:
            if (r4 == 0) goto L5a
            boolean r8 = r4.isRunning()
            if (r8 == 0) goto L5a
            r4.cancel()
        L5a:
            boolean r7 = r7.i
            if (r7 == 0) goto L5f
            goto L60
        L5f:
            r5 = r6
        L60:
            bwa r7 = r1.E
            float r8 = r7.i
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 == 0) goto L6f
            r7.i = r5
            r1.I = r2
            r1.invalidateSelf()
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.r(int):void");
    }

    public BottomSheetBehavior() {
        this.b = true;
        new ive(this);
        this.m = 4;
        new ArrayList();
        new SparseIntArray();
    }
}
