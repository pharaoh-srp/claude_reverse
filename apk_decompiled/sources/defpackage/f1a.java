package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f1a implements c5f, z4f {
    public final d5f E;
    public final z4f F;
    public final fwb G;

    public f1a(c5f c5fVar, Map map, z4f z4fVar) {
        tz9 tz9Var = new tz9(4, c5fVar);
        umg umgVar = e5f.a;
        this.E = new d5f(map, tz9Var);
        this.F = z4fVar;
        fwb fwbVar = v6f.a;
        this.G = new fwb();
    }

    @Override // defpackage.z4f
    public final void a(Object obj, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-858296452);
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
            this.F.a(obj, ta4Var, e18Var, i2 & 126);
            boolean zH = e18Var.h(this) | e18Var.h(obj);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                objN = new vk3(this, 10, obj);
                e18Var.k0(objN);
            }
            fd9.d(obj, (bz7) objN, e18Var);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fb0(this, i, obj, ta4Var, 7);
        }
    }

    @Override // defpackage.c5f
    public final b5f b(zy7 zy7Var, String str) {
        return this.E.b(zy7Var, str);
    }

    @Override // defpackage.z4f
    public final void c(Object obj) {
        this.F.c(obj);
    }

    @Override // defpackage.c5f
    public final boolean d(Object obj) {
        return this.E.d(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    @Override // defpackage.c5f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map e() {
        /*
            r14 = this;
            fwb r0 = r14.G
            java.lang.Object[] r1 = r0.b
            long[] r0 = r0.a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L47
            r3 = 0
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L42
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L27:
            if (r9 >= r7) goto L40
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3c
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            z4f r11 = r14.F
            r11.c(r10)
        L3c:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L27
        L40:
            if (r7 != r8) goto L47
        L42:
            if (r4 == r2) goto L47
            int r4 = r4 + 1
            goto Ld
        L47:
            d5f r14 = r14.E
            java.util.Map r14 = r14.e()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f1a.e():java.util.Map");
    }

    @Override // defpackage.c5f
    public final Object f(String str) {
        return this.E.f(str);
    }
}
