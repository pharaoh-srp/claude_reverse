package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class bz1 {
    public static final bi2 a = new bi2(-1, null, null, 0);
    public static final int b = yb5.O(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");
    public static final int c = yb5.O(yr6.INVALID_OWNERSHIP, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");
    public static final sqb d = new sqb("BUFFERED", 1);
    public static final sqb e = new sqb("SHOULD_BUFFER", 1);
    public static final sqb f = new sqb("S_RESUMING_BY_RCV", 1);
    public static final sqb g = new sqb("RESUMING_BY_EB", 1);
    public static final sqb h = new sqb("POISONED", 1);
    public static final sqb i = new sqb("DONE_RCV", 1);
    public static final sqb j = new sqb("INTERRUPTED_SEND", 1);
    public static final sqb k = new sqb("INTERRUPTED_RCV", 1);
    public static final sqb l = new sqb("CHANNEL_CLOSED", 1);
    public static final sqb m = new sqb("SUSPEND", 1);
    public static final sqb n = new sqb("SUSPEND_NO_WAITER", 1);
    public static final sqb o = new sqb("FAILED", 1);
    public static final sqb p = new sqb("NO_RECEIVE_RESULT", 1);
    public static final sqb q = new sqb("CLOSE_HANDLER_CLOSED", 1);
    public static final sqb r = new sqb("CLOSE_HANDLER_INVOKED", 1);
    public static final sqb s = new sqb("NO_CLOSE_CAUSE", 1);

    public static final boolean a(ta2 ta2Var, Object obj, rz7 rz7Var) {
        sqb sqbVarH = ta2Var.h(obj, rz7Var);
        if (sqbVarH == null) {
            return false;
        }
        ta2Var.u(sqbVarH);
        return true;
    }
}
