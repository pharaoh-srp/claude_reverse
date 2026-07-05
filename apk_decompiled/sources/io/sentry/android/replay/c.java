package io.sentry.android.replay;

import defpackage.bsg;
import defpackage.bz7;
import defpackage.ova;
import defpackage.ts9;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends ts9 implements bz7 {
    public static final c G;
    public static final c H;
    public final /* synthetic */ int F;

    static {
        int i = 1;
        G = new c(i, 0);
        H = new c(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, int i2) {
        super(i);
        this.F = i2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        switch (this.F) {
            case 0:
                ova ovaVar = (ova) obj;
                ovaVar.getClass();
                String upperCase = String.valueOf(bsg.J0(ovaVar.c())).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                return upperCase;
            default:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return ((String) entry.getKey()) + '=' + ((String) entry.getValue());
        }
    }
}
