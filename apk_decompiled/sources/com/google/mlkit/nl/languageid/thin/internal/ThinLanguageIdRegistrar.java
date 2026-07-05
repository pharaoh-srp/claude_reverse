package com.google.mlkit.nl.languageid.thin.internal;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.dbj;
import defpackage.efk;
import defpackage.n4l;
import defpackage.o94;
import defpackage.p94;
import defpackage.s2l;
import defpackage.w5l;
import defpackage.xs9;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ThinLanguageIdRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        o94 o94VarB = p94.b(xs9.class);
        o94VarB.e = 1;
        o94VarB.f = efk.Q;
        p94 p94VarB = o94VarB.b();
        s2l s2lVar = n4l.I;
        Object[] objArr = {p94VarB};
        dbj.b(1, objArr);
        return new w5l(1, objArr);
    }
}
