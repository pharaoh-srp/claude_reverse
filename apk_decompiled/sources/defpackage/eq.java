package defpackage;

import android.net.Uri;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.experience.Experience;
import com.anthropic.claude.api.project.Project;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class eq extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public Object F;
    public boolean G;
    public int H;
    public final /* synthetic */ Object I;
    public /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq(g93 g93Var, boolean z, int i, nwb nwbVar, nwb nwbVar2, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 5;
        this.F = g93Var;
        this.G = z;
        this.H = i;
        this.J = nwbVar;
        this.I = nwbVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        if (r3.h(r0, r11) != r10) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eq.d(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.I;
        switch (i) {
            case 0:
                return new eq((fq) this.J, (Uri) obj2, tp4Var, 0);
            case 1:
                return new eq((c61) this.J, (Uri) obj2, tp4Var, 1);
            case 2:
                eq eqVar = new eq((List) this.J, (uz2) obj2, this.G, tp4Var, 2);
                eqVar.F = obj;
                return eqVar;
            case 3:
                return new eq((t53) this.F, (dae) this.J, (vhd) obj2, this.G, tp4Var, 3);
            case 4:
                return new eq((t53) this.F, (Experience) this.J, (List) obj2, this.G, tp4Var, 4);
            case 5:
                return new eq((g93) this.F, this.G, this.H, (nwb) this.J, (nwb) obj2, tp4Var);
            case 6:
                return new eq((oz3) this.F, (String) this.J, (List) obj2, this.G, tp4Var, 6);
            case 7:
                eq eqVar2 = new eq((bi5) this.J, (rh5) obj2, tp4Var, 7);
                eqVar2.G = ((Boolean) obj).booleanValue();
                return eqVar2;
            case 8:
                eq eqVar3 = new eq((String) this.J, this.G, (bj5) obj2, tp4Var);
                eqVar3.F = obj;
                return eqVar3;
            case 9:
                return new eq((jj5) this.F, (Project) this.J, this.G, (String) obj2, tp4Var);
            case 10:
                return new eq(this.G, (bz9) this.F, (kl7) this.J, (ja8) obj2, tp4Var);
            case 11:
                eq eqVar4 = new eq((wmd) obj2, tp4Var);
                eqVar4.J = obj;
                return eqVar4;
            case 12:
                eq eqVar5 = new eq((lod) this.J, (String) obj2, tp4Var, 12);
                eqVar5.F = obj;
                return eqVar5;
            case 13:
                eq eqVar6 = new eq(this.G, (p6e) obj2, tp4Var);
                eqVar6.J = obj;
                return eqVar6;
            case 14:
                eq eqVar7 = new eq((tvf) this.J, (List) obj2, this.G, tp4Var, 14);
                eqVar7.F = obj;
                return eqVar7;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new eq((a80) this.F, this.G, (yig) this.J, (zy7) obj2, tp4Var);
            default:
                eq eqVar8 = new eq(this.G, (Long) this.J, (Long) obj2, tp4Var);
                eqVar8.F = obj;
                return eqVar8;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((eq) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 1:
                return ((eq) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 2:
                return ((eq) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 3:
                return ((eq) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 4:
                return ((eq) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 5:
                ((eq) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 6:
                return ((eq) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 7:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((eq) create(bool, (tp4) obj2)).invokeSuspend(ieiVar);
            case 8:
                return ((eq) create((kq4) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 9:
                return ((eq) create((guc) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 10:
                return ((eq) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 11:
                return ((eq) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 12:
                return ((eq) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 13:
                return ((eq) create((zhd) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 14:
                return ((eq) create((aid) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return ((eq) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((eq) create((zhd) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0227, code lost:
    
        if (r0 == r15) goto L99;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:299:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0977  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0a31  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c7  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq(a80 a80Var, boolean z, yig yigVar, zy7 zy7Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 15;
        this.F = a80Var;
        this.G = z;
        this.J = yigVar;
        this.I = zy7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq(jj5 jj5Var, Project project, boolean z, String str, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 9;
        this.F = jj5Var;
        this.J = project;
        this.G = z;
        this.I = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq(wmd wmdVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 11;
        this.I = wmdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eq(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.J = obj;
        this.I = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eq(Object obj, Object obj2, Object obj3, boolean z, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = obj;
        this.J = obj2;
        this.I = obj3;
        this.G = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eq(Object obj, Object obj2, boolean z, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.J = obj;
        this.I = obj2;
        this.G = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq(String str, boolean z, bj5 bj5Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 8;
        this.J = str;
        this.G = z;
        this.I = bj5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq(boolean z, bz9 bz9Var, kl7 kl7Var, ja8 ja8Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 10;
        this.G = z;
        this.F = bz9Var;
        this.J = kl7Var;
        this.I = ja8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq(boolean z, p6e p6eVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 13;
        this.G = z;
        this.I = p6eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq(boolean z, Long l, Long l2, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 16;
        this.G = z;
        this.J = l;
        this.I = l2;
    }
}
