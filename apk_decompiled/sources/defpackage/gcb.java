package defpackage;

import com.anthropic.claude.api.account.MemoryMode;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class gcb {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MemoryMode.values().length];
        try {
            iArr[MemoryMode.MELANGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MemoryMode.CLASSIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MemoryMode.OFF.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MemoryMode.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
