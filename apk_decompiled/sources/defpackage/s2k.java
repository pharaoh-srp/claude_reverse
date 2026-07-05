package defpackage;

import android.util.Log;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.android.gms.common.data.DataHolder;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class s2k implements Runnable {
    public final /* synthetic */ int E;
    public final Object F;
    public final Object G;

    public s2k(zqj zqjVar, DataHolder dataHolder) {
        this.E = 25;
        this.F = dataHolder;
        Objects.requireNonNull(zqjVar);
        this.G = zqjVar;
    }

    private final void a() {
        v1l v1lVar = (v1l) this.F;
        int i = ((t3l) this.G).a;
        synchronized (v1lVar) {
            t3l t3lVar = (t3l) v1lVar.I.get(i);
            if (t3lVar != null) {
                Log.w("MessengerIpcClient", "Timing out request: " + i);
                v1lVar.I.remove(i);
                t3lVar.b(new zzt("Timed out waiting for response", null));
                v1lVar.c();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:286:0x0209 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f8  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s2k.run():void");
    }

    public String toString() {
        switch (this.E) {
            case 0:
                lrb lrbVar = new lrb(s2k.class.getSimpleName(), 28);
                uvj uvjVar = (uvj) this.G;
                dke dkeVar = new dke();
                ((dke) lrbVar.H).F = dkeVar;
                lrbVar.H = dkeVar;
                dkeVar.E = uvjVar;
                return lrbVar.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ s2k(Object obj, Object obj2, boolean z, int i) {
        this.E = i;
        this.G = obj;
        this.F = obj2;
    }

    public /* synthetic */ s2k(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    public s2k(zqj zqjVar, vwj vwjVar) {
        this.E = 10;
        this.F = vwjVar;
        Objects.requireNonNull(zqjVar);
        this.G = zqjVar;
    }
}
