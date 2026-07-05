package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ta0 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ m9j F;

    public /* synthetic */ ta0(m9j m9jVar, int i) {
        this.E = i;
        this.F = m9jVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        m9j m9jVar = this.F;
        switch (i) {
            case 0:
                m9jVar.v.setValue(null);
                return iei.a;
            case 1:
                return Boolean.valueOf(((Boolean) m9jVar.p.getValue()).booleanValue() || ((Boolean) m9jVar.q.getValue()).booleanValue() || ((Boolean) m9jVar.u.getValue()).booleanValue());
            default:
                Boolean bool = (Boolean) m9jVar.l.d.getValue();
                bool.getClass();
                return bool;
        }
    }
}
