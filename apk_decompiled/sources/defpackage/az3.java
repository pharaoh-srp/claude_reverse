package defpackage;

import android.content.Context;
import androidx.core.content.FileProvider;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class az3 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Context F;
    public final /* synthetic */ bz7 G;

    public /* synthetic */ az3(Context context, bz7 bz7Var, int i) {
        this.E = i;
        this.F = context;
        this.G = bz7Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        bz7 bz7Var = this.G;
        Context context = this.F;
        File file = (File) obj;
        switch (i) {
            case 0:
                if (file != null) {
                    bz7Var.invoke(x44.W(FileProvider.d(context, context.getPackageName() + ".provider", file)));
                }
                break;
            default:
                if (file != null) {
                    bz7Var.invoke(x44.W(FileProvider.d(context, context.getPackageName() + ".provider", file)));
                }
                break;
        }
        return ieiVar;
    }
}
