package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class o71 {
    public static final /* synthetic */ o71 a = new o71();
    public static final ide b = new ide("claude-[a-z]+-4(?:$|-(?:[0-5](?!\\d)|\\d{8}))");

    public static s71 a(boolean z, Boolean bool, boolean z2, boolean z3, boolean z4, String str, boolean z5) {
        if (!z || (!z2 && x44.r(bool, Boolean.FALSE))) {
            return q71.b;
        }
        if (!z3 && !z5 && !z4) {
            return new p71(r71.F);
        }
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (bsg.u0(lowerCase, "claude-3-", false) || b.a(lowerCase)) {
                return new p71(r71.E);
            }
        }
        return n71.b;
    }
}
