package defpackage;

import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h3i {
    public static final h3i F;
    public static final h3i G;
    public static final h3i H;
    public static final h3i I;
    public static final /* synthetic */ h3i[] J;
    public String E;

    static {
        h3i h3iVar = new h3i("DATADOG", 0);
        F = h3iVar;
        h3i h3iVar2 = new h3i("B3SINGLE", 1);
        G = h3iVar2;
        h3i h3iVar3 = new h3i("B3MULTI", 2);
        H = h3iVar3;
        h3i h3iVar4 = new h3i("HAYSTACK", 3);
        h3i h3iVar5 = new h3i("XRAY", 4);
        h3i h3iVar6 = new h3i("TRACECONTEXT", 5);
        I = h3iVar6;
        J = new h3i[]{h3iVar, h3iVar2, h3iVar3, h3iVar4, h3iVar5, h3iVar6, new h3i("NONE", 6)};
    }

    public static h3i a(String str) {
        String strReplace = str.toUpperCase(Locale.US).replace(' ', '_');
        strReplace.getClass();
        return !strReplace.equals("B3_SINGLE_HEADER") ? !strReplace.equals("B3") ? valueOf(strReplace) : H : G;
    }

    public static h3i valueOf(String str) {
        return (h3i) Enum.valueOf(h3i.class, str);
    }

    public static h3i[] values() {
        return (h3i[]) J.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        String str = this.E;
        if (str != null) {
            return str;
        }
        String strReplace = name().toLowerCase(Locale.ROOT).replace('_', ' ');
        this.E = strReplace;
        return strReplace;
    }
}
