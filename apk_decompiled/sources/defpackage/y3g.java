package defpackage;

import com.anthropic.claude.api.artifacts.ArtifactVisibility;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class y3g {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ArtifactVisibility.values().length];
        try {
            iArr[ArtifactVisibility.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ArtifactVisibility.SHARED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ArtifactVisibility.PRIVATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
