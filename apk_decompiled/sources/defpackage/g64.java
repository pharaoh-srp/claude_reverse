package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class g64 extends ae2 {
    public final ArrayList F;
    public final float G;

    public g64(ArrayList arrayList, float f) {
        super(arrayList);
        this.F = arrayList;
        this.G = f;
    }

    @Override // defpackage.ae2
    public final ae2 a(ArrayList arrayList, ae2 ae2Var, float f) {
        g64 g64Var = (g64) ae2Var;
        Float fValueOf = g64Var != null ? Float.valueOf(g64Var.G) : null;
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : MTTypesetterKt.kLineSkipLimitMultiplier;
        return new g64(arrayList, sq6.k(this.G, fFloatValue, f, fFloatValue));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g64)) {
            return false;
        }
        g64 g64Var = (g64) obj;
        return x44.r(this.F, g64Var.F) && this.G == g64Var.G;
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return Float.hashCode(this.G) + (this.F.hashCode() * 31);
    }
}
