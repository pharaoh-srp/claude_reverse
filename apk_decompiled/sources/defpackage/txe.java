package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class txe extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ qh9 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ txe(qh9 qh9Var, int i) {
        super(0);
        this.F = i;
        this.G = qh9Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        qh9 qh9Var = this.G;
        switch (i) {
        }
        return String.format(Locale.US, "Error while trying to deserialize the RumEvent: %s", Arrays.copyOf(new Object[]{qh9Var}, 1));
    }
}
