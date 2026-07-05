package defpackage;

import com.anthropic.claude.sessions.types.SessionStatus;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class wo {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SessionStatus.values().length];
        try {
            iArr[SessionStatus.RUNNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SessionStatus.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SessionStatus.REQUIRES_ACTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SessionStatus.IDLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SessionStatus.ARCHIVED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SessionStatus.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
