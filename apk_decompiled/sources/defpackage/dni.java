package defpackage;

import com.anthropic.claude.tool.model.UserLocationV0OutputUserLocationErrorErrorType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class dni {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UserLocationV0OutputUserLocationErrorErrorType.values().length];
        try {
            iArr[UserLocationV0OutputUserLocationErrorErrorType.APP_PERMISSION_DENIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UserLocationV0OutputUserLocationErrorErrorType.SYSTEM_PERMISSION_DENIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
