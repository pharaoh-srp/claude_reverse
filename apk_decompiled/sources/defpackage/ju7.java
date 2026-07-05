package defpackage;

import android.content.Context;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes2.dex */
public final class ju7 extends cl6 {
    public static final yl4 d = new yl4();

    public ju7(Context context, hu7 hu7Var) {
        super(new iu7(context, hu7Var));
    }

    public final void h(ThreadPoolExecutor threadPoolExecutor) {
        iu7 iu7Var = (iu7) ((fl6) this.b);
        synchronized (iu7Var.d) {
            iu7Var.f = threadPoolExecutor;
        }
    }
}
