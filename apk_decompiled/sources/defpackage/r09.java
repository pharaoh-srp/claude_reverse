package defpackage;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class r09 implements qdg, nf8 {
    public static final r09 G;
    public static final r09 H;
    public final /* synthetic */ int E;
    public boolean F;

    static {
        int i = 0;
        G = new r09(true, i);
        H = new r09(false, i);
    }

    public r09(Context context, Looper looper, g1h g1hVar) {
        this.E = 4;
        context.getApplicationContext();
        g1hVar.a(looper, null);
        g1hVar.a(Looper.getMainLooper(), null);
    }

    public void a() {
        this.F = false;
    }

    @Override // defpackage.nf8
    public boolean b() {
        return this.F;
    }

    @Override // defpackage.nf8
    public boolean c(i8g i8gVar) {
        return this.F;
    }

    public void d(boolean z) {
        if (this.F == z) {
            return;
        }
        this.F = z;
    }

    public String toString() {
        switch (this.E) {
            case 0:
                return sq6.v("}", new StringBuilder("IncorrectFragmentation{expected="), !this.F);
            default:
                return super.toString();
        }
    }

    public r09() {
        this.E = 1;
    }

    public /* synthetic */ r09(boolean z, int i) {
        this.E = i;
        this.F = z;
    }
}
