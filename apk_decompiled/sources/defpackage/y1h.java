package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class y1h extends ts9 implements zy7 {
    public final /* synthetic */ short F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1h(short s) {
        super(0);
        this.F = s;
    }

    @Override // defpackage.zy7
    public final Object a() {
        return String.format(Locale.US, "TLV header corrupt. Invalid type %s", Arrays.copyOf(new Object[]{Short.valueOf(this.F)}, 1));
    }
}
