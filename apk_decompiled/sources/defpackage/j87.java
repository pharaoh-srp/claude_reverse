package defpackage;

import com.anthropic.claude.api.experience.CacheType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class j87 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CacheType.values().length];
        try {
            iArr[CacheType.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
