package defpackage;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class sj5 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ Map.Entry G;
    public final /* synthetic */ String H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sj5(Map.Entry entry, String str, int i) {
        super(0);
        this.F = i;
        this.G = entry;
        this.H = str;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        String str = this.H;
        Map.Entry entry = this.G;
        switch (i) {
            case 0:
                return "Key \"" + entry.getKey() + "\" was modified to \"" + str + "\" to match our constraints.";
            default:
                return String.format(Locale.US, "Invalid timing name: %s, sanitized to: %s", Arrays.copyOf(new Object[]{entry.getKey(), str}, 2));
        }
    }
}
