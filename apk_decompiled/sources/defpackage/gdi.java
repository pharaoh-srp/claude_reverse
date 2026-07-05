package defpackage;

import com.anthropic.claude.ui.demo.app.UiDemoAppDestination;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class gdi {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UiDemoAppDestination.values().length];
        try {
            iArr[UiDemoAppDestination.HOME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UiDemoAppDestination.COMMON_COMPONENTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
