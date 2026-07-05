package defpackage;

import com.anthropic.claude.chat.bottomsheet.f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e13 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ nwb F;
    public final /* synthetic */ nwb G;

    public /* synthetic */ e13(nwb nwbVar, nwb nwbVar2, int i) {
        this.E = i;
        this.F = nwbVar;
        this.G = nwbVar2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        nwb nwbVar = this.G;
        nwb nwbVar2 = this.F;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                nwbVar2.setValue(bool);
                f.a++;
                nwbVar.setValue(Boolean.TRUE);
                return iei.a;
            default:
                ((w86) obj).getClass();
                return new r5(nwbVar2, 4, nwbVar);
        }
    }
}
