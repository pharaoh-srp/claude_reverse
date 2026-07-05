package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import io.sentry.util.l;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class w60 extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ w60(int i) {
        this.a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    y60 y60Var = new y60(choreographer, dgj.A(looperMyLooper));
                    return nai.Z(y60Var, y60Var.P);
                }
                sz6.j("no Looper on this thread");
                return null;
            case 1:
                t7f t7fVar = new t7f();
                new ArrayDeque();
                return t7fVar;
            case 2:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'.'SSSzzz", Locale.ROOT);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                return simpleDateFormat;
            case 3:
                return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT));
            case 4:
                return new l();
            default:
                return 0L;
        }
    }
}
