package defpackage;

import android.webkit.ConsoleMessage;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class cya {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
        try {
            iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
