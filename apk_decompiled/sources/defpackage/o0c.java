package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o0c {
    public static final SparseArray E;
    public static final /* synthetic */ o0c[] F;

    /* JADX INFO: Fake field, exist only in values array */
    o0c EF1;

    static {
        o0c o0cVar = new o0c("UNKNOWN_MOBILE_SUBTYPE", 0);
        o0c o0cVar2 = new o0c("GPRS", 1);
        o0c o0cVar3 = new o0c("EDGE", 2);
        o0c o0cVar4 = new o0c("UMTS", 3);
        o0c o0cVar5 = new o0c("CDMA", 4);
        o0c o0cVar6 = new o0c("EVDO_0", 5);
        o0c o0cVar7 = new o0c("EVDO_A", 6);
        o0c o0cVar8 = new o0c("RTT", 7);
        o0c o0cVar9 = new o0c("HSDPA", 8);
        o0c o0cVar10 = new o0c("HSUPA", 9);
        o0c o0cVar11 = new o0c("HSPA", 10);
        o0c o0cVar12 = new o0c("IDEN", 11);
        o0c o0cVar13 = new o0c("EVDO_B", 12);
        o0c o0cVar14 = new o0c("LTE", 13);
        o0c o0cVar15 = new o0c("EHRPD", 14);
        o0c o0cVar16 = new o0c("HSPAP", 15);
        o0c o0cVar17 = new o0c("GSM", 16);
        o0c o0cVar18 = new o0c("TD_SCDMA", 17);
        o0c o0cVar19 = new o0c("IWLAN", 18);
        o0c o0cVar20 = new o0c("LTE_CA", 19);
        F = new o0c[]{o0cVar, o0cVar2, o0cVar3, o0cVar4, o0cVar5, o0cVar6, o0cVar7, o0cVar8, o0cVar9, o0cVar10, o0cVar11, o0cVar12, o0cVar13, o0cVar14, o0cVar15, o0cVar16, o0cVar17, o0cVar18, o0cVar19, o0cVar20, new o0c("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        E = sparseArray;
        sparseArray.put(0, o0cVar);
        sparseArray.put(1, o0cVar2);
        sparseArray.put(2, o0cVar3);
        sparseArray.put(3, o0cVar4);
        sparseArray.put(4, o0cVar5);
        sparseArray.put(5, o0cVar6);
        sparseArray.put(6, o0cVar7);
        sparseArray.put(7, o0cVar8);
        sparseArray.put(8, o0cVar9);
        sparseArray.put(9, o0cVar10);
        sparseArray.put(10, o0cVar11);
        sparseArray.put(11, o0cVar12);
        sparseArray.put(12, o0cVar13);
        sparseArray.put(13, o0cVar14);
        sparseArray.put(14, o0cVar15);
        sparseArray.put(15, o0cVar16);
        sparseArray.put(16, o0cVar17);
        sparseArray.put(17, o0cVar18);
        sparseArray.put(18, o0cVar19);
        sparseArray.put(19, o0cVar20);
    }

    public static o0c valueOf(String str) {
        return (o0c) Enum.valueOf(o0c.class, str);
    }

    public static o0c[] values() {
        return (o0c[]) F.clone();
    }
}
