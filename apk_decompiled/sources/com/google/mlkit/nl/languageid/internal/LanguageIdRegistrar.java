package com.google.mlkit.nl.languageid.internal;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.c6l;
import defpackage.e5l;
import defpackage.ffk;
import defpackage.grc;
import defpackage.iz5;
import defpackage.k2e;
import defpackage.l57;
import defpackage.lja;
import defpackage.mr9;
import defpackage.o4l;
import defpackage.o94;
import defpackage.p94;
import defpackage.xs9;
import defpackage.ys9;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LanguageIdRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        o94 o94VarB = p94.b(ffk.class);
        o94VarB.a(iz5.a(Context.class));
        o94VarB.a(new iz5(2, 0, xs9.class));
        o94VarB.f = k2e.N;
        p94 p94VarB = o94VarB.b();
        o94 o94VarB2 = p94.b(ys9.class);
        o94VarB2.a(iz5.a(ffk.class));
        o94VarB2.a(iz5.a(l57.class));
        o94VarB2.f = lja.e0;
        Object[] objArr = {p94VarB, o94VarB2.b()};
        for (int i = 0; i < 2; i++) {
            o4l o4lVar = e5l.I;
            if (objArr[i] == null) {
                mr9.h(grc.p(i, "at index "));
                return null;
            }
        }
        o4l o4lVar2 = e5l.I;
        return new c6l(2, objArr);
    }
}
