package defpackage;

import com.anthropic.claude.api.conway.HeartbeatRecord;
import java.util.List;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes2.dex */
public final class x43 extends xzg implements pz7 {
    public final /* synthetic */ int E = 5;
    public int F;
    public final /* synthetic */ Object G;
    public int H;
    public /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x43(int i, nwb nwbVar, jsc jscVar, isc iscVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = i;
        this.I = nwbVar;
        this.J = jscVar;
        this.G = iscVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.G;
        Object obj3 = this.J;
        switch (i) {
            case 0:
                x43 x43Var = new x43((bae) this.I, (t53) obj3, (String) obj2, tp4Var);
                x43Var.H = ((Number) obj).intValue();
                return x43Var;
            case 1:
                return new x43((p05) this.I, (String) obj2, (HeartbeatRecord) obj3, this.H, tp4Var);
            case 2:
                return new x43((x0a) this.I, this.H, (b79) obj3, (u72) obj2, tp4Var);
            case 3:
                return new x43((koc) this.I, (gw8) obj3, (List) obj2, this.H, tp4Var);
            case 4:
                x43 x43Var2 = new x43((bo) obj3, (JsonPrimitive) obj2, tp4Var);
                x43Var2.I = obj;
                return x43Var2;
            default:
                return new x43(this.H, (nwb) this.I, (jsc) obj3, (isc) obj2, tp4Var);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                break;
        }
        return ((x43) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x009d -> B:36:0x00a1). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x43.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x43(bo boVar, JsonPrimitive jsonPrimitive, tp4 tp4Var) {
        super(2, tp4Var);
        this.J = boVar;
        this.G = jsonPrimitive;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x43(p05 p05Var, String str, HeartbeatRecord heartbeatRecord, int i, tp4 tp4Var) {
        super(2, tp4Var);
        this.I = p05Var;
        this.G = str;
        this.J = heartbeatRecord;
        this.H = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x43(x0a x0aVar, int i, b79 b79Var, u72 u72Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.I = x0aVar;
        this.H = i;
        this.J = b79Var;
        this.G = u72Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x43(koc kocVar, gw8 gw8Var, List list, int i, tp4 tp4Var) {
        super(2, tp4Var);
        this.I = kocVar;
        this.J = gw8Var;
        this.G = list;
        this.H = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x43(bae baeVar, t53 t53Var, String str, tp4 tp4Var) {
        super(2, tp4Var);
        this.I = baeVar;
        this.J = t53Var;
        this.G = str;
    }
}
