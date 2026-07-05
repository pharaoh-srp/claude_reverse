package defpackage;

import java.io.IOException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ije implements Runnable {
    public final /* synthetic */ int E;
    public Object F;
    public Object G;
    public Object H;

    public ije(lxk lxkVar, String str, URL url, fnf fnfVar) {
        this.E = 10;
        this.H = lxkVar;
        dgj.s(str);
        this.F = url;
        this.G = fnfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(int i, IOException iOException, byte[] bArr, Map map) {
        wlk wlkVarO = ((lxk) this.H).O();
        oxk oxkVar = new oxk();
        oxkVar.G = this;
        oxkVar.F = i;
        oxkVar.H = iOException;
        oxkVar.I = bArr;
        wlkVarO.T0(oxkVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0112  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ije.run():void");
    }

    public /* synthetic */ ije(Object obj, a4 a4Var, Object obj2, int i) {
        this.E = i;
        this.F = a4Var;
        this.G = obj2;
        this.H = obj;
    }

    public /* synthetic */ ije(Object obj, Object obj2, Object obj3, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
    }

    public /* synthetic */ ije(zqj zqjVar, wgk wgkVar, hlk hlkVar) {
        this.E = 3;
        this.F = zqjVar;
        this.H = wgkVar;
        this.G = hlkVar;
    }

    public /* synthetic */ ije(int i) {
        this.E = i;
    }
}
