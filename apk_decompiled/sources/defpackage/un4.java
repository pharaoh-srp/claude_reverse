package defpackage;

import android.content.SharedPreferences;
import com.anthropic.claude.api.trusteddevice.RotateReattestRequest;
import java.util.Base64;

/* JADX INFO: loaded from: classes2.dex */
public final class un4 extends xzg implements pz7 {
    public final /* synthetic */ int E = 0;
    public int F;
    public final /* synthetic */ long G;
    public /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un4(p5d p5dVar, String str, long j, kkh kkhVar, zhh zhhVar, occ occVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = p5dVar;
        this.I = str;
        this.G = j;
        this.J = kkhVar;
        this.K = zhhVar;
        this.L = occVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.L;
        Object obj3 = this.K;
        Object obj4 = this.J;
        Object obj5 = this.I;
        switch (i) {
            case 0:
                un4 un4Var = new un4((hhi) obj5, (wn4) obj4, (xx1) obj3, this.G, (lf9) obj2, tp4Var);
                un4Var.H = obj;
                return un4Var;
            case 1:
                return new un4((p5d) this.H, (String) obj5, this.G, (kkh) obj4, (zhh) obj3, (occ) obj2, tp4Var);
            default:
                return new un4((j8i) this.H, (String) obj5, (t5e) obj4, this.G, (byte[]) obj3, (String) obj2, tp4Var);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
        }
        return ((un4) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        Object objD;
        int i = this.E;
        long j = this.G;
        iei ieiVar = iei.a;
        Object obj2 = this.L;
        Object obj3 = this.K;
        Object obj4 = this.I;
        m45 m45Var = m45.E;
        Object obj5 = this.J;
        switch (i) {
            case 0:
                xx1 xx1Var = (xx1) obj3;
                wn4 wn4Var = (wn4) obj5;
                hhi hhiVar = (hhi) obj4;
                int i2 = this.F;
                if (i2 != 0) {
                    if (i2 == 1) {
                        sf5.h0(obj);
                        return ieiVar;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                paf pafVar = (paf) this.H;
                hhiVar.e = wn4.p1(wn4Var, xx1Var, j);
                l6 l6Var = new l6(wn4Var, hhiVar, (lf9) obj2, pafVar, 25);
                yg4 yg4Var = new yg4(wn4Var, hhiVar, xx1Var, 3);
                this.F = 1;
                return hhiVar.a(l6Var, yg4Var, this) == m45Var ? m45Var : ieiVar;
            case 1:
                occ occVar = (occ) obj2;
                String str = (String) obj4;
                zhh zhhVar = (zhh) obj3;
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    p5d p5dVar = (p5d) this.H;
                    this.F = 1;
                    objD = p5dVar.d(str, j, this);
                    if (objD == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i3 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                    objD = obj;
                }
                kkh kkhVar = (kkh) objD;
                if (kkhVar == null) {
                    return ieiVar;
                }
                long j2 = kkhVar.a;
                long jM = mwa.m(occVar.l((int) (j2 >> 32)), occVar.l((int) (j2 & 4294967295L)));
                if (kkh.b(jM, (kkh) obj5) || !x44.r(zhhVar.t().a.F, str) || occVar != zhhVar.b) {
                    return ieiVar;
                }
                zhhVar.c.invoke(zhh.j(zhhVar.t().a, jM));
                zhhVar.x = new kkh(jM);
                return ieiVar;
            default:
                t5e t5eVar = (t5e) obj5;
                j8i j8iVar = (j8i) this.H;
                int i4 = this.F;
                if (i4 != 0) {
                    if (i4 == 1) {
                        sf5.h0(obj);
                        return obj;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                v7i v7iVar = j8iVar.a;
                String str2 = (String) obj4;
                byte[] bArr = z5e.a;
                byte[] bArr2 = t5eVar.a;
                Base64.Encoder encoder = z5e.e;
                String strEncodeToString = encoder.encodeToString(bArr2);
                strEncodeToString.getClass();
                String strEncodeToString2 = encoder.encodeToString((byte[]) obj3);
                strEncodeToString2.getClass();
                String str3 = (String) obj2;
                SharedPreferences sharedPreferencesD = j8iVar.c.d();
                String string = sharedPreferencesD != null ? sharedPreferencesD.getString("device_binding_kid", null) : null;
                String strEncodeToString3 = encoder.encodeToString(t5eVar.b);
                strEncodeToString3.getClass();
                RotateReattestRequest rotateReattestRequest = new RotateReattestRequest(strEncodeToString, this.G, strEncodeToString2, str3, string, "android", strEncodeToString3);
                this.F = 1;
                Object objA = v7iVar.a(str2, rotateReattestRequest, this);
                return objA == m45Var ? m45Var : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un4(j8i j8iVar, String str, t5e t5eVar, long j, byte[] bArr, String str2, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = j8iVar;
        this.I = str;
        this.J = t5eVar;
        this.G = j;
        this.K = bArr;
        this.L = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un4(hhi hhiVar, wn4 wn4Var, xx1 xx1Var, long j, lf9 lf9Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.I = hhiVar;
        this.J = wn4Var;
        this.K = xx1Var;
        this.G = j;
        this.L = lf9Var;
    }
}
