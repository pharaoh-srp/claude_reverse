package defpackage;

import com.anthropic.claude.sessions.types.ConnectionStatus;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class bm {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ek6.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[ConnectionStatus.values().length];
        try {
            iArr2[ConnectionStatus.CONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ConnectionStatus.DISCONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr2;
    }
}
