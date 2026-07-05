package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class ht5 implements h9f {
    public final /* synthetic */ it5 a;

    public ht5(it5 it5Var) {
        this.a = it5Var;
    }

    @Override // defpackage.h9f
    public final float b(float f) {
        if (Float.isNaN(f)) {
            return MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        it5 it5Var = this.a;
        float fFloatValue = ((Number) it5Var.a.invoke(Float.valueOf(f))).floatValue();
        it5Var.e.setValue(Boolean.valueOf(fFloatValue > MTTypesetterKt.kLineSkipLimitMultiplier));
        it5Var.f.setValue(Boolean.valueOf(fFloatValue < MTTypesetterKt.kLineSkipLimitMultiplier));
        return fFloatValue;
    }
}
