package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a5f implements z4f {
    public static final y5f I = new y5f(new u9e(13), new k8d(0, 15));
    public final Map E;
    public final ewb F;
    public c5f G;
    public final tz9 H;

    public a5f(Map map) {
        this.E = map;
        long[] jArr = u6f.a;
        this.F = new ewb();
        this.H = new tz9(21, this);
    }

    @Override // defpackage.z4f
    public final void a(Object obj, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(533563200);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(ta4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(this) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            e18Var.d0(obj);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                tz9 tz9Var = this.H;
                if (!((Boolean) tz9Var.invoke(obj)).booleanValue()) {
                    mr9.q(grc.t(obj, "Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle."));
                    return;
                }
                Map map = (Map) this.E.get(obj);
                umg umgVar = e5f.a;
                f5f f5fVar = new f5f(new d5f(map, tz9Var));
                e18Var.k0(f5fVar);
                objN = f5fVar;
            }
            f5f f5fVar2 = (f5f) objN;
            j8.d(new hvd[]{e5f.a.a(f5fVar2), xda.a.a(f5fVar2)}, ta4Var, e18Var, (i2 & 112) | 8);
            boolean zH = e18Var.h(this) | e18Var.h(obj) | e18Var.h(f5fVar2);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new nf1(this, obj, f5fVar2, 20);
                e18Var.k0(objN2);
            }
            fd9.d(iei.a, (bz7) objN2, e18Var);
            if (e18Var.y && e18Var.G.i == e18Var.z) {
                e18Var.z = -1;
                e18Var.y = false;
            }
            e18Var.p(false);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fb0(this, i, obj, ta4Var, 13);
        }
    }

    @Override // defpackage.z4f
    public final void c(Object obj) {
        if (this.F.k(obj) == null) {
            this.E.remove(obj);
        }
    }
}
