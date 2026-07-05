package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n34 extends m08 implements bz7 {
    public static final n34 E = new n34(1, rgf.class, "<init>", "<init>(Landroid/content/Context;)V", 0);

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        context.getClass();
        rgf rgfVar = new rgf(context);
        rgfVar.setTextIsSelectable(true);
        return rgfVar;
    }
}
