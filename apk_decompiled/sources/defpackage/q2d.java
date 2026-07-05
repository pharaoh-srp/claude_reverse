package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q2d {
    public final nwb a;
    public final xpa b;
    public final xpa c;
    public final String d;

    public q2d(nwb nwbVar, xpa xpaVar, xpa xpaVar2, String str) {
        xpaVar.getClass();
        xpaVar2.getClass();
        this.a = nwbVar;
        this.b = xpaVar;
        this.c = xpaVar2;
        this.d = str;
    }

    public final void a() {
        (((Number) this.a.getValue()).intValue() <= 1 ? this.b : this.c).t(this.d);
    }
}
