package defpackage;

import android.view.View;
import androidx.compose.material3.internal.ripple.RippleNode;
import androidx.health.platform.client.proto.g;

/* JADX INFO: loaded from: classes.dex */
public final class rrb extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public Object G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rrb(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
        this.H = obj2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.H;
        switch (i) {
            case 0:
                return new rrb((ylg) this.G, (srb) obj2, tp4Var, 0);
            case 1:
                return new rrb((pz7) this.G, (juc) obj2, tp4Var, 1);
            case 2:
                return new rrb((bzd) obj2, tp4Var, 2);
            case 3:
                rrb rrbVar = new rrb((RippleNode) obj2, tp4Var, 3);
                rrbVar.G = obj;
                return rrbVar;
            case 4:
                return new rrb((cve) this.G, (pz7) obj2, tp4Var, 4);
            case 5:
                return new rrb((ec) this.G, (pxe) obj2, tp4Var, 5);
            case 6:
                return new rrb((gx) this.G, (pff) obj2, tp4Var, 6);
            case 7:
                return new rrb((ec) this.G, (gmf) obj2, tp4Var, 7);
            case 8:
                return new rrb((dpf) obj2, tp4Var, 8);
            case 9:
                return new rrb((sbg) this.G, (s5) obj2, tp4Var, 9);
            case 10:
                rrb rrbVar2 = new rrb((mn5) obj2, tp4Var, 10);
                rrbVar2.G = obj;
                return rrbVar2;
            case 11:
                return new rrb((gx) this.G, (tlg) obj2, tp4Var, 11);
            case 12:
                tp4Var.getClass();
                return new rrb((pz7) this.G, (vlg) obj2, tp4Var, 12);
            case 13:
                return new rrb((pug) this.G, (w79) obj2, tp4Var, 13);
            case 14:
                return new rrb((vfh) this.G, (mi6) obj2, tp4Var, 14);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                rrb rrbVar3 = new rrb((hhh) obj2, tp4Var, 15);
                rrbVar3.G = obj;
                return rrbVar3;
            case 16:
                return new rrb((gx) this.G, (n7d) obj2, tp4Var, 16);
            case g.MAX_FIELD_NUMBER /* 17 */:
                rrb rrbVar4 = new rrb((q0i) obj2, tp4Var, 17);
                rrbVar4.G = obj;
                return rrbVar4;
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new rrb((o7i) this.G, (zy7) obj2, tp4Var, 18);
            default:
                return new rrb((x7e) this.G, (View) obj2, tp4Var, 19);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.E;
        m45 m45Var = m45.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((rrb) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 14:
                ((rrb) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
        }
        return ((rrb) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:217:0x03e1, code lost:
    
        if (r0.invoke(r1, r24) != r11) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x054e, code lost:
    
        if (defpackage.bzd.a(r12, (java.lang.String) r0, r24) == r11) goto L284;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e2 A[Catch: all -> 0x02dd, TRY_LEAVE, TryCatch #1 {all -> 0x02dd, blocks: (B:134:0x0272, B:142:0x02d9, B:147:0x02e2, B:151:0x02e9, B:152:0x02ec, B:149:0x02e7, B:136:0x027f, B:138:0x02af, B:141:0x02b9), top: B:312:0x0272, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03d9 A[PHI: r0 r1
      0x03d9: PHI (r0v59 dx) = (r0v65 dx), (r0v72 dx) binds: [B:214:0x03d6, B:210:0x039d] A[DONT_GENERATE, DONT_INLINE]
      0x03d9: PHI (r1v16 java.lang.Object) = (r1v19 java.lang.Object), (r1v20 java.lang.Object) binds: [B:214:0x03d6, B:210:0x039d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:368:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:217:0x03e1 -> B:219:0x03e5). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rrb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rrb(Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
    }
}
