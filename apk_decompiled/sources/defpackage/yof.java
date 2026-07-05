package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class yof {
    public final qb5 a;
    public final ch4 b;
    public final poc c;
    public final poc d;
    public volatile int e;
    public final Context f;
    public final String g;

    public yof(Context context, zf zfVar) {
        int i;
        ch4 ch4Var;
        context.getClass();
        synchronized (pyk.R) {
            try {
                i = 9;
                if (pyk.S == null) {
                    Context applicationContext = context.getApplicationContext();
                    HandlerThread handlerThread = new HandlerThread("ProviderConnectionManager", 9);
                    handlerThread.start();
                    Looper looper = handlerThread.getLooper();
                    looper.getClass();
                    pyk.S = new ch4(applicationContext, looper);
                }
                ch4Var = pyk.S;
                ch4Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        poc pocVar = new poc(i);
        poc pocVar2 = new poc(10);
        this.e = -1;
        this.a = new qb5((Object) zfVar.F, (Object) new oe1(this, pocVar2, pocVar), false);
        this.b = ch4Var;
        this.c = pocVar;
        this.d = pocVar2;
        this.f = context;
        this.g = context.getPackageName();
    }

    public final exf a(int i, wee weeVar) {
        saa zy8Var;
        y46 y46Var = y46.E;
        exf exfVar = new exf();
        if (this.e != -1) {
            zy8Var = new zy8(Integer.valueOf(this.e));
        } else {
            do0 do0Var = new do0(5, this.d);
            exf exfVar2 = new exf();
            ch4 ch4Var = this.b;
            po3 po3Var = new po3(this, this.a, do0Var, exfVar2);
            Handler handler = ch4Var.F;
            handler.sendMessage(handler.obtainMessage(3, po3Var));
            do0 do0Var2 = new do0(4, this);
            i4 i4Var = new i4();
            i4Var.L = exfVar2;
            i4Var.M = do0Var2;
            exfVar2.a(i4Var, y46Var);
            zy8Var = i4Var;
        }
        zy8Var.a(new t08(zy8Var, 0, new o5l(this, i, exfVar, weeVar)), y46Var);
        return exfVar;
    }

    public final aje b() {
        String str = this.g;
        str.getClass();
        String string = this.f.getSharedPreferences("PermissionTokenManager.healthdata", 0).getString("token", null);
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i = runningAppProcessInfo.importance;
        return new aje(str, string, 112, i == 100 || i == 125 || i == 200);
    }
}
