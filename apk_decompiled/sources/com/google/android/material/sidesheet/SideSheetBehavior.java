package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.anthropic.claude.R;
import defpackage.bwa;
import defpackage.cwa;
import defpackage.dmk;
import defpackage.f0g;
import defpackage.ltk;
import defpackage.mk6;
import defpackage.s0e;
import defpackage.xzd;
import defpackage.zl4;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public class SideSheetBehavior<V extends View> extends ltk {
    public final zl4 b;
    public final cwa c;
    public final ColorStateList d;
    public final f0g e;
    public int f;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        new xzd(this);
        this.f = 5;
        new LinkedHashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s0e.m);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.d = dmk.g(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.e = f0g.a(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).d();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            typedArrayObtainStyledAttributes.getResourceId(5, -1);
        }
        f0g f0gVar = this.e;
        if (f0gVar != null) {
            cwa cwaVar = new cwa(f0gVar);
            this.c = cwaVar;
            cwaVar.E.b = new mk6(context);
            cwaVar.h();
            ColorStateList colorStateList = this.d;
            if (colorStateList != null) {
                cwa cwaVar2 = this.c;
                bwa bwaVar = cwaVar2.E;
                if (bwaVar.c != colorStateList) {
                    bwaVar.c = colorStateList;
                    cwaVar2.onStateChange(cwaVar2.getState());
                }
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.c.setTint(typedValue.data);
            }
        }
        typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        if (this.b == null) {
            this.b = new zl4(this);
        }
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public SideSheetBehavior() {
        new xzd(this);
        this.f = 5;
        new LinkedHashSet();
    }
}
