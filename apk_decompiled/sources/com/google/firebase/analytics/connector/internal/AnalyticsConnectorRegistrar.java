package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.da4;
import defpackage.dgj;
import defpackage.f7i;
import defpackage.g6j;
import defpackage.gv6;
import defpackage.hx;
import defpackage.ix;
import defpackage.iz5;
import defpackage.j6k;
import defpackage.mvg;
import defpackage.o94;
import defpackage.p94;
import defpackage.pl7;
import defpackage.rf5;
import defpackage.sz6;
import defpackage.x44;
import defpackage.z46;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static hx lambda$getComponents$0(da4 da4Var) {
        boolean z;
        pl7 pl7Var = (pl7) da4Var.a(pl7.class);
        Context context = (Context) da4Var.a(Context.class);
        mvg mvgVar = (mvg) da4Var.a(mvg.class);
        dgj.v(pl7Var);
        dgj.v(context);
        dgj.v(mvgVar);
        dgj.v(context.getApplicationContext());
        if (ix.b == null) {
            synchronized (ix.class) {
                if (ix.b == null) {
                    int i = 1;
                    Bundle bundle = new Bundle(1);
                    pl7Var.a();
                    if ("[DEFAULT]".equals(pl7Var.b)) {
                        ((gv6) mvgVar).a(new z46(2), new g6j(i));
                        pl7Var.a();
                        rf5 rf5Var = (rf5) pl7Var.g.get();
                        synchronized (rf5Var) {
                            z = rf5Var.a;
                        }
                        bundle.putBoolean("dataCollectionDefaultEnabled", z);
                    }
                    ix.b = new ix(j6k.a(context, bundle).d);
                }
            }
        }
        return ix.b;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<p94> getComponents() {
        o94 o94VarB = p94.b(hx.class);
        o94VarB.a(iz5.a(pl7.class));
        o94VarB.a(iz5.a(Context.class));
        o94VarB.a(iz5.a(mvg.class));
        o94VarB.f = new f7i(2);
        if (o94VarB.d == 0) {
            o94VarB.d = 2;
            return Arrays.asList(o94VarB.b(), x44.D("fire-analytics", "22.1.0"));
        }
        sz6.j("Instantiation type has already been set.");
        return null;
    }
}
