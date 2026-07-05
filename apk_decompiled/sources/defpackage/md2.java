package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class md2 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ float G;
    public /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md2(rz7 rz7Var, gri griVar, float f, z9e z9eVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 1;
        this.H = rz7Var;
        this.I = griVar;
        this.G = f;
        this.J = z9eVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.J;
        Object obj3 = this.I;
        switch (i) {
            case 0:
                return new md2((id2) this.H, this.G, (ed2) obj3, (xd2) obj2, tp4Var, 0);
            case 1:
                return new md2((rz7) this.H, (gri) obj3, this.G, (z9e) obj2, tp4Var);
            case 2:
                return new md2((a80) this.H, this.G, (a80) obj3, (nwb) obj2, tp4Var, 2);
            default:
                md2 md2Var = new md2(this.G, (mb0) obj3, (aae) obj2, tp4Var);
                md2Var.H = obj;
                return md2Var;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((md2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 1:
                return ((md2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 2:
                return ((md2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((md2) create((h9f) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        float f = this.G;
        iei ieiVar = iei.a;
        Object obj2 = this.J;
        Object obj3 = this.I;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                id2 id2Var = (id2) this.H;
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    rz7 rz7Var = id2Var.f;
                    uub uubVar = id2Var.d;
                    Float f2 = new Float(f);
                    this.F = 1;
                    if (rz7Var.invoke(uubVar, f2, this) == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i2 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                knk.u(getContext());
                id2Var.c.invoke((ed2) obj3, (xd2) obj2, new uub(id2Var.d.a));
                return ieiVar;
            case 1:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    rz7 rz7Var2 = (rz7) this.H;
                    UUID uuid = ((vc2) ((gri) obj3).a).e;
                    Float f3 = new Float(f);
                    this.F = 1;
                    if (rz7Var2.invoke(uuid, f3, this) == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i3 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                ((z9e) obj2).E = false;
                return ieiVar;
            case 2:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    a80 a80Var = (a80) this.H;
                    Float f4 = new Float(f);
                    yig yigVar = r99.a;
                    this.F = 1;
                    if (a80.c(a80Var, f4, yigVar, null, this, 12) == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i4 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                float fFloatValue = ((Number) ((a80) this.H).e()).floatValue();
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(((Number) ((a80) obj3).e()).floatValue())) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloatValue)) << 32);
                yig yigVar2 = r99.a;
                ((nwb) obj2).setValue(new fcc(jFloatToRawIntBits));
                return ieiVar;
            default:
                int i5 = this.F;
                if (i5 == 0) {
                    sf5.h0(obj);
                    ufe ufeVar = new ufe((aae) obj2, 2, (h9f) this.H);
                    this.F = 1;
                    return mpk.m(MTTypesetterKt.kLineSkipLimitMultiplier, this.G, (mb0) obj3, ufeVar, this, 4) == m45Var ? m45Var : ieiVar;
                }
                if (i5 == 1) {
                    sf5.h0(obj);
                    return ieiVar;
                }
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md2(float f, mb0 mb0Var, aae aaeVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 3;
        this.G = f;
        this.I = mb0Var;
        this.J = aaeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ md2(Object obj, float f, Object obj2, Object obj3, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
        this.G = f;
        this.I = obj2;
        this.J = obj3;
    }
}
