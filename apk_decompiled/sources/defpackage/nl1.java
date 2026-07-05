package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nl1 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Context F;

    public /* synthetic */ nl1(Context context, int i) {
        this.E = i;
        this.F = context;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        Context context = this.F;
        switch (i) {
            case 0:
                ((w86) obj).getClass();
                return new o10(5, context);
            case 1:
                String str = (String) obj;
                str.getClass();
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return ieiVar;
            case 2:
                Uri uri = (Uri) obj;
                uri.getClass();
                try {
                    context.startActivity(new Intent("android.intent.action.VIEW", uri).addFlags(268435456));
                    break;
                } catch (Exception e) {
                    zfa.a.getClass();
                    if (yfa.b()) {
                        CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : copyOnWriteArrayList) {
                            ((n30) ((zfa) obj2)).getClass();
                            arrayList.add(obj2);
                        }
                        if (!arrayList.isEmpty()) {
                            zfa.a.getClass();
                            String str2 = "No activity for " + uri + ": " + gsk.c(e);
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((n30) ((zfa) it.next())).b(sfa.WARN, "Conway", str2);
                            }
                        }
                    }
                }
                return ieiVar;
            default:
                sk8 sk8Var = (sk8) obj;
                sk8Var.getClass();
                String string = context.getString(sk8Var.b);
                string.getClass();
                return string;
        }
    }
}
