package defpackage;

import com.anthropic.claude.settings.internal.growthbook.GateKind;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class nd8 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GateKind.values().length];
        try {
            iArr[GateKind.BOOLEAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GateKind.STRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GateKind.NUMBER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[GateKind.JSON.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[GateKind.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
