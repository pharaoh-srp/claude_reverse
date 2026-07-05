package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class fx extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ mff G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fx(mff mffVar, int i) {
        super(0);
        this.F = i;
        this.G = mffVar;
    }

    @Override // defpackage.zy7
    public final Object a() throws IOException {
        int i = this.F;
        mff mffVar = this.G;
        switch (i) {
            case 0:
                eg4 eg4Var = mffVar.E;
                zp3 zp3Var = eg4Var.c;
                Object[] objArr = {mffVar, eg4Var.b};
                int i2 = 2;
                if (objArr.length >= 2) {
                    Object obj = objArr[0];
                    if (obj instanceof gx) {
                        Object obj2 = objArr[1];
                        if (obj2 instanceof Context) {
                            gx gxVar = (gx) obj;
                            el5 el5Var = gxVar.F;
                            obj2.getClass();
                            Context context = (Context) obj2;
                            eg4 eg4Var2 = gxVar.E;
                            File dir = context.getDir("segment-disk-queue", 0);
                            String str = eg4Var2.a;
                            String strConcat = "segment.events.file.index.".concat(str);
                            SharedPreferences sharedPreferences = context.getSharedPreferences("analytics-android-".concat(str), 0);
                            sharedPreferences.getClass();
                            n78 n78Var = new n78(3, sharedPreferences);
                            dir.getClass();
                            fj0 fj0Var = new fj0();
                            fj0Var.E = dir;
                            if (!dir.exists() && !dir.mkdirs() && !dir.isDirectory()) {
                                sz6.q("Could not create directory at ", dir);
                                throw null;
                            }
                            Runtime.getRuntime().addShutdownHook(new n35(i2, fj0Var));
                            lpg lpgVar = (lpg) el5Var.E;
                            e45 e45Var = (e45) el5Var.H;
                            lpgVar.getClass();
                            e45Var.getClass();
                            return new w50(n78Var, fj0Var, lpgVar, str, strConcat, e45Var);
                        }
                    }
                }
                sz6.p("Invalid parameters for AndroidStorageProvider. \nAndroidStorageProvider requires at least 2 parameters.\n The first argument has to be an instance of Analytics,\n an the second argument has to be an instance of Context");
                return null;
            default:
                lqh lqhVar = new lqh();
                lqhVar.b = mffVar;
                return lqhVar;
        }
    }
}
