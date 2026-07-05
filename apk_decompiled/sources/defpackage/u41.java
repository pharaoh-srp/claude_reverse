package defpackage;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u41 implements nyg {
    public final /* synthetic */ int E;
    public final /* synthetic */ Context F;

    public /* synthetic */ u41(Context context, int i) {
        this.E = i;
        this.F = context;
    }

    @Override // defpackage.nyg
    public final Object get() {
        yp5 yp5Var;
        int i = this.E;
        Context context = this.F;
        switch (i) {
            case 0:
                return x41.j(context);
            case 1:
                return new epk(context, 15);
            case 2:
                return new os5(new qb5(context, 15), new gr5());
            case 3:
                return new gv5(context);
            default:
                vde vdeVar = yp5.p;
                synchronized (yp5.class) {
                    try {
                        if (yp5.v == null) {
                            Context applicationContext = context == null ? null : context.getApplicationContext();
                            HashMap map = new HashMap(8);
                            map.put(0, 1000000L);
                            map.put(2, -9223372036854775807L);
                            map.put(3, -9223372036854775807L);
                            map.put(4, -9223372036854775807L);
                            map.put(5, -9223372036854775807L);
                            map.put(10, -9223372036854775807L);
                            map.put(9, -9223372036854775807L);
                            map.put(7, -9223372036854775807L);
                            yp5.v = new yp5(applicationContext, map);
                        }
                        yp5Var = yp5.v;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return yp5Var;
        }
    }
}
