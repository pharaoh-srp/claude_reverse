package com.anthropic.claude.app.main;

import com.anthropic.claude.app.main.MainAppScreens;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.OrganizationId;
import defpackage.ae5;
import defpackage.iei;
import defpackage.jga;
import defpackage.jj;
import defpackage.rwe;
import defpackage.rz7;

/* JADX INFO: loaded from: classes.dex */
public final class i implements rz7 {
    public final /* synthetic */ rwe E;

    public i(rwe rweVar) {
        this.E = rweVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strM949unboximpl = ((AccountId) obj).m949unboximpl();
        String strM1071unboximpl = ((OrganizationId) obj2).m1071unboximpl();
        jj jjVar = (jj) obj3;
        strM949unboximpl.getClass();
        strM1071unboximpl.getClass();
        jjVar.getClass();
        this.E.E.m(new jga(10, new MainAppScreens[]{new MainAppScreens.LoggedIn(strM949unboximpl, strM1071unboximpl, jjVar, null)}), new ae5(29));
        return iei.a;
    }
}
