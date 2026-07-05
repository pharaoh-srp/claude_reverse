package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class bbf extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ String G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bbf(String str, int i) {
        super(0);
        this.F = i;
        this.G = str;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        String str = this.G;
        switch (i) {
        }
        return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
    }
}
