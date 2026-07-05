package defpackage;

import com.anthropic.claude.api.chat.tool.PropertyDefinition;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r13 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ r13(x0a x0aVar, boolean z, int i, int i2, iqb iqbVar, int i3) {
        this.J = x0aVar;
        this.F = z;
        this.G = i;
        this.H = i2;
        this.K = iqbVar;
        this.I = i3;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.K;
        Object obj4 = this.J;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(this.I | 1);
                z23.c((x0a) obj4, this.F, this.G, this.H, (iqb) obj3, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(this.H | 1);
                pwh.b((String) obj4, (PropertyDefinition) obj3, this.F, this.G, (ld4) obj, iP02, this.I);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ r13(String str, PropertyDefinition propertyDefinition, boolean z, int i, int i2, int i3) {
        this.J = str;
        this.K = propertyDefinition;
        this.F = z;
        this.G = i;
        this.H = i2;
        this.I = i3;
    }
}
