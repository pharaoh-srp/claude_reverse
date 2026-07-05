package defpackage;

import java.io.IOException;
import okio.Buffer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tr8 implements zy7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ tr8(zr8 zr8Var, int i, Buffer buffer, int i2, boolean z) {
        this.H = zr8Var;
        this.F = i;
        this.I = buffer;
        this.G = i2;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                zr8 zr8Var = (zr8) this.H;
                int i = this.F;
                Buffer buffer = (Buffer) this.I;
                int i2 = this.G;
                try {
                    zr8Var.O.getClass();
                    buffer.skip(i2);
                    zr8Var.b0.n(i, xr6.CANCEL);
                    synchronized (zr8Var) {
                        zr8Var.d0.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return iei.a;
            default:
                h4d h4dVar = (h4d) this.H;
                String str = (String) this.I;
                int i3 = this.F;
                return "Expected " + h4dVar.a + " but got " + str.subSequence(i3, this.G + i3 + 1).toString();
        }
    }

    public /* synthetic */ tr8(h4d h4dVar, String str, int i, int i2) {
        this.H = h4dVar;
        this.I = str;
        this.F = i;
        this.G = i2;
    }
}
