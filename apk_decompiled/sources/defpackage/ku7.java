package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class ku7 implements Callable {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ Context G;
    public final /* synthetic */ int H;
    public final /* synthetic */ Object I;

    public /* synthetic */ ku7(String str, Context context, Object obj, int i, int i2) {
        this.E = i2;
        this.F = str;
        this.G = context;
        this.I = obj;
        this.H = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.E;
        int i2 = this.H;
        Object obj = this.I;
        Context context = this.G;
        String str = this.F;
        switch (i) {
            case 0:
                Object[] objArr = {(hu7) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return nu7.b(str, context, Collections.unmodifiableList(arrayList), i2);
            default:
                try {
                    return nu7.b(str, context, (ArrayList) obj, i2);
                } catch (Throwable unused) {
                    return new mu7(-3);
                }
        }
    }
}
