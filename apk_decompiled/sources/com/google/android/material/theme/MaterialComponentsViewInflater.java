package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.anthropic.claude.R;
import defpackage.amk;
import defpackage.awa;
import defpackage.dmk;
import defpackage.dtj;
import defpackage.fwa;
import defpackage.hg0;
import defpackage.jg0;
import defpackage.ji0;
import defpackage.kg0;
import defpackage.kh0;
import defpackage.ri0;
import defpackage.s0e;
import defpackage.sva;
import defpackage.vva;
import defpackage.ywj;
import defpackage.zva;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends ri0 {
    @Override // defpackage.ri0
    public final hg0 a(Context context, AttributeSet attributeSet) {
        return new sva(context, attributeSet);
    }

    @Override // defpackage.ri0
    public final jg0 b(Context context, AttributeSet attributeSet) {
        return new vva(context, attributeSet);
    }

    @Override // defpackage.ri0
    public final kg0 c(Context context, AttributeSet attributeSet) {
        return new zva(context, attributeSet);
    }

    @Override // defpackage.ri0
    public final kh0 d(Context context, AttributeSet attributeSet) {
        awa awaVar = new awa(dtj.o(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = awaVar.getContext();
        ywj.f(context2, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton);
        int[] iArr = s0e.g;
        ywj.g(context2, attributeSet, iArr, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            awaVar.setButtonTintList(dmk.g(context2, typedArrayObtainStyledAttributes, 0));
        }
        awaVar.J = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        return awaVar;
    }

    @Override // defpackage.ri0
    public final ji0 e(Context context, AttributeSet attributeSet) {
        fwa fwaVar = new fwa(dtj.o(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = fwaVar.getContext();
        if (amk.h(R.attr.textAppearanceLineHeightEnabled, context2, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = s0e.j;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int iG = fwa.g(context2, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iG == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, s0e.i);
                    int iG2 = fwa.g(fwaVar.getContext(), typedArrayObtainStyledAttributes3, 1, 2);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iG2 >= 0) {
                        fwaVar.setLineHeight(iG2);
                    }
                }
            }
        }
        return fwaVar;
    }
}
