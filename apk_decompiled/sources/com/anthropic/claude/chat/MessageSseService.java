package com.anthropic.claude.chat;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.iuj;
import defpackage.n30;
import defpackage.sfa;
import defpackage.yfa;
import defpackage.zfa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class MessageSseService extends Service {
    public static final /* synthetic */ int E = 0;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        zfa.a.getClass();
        if (yfa.b()) {
            String strE = iuj.E(this);
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (arrayList.isEmpty()) {
                return;
            }
            zfa.a.getClass();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((n30) ((zfa) it.next())).b(sfa.DEBUG, strE, "MessageSseService destroyed");
            }
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
