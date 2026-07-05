package defpackage;

import android.content.MutableContextWrapper;
import com.anthropic.claude.mcpapps.transport.HostContext;
import com.anthropic.claude.mcpapps.transport.SafeAreaInsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class iza implements v86 {
    public final /* synthetic */ m4a a;
    public final /* synthetic */ n6 b;
    public final /* synthetic */ vza c;
    public final /* synthetic */ HostContext d;
    public final /* synthetic */ fj0 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ bg9 g;

    public iza(m4a m4aVar, n6 n6Var, vza vzaVar, HostContext hostContext, fj0 fj0Var, String str, bg9 bg9Var) {
        this.a = m4aVar;
        this.b = n6Var;
        this.c = vzaVar;
        this.d = hostContext;
        this.e = fj0Var;
        this.f = str;
        this.g = bg9Var;
    }

    @Override // defpackage.v86
    public final void a() {
        vza vzaVar = this.c;
        aya ayaVar = vzaVar.a;
        this.a.a().c(this.b);
        zfa.a.getClass();
        boolean zB = yfa.b();
        String str = this.f;
        if (zB) {
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (!arrayList.isEmpty()) {
                String strM = ebh.m(zfa.a, "Exiting fullscreen for ", str);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.INFO, "McpAppViewHost", strM);
                }
            }
        }
        vzaVar.g.setValue(Boolean.FALSE);
        if (((Boolean) vzaVar.h.getValue()).booleanValue()) {
            return;
        }
        lok.c(vzaVar, this.g, HostContext.copy$default(this.d, null, null, null, null, null, "inline", null, null, null, new SafeAreaInsets(0, 0, 0, 0), null, null, 3423, null));
        ayaVar.setFullscreen(false);
        ayaVar.onPause();
        MutableContextWrapper mutableContextWrapper = vzaVar.b;
        mutableContextWrapper.setBaseContext(mutableContextWrapper.getApplicationContext());
        this.e.A(str);
    }
}
