package defpackage;

import android.content.Context;
import com.anthropic.claude.bell.PlaybackPace;
import com.anthropic.claude.bell.api.VoiceSelection;
import com.anthropic.claude.code.remote.stores.a;
import com.anthropic.claude.code.remote.stores.b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class un1 implements zy7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ String F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;

    public /* synthetic */ un1(l45 l45Var, jwf jwfVar, String str, boolean z, Context context, b bVar, a aVar, zy7 zy7Var, nwb nwbVar, nwb nwbVar2, nwb nwbVar3) {
        this.H = l45Var;
        this.I = jwfVar;
        this.F = str;
        this.G = z;
        this.J = context;
        this.K = bVar;
        this.L = aVar;
        this.M = zy7Var;
        this.N = nwbVar;
        this.O = nwbVar2;
        this.P = nwbVar3;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        String strA = null;
        Object obj = this.P;
        Object obj2 = this.O;
        Object obj3 = this.N;
        Object obj4 = this.M;
        Object obj5 = this.L;
        Object obj6 = this.K;
        Object obj7 = this.J;
        Object obj8 = this.I;
        Object obj9 = this.H;
        switch (i) {
            case 0:
                String str = (String) obj9;
                um1 um1Var = (um1) obj3;
                ki1 ki1Var = (ki1) obj2;
                fk0 fk0Var = (fk0) obj;
                String str2 = (String) ((dae) obj8).E;
                String str3 = (String) ((dae) obj7).E;
                String str4 = (String) ((dae) obj6).E;
                ArrayList arrayListA1 = w44.a1((List) ((jzg) obj5).d.getValue(), (List) ((myh) obj4).u.getValue());
                String strB = um1Var.b();
                if (strB != null) {
                    VoiceSelection.Companion.getClass();
                    strA = z4j.a(strB);
                }
                String str5 = strA;
                s41 s41Var = ki1Var.y;
                String strF = fk0Var.f();
                k6d k6dVar = PlaybackPace.Companion;
                String strA2 = um1Var.a();
                k6dVar.getClass();
                return new si1(this.F, str2, str, str3, str4, arrayListA1, str5, s41Var, this.G, strF, k6d.a(strA2).getSpeedFactor());
            default:
                gb9.D((l45) obj9, null, null, new dr6((jwf) obj8, this.F, this.G, (Context) obj7, (b) obj6, (a) obj5, (zy7) obj4, (nwb) obj3, (nwb) obj2, (nwb) obj, null), 3);
                return iei.a;
        }
    }

    public /* synthetic */ un1(String str, dae daeVar, String str2, dae daeVar2, dae daeVar3, jzg jzgVar, myh myhVar, um1 um1Var, ki1 ki1Var, boolean z, fk0 fk0Var) {
        this.F = str;
        this.I = daeVar;
        this.H = str2;
        this.J = daeVar2;
        this.K = daeVar3;
        this.L = jzgVar;
        this.M = myhVar;
        this.N = um1Var;
        this.O = ki1Var;
        this.G = z;
        this.P = fk0Var;
    }
}
