package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class q5a extends ae2 {
    public final ArrayList F;
    public final float G;

    public q5a(ArrayList arrayList, float f) {
        super(arrayList);
        this.F = arrayList;
        this.G = f;
    }

    @Override // defpackage.ae2
    public final ae2 a(ArrayList arrayList, ae2 ae2Var, float f) {
        q5a q5aVar = (q5a) ae2Var;
        Float fValueOf = q5aVar != null ? Float.valueOf(q5aVar.G) : null;
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : MTTypesetterKt.kLineSkipLimitMultiplier;
        return new q5a(arrayList, sq6.k(this.G, fFloatValue, f, fFloatValue));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5a)) {
            return false;
        }
        q5a q5aVar = (q5a) obj;
        return x44.r(this.F, q5aVar.F) && this.G == q5aVar.G;
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return Float.hashCode(this.G) + (this.F.hashCode() * 31);
    }
}
