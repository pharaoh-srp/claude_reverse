package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class pb1 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof pb1);
    }

    public final int hashCode() {
        return sq6.F(2) + ((bx.Z.hashCode() + ((re4.L.hashCode() + (Integer.hashCode(FreeTypeConstants.FT_LOAD_NO_RECURSE) * 31)) * 31)) * 31);
    }

    public final String toString() {
        re4 re4Var = re4.L;
        bx bxVar = bx.Z;
        StringBuilder sb = new StringBuilder("BackPressureStrategy(capacity=1024, onThresholdReached=");
        sb.append(re4Var);
        sb.append(", onItemDropped=");
        sb.append(bxVar);
        sb.append(", backpressureMitigation=");
        return ij0.m(sb, "IGNORE_NEWEST", ")");
    }
}
