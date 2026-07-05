package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class iu7 implements fl6 {
    public final Context a;
    public final hu7 b;
    public final yl4 c;
    public final Object d = new Object();
    public Handler e;
    public ThreadPoolExecutor f;
    public ThreadPoolExecutor g;
    public kvj h;

    public iu7(Context context, hu7 hu7Var) {
        knk.q("Context cannot be null", context);
        this.a = context.getApplicationContext();
        this.b = hu7Var;
        this.c = ju7.d;
    }

    @Override // defpackage.fl6
    public final void a(kvj kvjVar) {
        synchronized (this.d) {
            this.h = kvjVar;
        }
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new bf4("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.g = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                this.f.execute(new fc(22, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.e = null;
                ThreadPoolExecutor threadPoolExecutor = this.g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final jv7 c() {
        try {
            yl4 yl4Var = this.c;
            Context context = this.a;
            hu7 hu7Var = this.b;
            yl4Var.getClass();
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{hu7Var}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            iv7 iv7VarA = gu7.a(context, Collections.unmodifiableList(arrayList));
            int i = iv7VarA.a;
            if (i != 0) {
                pmf.o(grc.u("fetchFonts failed (", i, ")"));
                return null;
            }
            jv7[] jv7VarArr = (jv7[]) iv7VarA.b.get(0);
            if (jv7VarArr != null && jv7VarArr.length != 0) {
                return jv7VarArr[0];
            }
            pmf.o("fetchFonts failed (empty result)");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            xh6.f("provider not found", e);
            return null;
        }
    }
}
