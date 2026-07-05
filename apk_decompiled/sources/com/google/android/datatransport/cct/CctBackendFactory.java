package com.google.android.datatransport.cct;

import android.content.Context;
import defpackage.h95;
import defpackage.j6i;
import defpackage.m81;
import defpackage.ye2;

/* JADX INFO: loaded from: classes.dex */
public class CctBackendFactory {
    public j6i create(h95 h95Var) {
        Context context = ((m81) h95Var).a;
        m81 m81Var = (m81) h95Var;
        return new ye2(context, m81Var.b, m81Var.c);
    }
}
