package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class jp5 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ String G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jp5(String str, int i) {
        super(0);
        this.F = i;
        this.G = str;
    }

    @Override // defpackage.zy7
    public final Object a() {
        String strValueOf;
        int i = this.F;
        String str = this.G;
        switch (i) {
            case 0:
                if (str.length() <= 0) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                char cCharAt = str.charAt(0);
                if (Character.isLowerCase(cCharAt)) {
                    Locale locale = Locale.US;
                    locale.getClass();
                    strValueOf = gb9.a0(cCharAt, locale);
                } else {
                    strValueOf = String.valueOf(cCharAt);
                }
                sb.append((Object) strValueOf);
                sb.append(str.substring(1));
                return sb.toString();
            case 1:
                return ij0.i("[ViewNetworkSettledMetric] The view was not yet created for this viewId:", str);
            default:
                return "Kronos onError @host:".concat(str);
        }
    }
}
