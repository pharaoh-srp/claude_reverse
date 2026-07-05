package defpackage;

import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.types.strings.ProjectId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sv extends xzg implements pz7 {
    public final /* synthetic */ int E = 1;
    public int F;
    public final /* synthetic */ uv G;
    public String H;
    public gnd I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv(uv uvVar, String str, gnd gndVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = uvVar;
        this.H = str;
        this.I = gndVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        uv uvVar = this.G;
        switch (i) {
            case 0:
                return new sv(uvVar, tp4Var);
            default:
                return new sv(uvVar, this.H, this.I, tp4Var);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((sv) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        String str;
        gnd gndVar;
        int i = this.E;
        iei ieiVar = iei.a;
        uv uvVar = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                wqd wqdVar = uvVar.c;
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    int i3 = uv.x;
                    if (uvVar.Q()) {
                        String strP = uvVar.P();
                        gnd gndVarR = uvVar.R();
                        this.H = strP;
                        this.I = gndVarR;
                        this.F = 1;
                        Object objP = wqdVar.p(gndVarR, strP, this);
                        if (objP != m45Var) {
                            obj = objP;
                            str = strP;
                            gndVar = gndVarR;
                        }
                    } else {
                        gnd gndVarR2 = uvVar.R();
                        this.F = 2;
                        if (wqdVar.o(gndVarR2, this) != m45Var) {
                        }
                    }
                } else if (i2 == 1) {
                    gndVar = this.I;
                    str = this.H;
                    sf5.h0(obj);
                } else if (i2 != 2) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                List list = (List) obj;
                if (list != null) {
                    int i4 = uv.x;
                    if (x44.r(uvVar.P(), str) && uvVar.R() == gndVar) {
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(x44.y(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(ProjectId.m1079boximpl(((Project) it.next()).m404getUuid5pmjbU()));
                        }
                        uvVar.T(arrayList);
                        break;
                    }
                }
                break;
            default:
                int i5 = this.F;
                if (i5 == 0) {
                    sf5.h0(obj);
                    String str2 = this.H;
                    gnd gndVar2 = this.I;
                    this.F = 1;
                    int i6 = uv.x;
                    if (uvVar.S(str2, gndVar2, false, this) == m45Var) {
                    }
                } else if (i5 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv(uv uvVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = uvVar;
    }
}
