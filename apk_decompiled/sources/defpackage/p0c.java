package defpackage;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 p0c, still in use, count: 1, list:
  (r1v0 p0c) from 0x00e0: INVOKE (r0v15 android.util.SparseArray), (0 int), (r1v0 p0c) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class p0c {
    /* JADX INFO: Fake field, exist only in values array */
    PROXY(0),
    /* JADX INFO: Fake field, exist only in values array */
    VPN(1),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_MMS(2),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_SUPL(3),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_DUN(4),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_HIPRI(5),
    /* JADX INFO: Fake field, exist only in values array */
    WIMAX(6),
    /* JADX INFO: Fake field, exist only in values array */
    BLUETOOTH(7),
    /* JADX INFO: Fake field, exist only in values array */
    DUMMY(8),
    /* JADX INFO: Fake field, exist only in values array */
    ETHERNET(9),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_FOTA(10),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_IMS(11),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_CBS(12),
    /* JADX INFO: Fake field, exist only in values array */
    WIFI_P2P(13),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_IA(14),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_EMERGENCY(15),
    /* JADX INFO: Fake field, exist only in values array */
    PROXY(16),
    /* JADX INFO: Fake field, exist only in values array */
    VPN(17),
    NONE(-1);

    public static final SparseArray G;
    public final int E;

    static {
        p0c p0cVar = NONE;
        SparseArray sparseArray = new SparseArray();
        G = sparseArray;
        sparseArray.put(0, p0cVar);
        sparseArray.put(1, p0cVar);
        sparseArray.put(2, p0cVar);
        sparseArray.put(3, p0cVar);
        sparseArray.put(4, p0cVar);
        sparseArray.put(5, p0cVar);
        sparseArray.put(6, p0cVar);
        sparseArray.put(7, p0cVar);
        sparseArray.put(8, p0cVar);
        sparseArray.put(9, p0cVar);
        sparseArray.put(10, p0cVar);
        sparseArray.put(11, p0cVar);
        sparseArray.put(12, p0cVar);
        sparseArray.put(13, p0cVar);
        sparseArray.put(14, p0cVar);
        sparseArray.put(15, p0cVar);
        sparseArray.put(16, p0cVar);
        sparseArray.put(17, p0cVar);
        sparseArray.put(-1, p0cVar);
    }

    public p0c(int i) {
        this.E = i;
    }

    public static p0c a(int i) {
        return (p0c) G.get(i);
    }

    public static p0c valueOf(String str) {
        return (p0c) Enum.valueOf(p0c.class, str);
    }

    public static p0c[] values() {
        return (p0c[]) H.clone();
    }

    public final int b() {
        return this.E;
    }
}
