package defpackage;

import com.anthropic.claude.api.artifacts.ArtifactVisibility;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class gwd {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[u3g.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[ArtifactVisibility.values().length];
        try {
            iArr2[ArtifactVisibility.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ArtifactVisibility.SHARED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ArtifactVisibility.PRIVATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr2;
    }
}
