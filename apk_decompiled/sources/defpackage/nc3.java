package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nc3 {
    public static final nc3 a = new nc3();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nc3) && va6.b(200.0f, 200.0f) && va6.b(76.0f, 76.0f) && va6.b(260.0f, 260.0f);
    }

    public final int hashCode() {
        return Float.hashCode(260.0f) + vb7.b(76.0f, Float.hashCode(200.0f) * 31, 31);
    }

    public final String toString() {
        String strC = va6.c(200.0f);
        String strC2 = va6.c(76.0f);
        return ij0.m(kgh.r("ChatStarterSuggestionDimensions(width=", strC, ", height=", strC2, ", overflowMaxWidth="), va6.c(260.0f), ")");
    }
}
