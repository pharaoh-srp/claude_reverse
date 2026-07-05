package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hib {
    public static <E> int drain(gib gibVar, fib fibVar, int i) {
        int i2 = 0;
        if (fibVar == null) {
            sz6.p("c is null");
            return 0;
        }
        if (i < 0) {
            sz6.p(grc.p(i, "limit is negative: "));
            return 0;
        }
        if (i == 0) {
            return 0;
        }
        while (i2 < i) {
            Object objRelaxedPoll = ((etb) gibVar).relaxedPoll();
            if (objRelaxedPoll == null) {
                break;
            }
            ((rwc) objRelaxedPoll).a();
            i2++;
        }
        return i2;
    }
}
