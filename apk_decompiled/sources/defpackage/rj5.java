package defpackage;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class rj5 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ Map.Entry G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rj5(Map.Entry entry, int i) {
        super(0);
        this.F = i;
        this.G = entry;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        Map.Entry entry = this.G;
        switch (i) {
            case 0:
                return "\"" + entry + "\" is an invalid attribute, and was ignored.";
            case 1:
                return "\"" + entry + "\" key was in the reservedKeys set, and was dropped.";
            case 2:
                return String.format(Locale.US, "Error serializing value for key %s, value was dropped.", Arrays.copyOf(new Object[]{entry.getKey()}, 1));
            default:
                return grc.t(entry.getKey(), "Error converting value for key ", " to meta string, it will be dropped.");
        }
    }
}
