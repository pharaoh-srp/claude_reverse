package defpackage;

import com.anthropic.claude.bell.PlaybackPace;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class bm1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlaybackPace.values().length];
        try {
            iArr[PlaybackPace.SLOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlaybackPace.NORMAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlaybackPace.FAST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[uwc.values().length];
        try {
            iArr2[uwc.G.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[uwc.H.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
