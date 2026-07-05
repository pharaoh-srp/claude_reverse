package defpackage;

import android.view.View;
import androidx.health.platform.client.proto.g;
import kotlinx.serialization.json.JsonObject;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class cx extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public Object G;
    public Object H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx(bi5 bi5Var, crd crdVar, pz7 pz7Var, qf5 qf5Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 10;
        this.G = bi5Var;
        this.H = pz7Var;
        this.I = qf5Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.I;
        switch (i) {
            case 0:
                return new cx((gx) this.G, (String) this.H, (JsonObject) obj2, tp4Var, 0);
            case 1:
                cx cxVar = new cx((a6i) this.H, (nwb) obj2, tp4Var, 1);
                cxVar.G = obj;
                return cxVar;
            case 2:
                return new cx((ux1) this.G, (m5c) this.H, (mx1) obj2, tp4Var, 2);
            case 3:
                cx cxVar2 = new cx((s5d) this.H, (y5d) obj2, tp4Var, 3);
                cxVar2.G = obj;
                return cxVar2;
            case 4:
                return new cx((yg2) this.G, (s5d) this.H, (y5d) obj2, tp4Var, 4);
            case 5:
                cx cxVar3 = new cx((pz7) this.H, (yg2) obj2, tp4Var, 5);
                cxVar3.G = obj;
                return cxVar3;
            case 6:
                cx cxVar4 = new cx((lp7) this.H, (lh2) obj2, tp4Var, 6);
                cxVar4.G = obj;
                return cxVar4;
            case 7:
                return new cx((t53) this.G, (j9f) this.H, (ps7) obj2, tp4Var, 7);
            case 8:
                return new cx((t53) this.G, (pl3) this.H, (View) obj2, tp4Var, 8);
            case 9:
                cx cxVar5 = new cx((bi5) obj2, tp4Var, 9);
                cxVar5.H = obj;
                return cxVar5;
            case 10:
                return new cx((bi5) this.G, (crd) null, (pz7) this.H, (qf5) obj2, tp4Var);
            case 11:
                cx cxVar6 = new cx((bi5) this.H, (pz7) obj2, (crd) null, tp4Var);
                cxVar6.G = obj;
                return cxVar6;
            case 12:
                cx cxVar7 = new cx((it5) this.H, (pz7) obj2, tp4Var, 12);
                cxVar7.G = obj;
                return cxVar7;
            case 13:
                return new cx((it5) this.G, (zwb) this.H, (pz7) obj2, tp4Var, 13);
            case 14:
                return new cx((fb6) this.G, (String) this.H, (String) obj2, tp4Var, 14);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new cx((d6e) this.H, (pz7) obj2, tp4Var, 15);
            case 16:
                cx cxVar8 = new cx((rz7) this.H, (lp7) obj2, tp4Var, 16);
                cxVar8.G = obj;
                return cxVar8;
            case g.MAX_FIELD_NUMBER /* 17 */:
                cx cxVar9 = new cx((lp7) obj2, tp4Var, 17);
                cxVar9.H = ((ai2) obj).a;
                return cxVar9;
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new cx((zub) this.G, (v79) this.H, (y86) obj2, tp4Var, 18);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                cx cxVar10 = new cx((uy7) obj2, (gx) this.G, tp4Var);
                cxVar10.H = obj;
                return cxVar10;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new cx((zy1) obj2, tp4Var, 20);
            case 21:
                return new cx((swe) this.G, (z3a) this.H, (bz7) obj2, tp4Var, 21);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new cx((zy7) this.G, (bz7) this.H, (x0a) obj2, tp4Var, 22);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                cx cxVar11 = new cx((l0b) obj2, (String) this.H, tp4Var);
                cxVar11.G = obj;
                return cxVar11;
            case 24:
                return new cx((dae) this.H, (d9d) obj2, tp4Var, 24);
            case BuildConfig.VERSION_CODE /* 25 */:
                cx cxVar12 = new cx((s8a) this.H, (nwb) obj2, tp4Var, 25);
                cxVar12.G = obj;
                return cxVar12;
            case 26:
                return new cx((fj0) this.G, (ue7) this.H, (eae) obj2, tp4Var, 26);
            case 27:
                cx cxVar13 = new cx((pz7) obj2, tp4Var, 27);
                cxVar13.H = obj;
                return cxVar13;
            case 28:
                cx cxVar14 = new cx((w7e) this.H, (arb) obj2, tp4Var, 28);
                cxVar14.G = obj;
                return cxVar14;
            default:
                cx cxVar15 = new cx((v84) this.H, (pz7) obj2, tp4Var, 29);
                cxVar15.G = obj;
                return cxVar15;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.E;
        m45 m45Var = m45.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 3:
                ((cx) create((bv2) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 4:
                ((cx) create((iei) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 5:
                ((cx) create((y5d) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                Object obj3 = ((ai2) obj).a;
                cx cxVar = new cx((lp7) this.I, (tp4) obj2, 17);
                cxVar.H = obj3;
                break;
        }
        return ((cx) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:348:0x071e, code lost:
    
        if (defpackage.j8.D(r4, r3, r20) != r5) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ac, code lost:
    
        if (defpackage.gb9.c0(r2, r4, r20) != r3) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0339 A[Catch: all -> 0x030d, TryCatch #9 {all -> 0x030d, blocks: (B:138:0x0307, B:148:0x0331, B:150:0x0339, B:151:0x0346, B:158:0x0356, B:145:0x0323, B:160:0x0359, B:162:0x035e, B:163:0x035f, B:144:0x031e, B:152:0x0347, B:154:0x034d), top: B:501:0x02fb, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0983  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:146:0x032d -> B:148:0x0331). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:240:0x04a9 -> B:234:0x0486). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx(bi5 bi5Var, pz7 pz7Var, crd crdVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 11;
        this.H = bi5Var;
        this.I = pz7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx(uy7 uy7Var, gx gxVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 19;
        this.I = uy7Var;
        this.G = gxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx(l0b l0bVar, String str, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 23;
        this.I = l0bVar;
        this.H = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cx(Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.I = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cx(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
        this.I = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cx(Object obj, Object obj2, Object obj3, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
    }
}
