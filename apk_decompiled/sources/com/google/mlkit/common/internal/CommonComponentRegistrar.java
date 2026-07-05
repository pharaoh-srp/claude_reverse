package com.google.mlkit.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.a5;
import defpackage.dd8;
import defpackage.dfe;
import defpackage.dsj;
import defpackage.efe;
import defpackage.efk;
import defpackage.grc;
import defpackage.iz5;
import defpackage.k2e;
import defpackage.l57;
import defpackage.lz1;
import defpackage.mr9;
import defpackage.o94;
import defpackage.p94;
import defpackage.ql8;
import defpackage.trj;
import defpackage.un3;
import defpackage.unb;
import defpackage.w2g;
import defpackage.wkb;
import defpackage.xkb;
import defpackage.xsj;
import defpackage.zp3;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        p94 p94Var = w2g.b;
        o94 o94VarB = p94.b(unb.class);
        o94VarB.a(iz5.a(wkb.class));
        o94VarB.f = unb.S;
        p94 p94VarB = o94VarB.b();
        o94 o94VarB2 = p94.b(xkb.class);
        o94VarB2.f = lz1.T;
        p94 p94VarB2 = o94VarB2.b();
        o94 o94VarB3 = p94.b(efe.class);
        o94VarB3.a(new iz5(2, 0, dfe.class));
        o94VarB3.f = a5.P;
        p94 p94VarB3 = o94VarB3.b();
        o94 o94VarB4 = p94.b(l57.class);
        o94VarB4.a(new iz5(1, 1, xkb.class));
        o94VarB4.f = zp3.a0;
        p94 p94VarB4 = o94VarB4.b();
        o94 o94VarB5 = p94.b(un3.class);
        o94VarB5.f = dd8.P;
        p94 p94VarB5 = o94VarB5.b();
        o94 o94VarB6 = p94.b(zp3.class);
        o94VarB6.a(iz5.a(un3.class));
        o94VarB6.f = ql8.O;
        p94 p94VarB6 = o94VarB6.b();
        o94 o94VarB7 = p94.b(efk.class);
        o94VarB7.a(iz5.a(wkb.class));
        o94VarB7.f = unb.T;
        p94 p94VarB7 = o94VarB7.b();
        o94 o94VarB8 = p94.b(dfe.class);
        o94VarB8.e = 1;
        o94VarB8.a(new iz5(1, 1, efk.class));
        o94VarB8.f = k2e.O;
        Object[] objArr = {p94Var, p94VarB, p94VarB2, p94VarB3, p94VarB4, p94VarB5, p94VarB6, p94VarB7, o94VarB8.b()};
        for (int i = 0; i < 9; i++) {
            trj trjVar = dsj.I;
            if (objArr[i] == null) {
                mr9.h(grc.p(i, "at index "));
                return null;
            }
        }
        trj trjVar2 = dsj.I;
        return new xsj(9, objArr);
    }
}
