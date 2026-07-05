package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import defpackage.bgd;
import defpackage.fj0;
import defpackage.fw4;
import defpackage.g91;
import defpackage.n6i;
import defpackage.us;
import defpackage.wk;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        n6i.b(context);
        fj0 fj0VarA = g91.a();
        fj0VarA.J(queryParameter);
        fj0VarA.G = bgd.b(iIntValue);
        if (queryParameter2 != null) {
            fj0VarA.F = Base64.decode(queryParameter2, 0);
        }
        wk wkVar = n6i.a().d;
        ((Executor) wkVar.g).execute(new fw4(wkVar, fj0VarA.h(), i, new us()));
    }
}
