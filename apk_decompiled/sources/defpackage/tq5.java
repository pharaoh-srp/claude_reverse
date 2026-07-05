package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class tq5 extends ContentObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq5(snk snkVar) {
        super(null);
        this.a = 2;
        this.b = snkVar;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        switch (this.a) {
            case 0:
                if (((uq5) this.b).E.h() != Integer.MIN_VALUE) {
                    uq5 uq5Var = (uq5) this.b;
                    k86 k86Var = uq5Var.G;
                    Float fValueOf = Float.valueOf(mwa.L((r3 / 255.0f) * 10.0f) / 10.0f);
                    k86Var.getClass();
                    uq5Var.G = new k86(fValueOf);
                    return;
                }
                return;
            case 1:
            default:
                super.onChange(z);
                return;
            case 2:
                snk snkVar = (snk) this.b;
                synchronized (snkVar.I) {
                    snkVar.J = null;
                    snkVar.G.run();
                    break;
                }
                synchronized (snkVar) {
                    try {
                        Iterator it = snkVar.K.iterator();
                        if (it.hasNext()) {
                            ij0.x(it.next());
                            throw null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tq5(Object obj, Handler handler, int i) {
        super(handler);
        this.a = i;
        this.b = obj;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        switch (this.a) {
            case 1:
                ((zy1) this.b).r(iei.a);
                break;
            default:
                super.onChange(z, uri);
                break;
        }
    }
}
