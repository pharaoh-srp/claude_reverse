package defpackage;

import com.anthropic.claude.sessions.types.SessionLifecycleStatusV2;
import com.anthropic.claude.sessions.types.WorkerStatusV2;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class nq {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[WorkerStatusV2.values().length];
        try {
            iArr[WorkerStatusV2.RUNNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WorkerStatusV2.REQUIRES_ACTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WorkerStatusV2.IDLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[WorkerStatusV2.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[SessionLifecycleStatusV2.values().length];
        try {
            iArr2[SessionLifecycleStatusV2.ARCHIVED.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[SessionLifecycleStatusV2.ACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[SessionLifecycleStatusV2.PAUSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[SessionLifecycleStatusV2.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
