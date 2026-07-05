package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ozd {
    public static final ozd E;
    public static final /* synthetic */ ozd[] F;

    static {
        ozd ozdVar = new ozd("DEFAULT", 0);
        E = ozdVar;
        ozd ozdVar2 = new ozd("UNMETERED_ONLY", 1);
        ozd ozdVar3 = new ozd("UNMETERED_OR_DAILY", 2);
        ozd ozdVar4 = new ozd("FAST_IF_RADIO_AWAKE", 3);
        ozd ozdVar5 = new ozd("NEVER", 4);
        ozd ozdVar6 = new ozd("UNRECOGNIZED", 5);
        F = new ozd[]{ozdVar, ozdVar2, ozdVar3, ozdVar4, ozdVar5, ozdVar6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, ozdVar);
        sparseArray.put(1, ozdVar2);
        sparseArray.put(2, ozdVar3);
        sparseArray.put(3, ozdVar4);
        sparseArray.put(4, ozdVar5);
        sparseArray.put(-1, ozdVar6);
    }

    public static ozd valueOf(String str) {
        return (ozd) Enum.valueOf(ozd.class, str);
    }

    public static ozd[] values() {
        return (ozd[]) F.clone();
    }
}
