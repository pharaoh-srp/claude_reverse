package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e5c {
    public boolean a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public e5c(int i, h99 h99Var, lyi lyiVar, int i2) {
        lyiVar = (i2 & 4) != 0 ? null : lyiVar;
        sq6.a(i);
        h99Var.getClass();
        this.b = i;
        this.c = h99Var;
        this.d = lyiVar == null ? kyi.MANUAL : lyiVar;
    }

    public boolean a(int i, int i2) {
        wwb wwbVar = (wwb) this.d;
        int i3 = this.b;
        gqb gqbVar = (gqb) wwbVar.E[i + i3];
        gqb gqbVar2 = (gqb) ((wwb) this.e).E[i3 + i2];
        return x44.r(gqbVar, gqbVar2) || gqbVar.getClass() == gqbVar2.getClass();
    }
}
