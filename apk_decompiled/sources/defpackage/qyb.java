package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qyb implements o5b {
    public final /* synthetic */ zy7 a;
    public final /* synthetic */ pz7 b;
    public final /* synthetic */ boolean c;

    public qyb(zy7 zy7Var, pz7 pz7Var, boolean z) {
        this.a = zy7Var;
        this.b = pz7Var;
        this.c = z;
    }

    @Override // defpackage.o5b
    public final p5b b(q5b q5bVar, List list, long j) {
        Object obj;
        final c3d c3dVarU;
        c3d c3dVarU2;
        float fFloatValue = ((Number) this.a.a()).floatValue();
        float f = fFloatValue < MTTypesetterKt.kLineSkipLimitMultiplier ? 0.0f : fFloatValue;
        long jA = rl4.a(0, 0, 0, 0, 10, j);
        int size = list.size();
        int i = 0;
        while (true) {
            String str = "Collection contains no element matching the predicate.";
            if (i >= size) {
                throw ij0.q("Collection contains no element matching the predicate.");
            }
            h5b h5bVar = (h5b) list.get(i);
            if (x44.r(zni.B(h5bVar), "icon")) {
                final c3d c3dVarU3 = h5bVar.u(jA);
                float f2 = 2.0f;
                int iM0 = q5bVar.M0(ryb.d * 2.0f) + c3dVarU3.E;
                int iL = mwa.L(iM0 * f);
                int iM02 = q5bVar.M0(ryb.e * 2.0f) + c3dVarU3.F;
                List list2 = list;
                int size2 = list2.size();
                int i2 = 0;
                while (i2 < size2) {
                    h5b h5bVar2 = (h5b) list.get(i2);
                    float f3 = f2;
                    String str2 = str;
                    if (x44.r(zni.B(h5bVar2), "indicatorRipple")) {
                        if (!((iM0 >= 0) & (iM02 >= 0))) {
                            d39.a("width and height must be >= 0");
                        }
                        final float f4 = f;
                        final c3d c3dVarU4 = h5bVar2.u(sl4.h(iM0, iM0, iM02, iM02));
                        int size3 = list2.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size3) {
                                obj = null;
                                break;
                            }
                            obj = list.get(i3);
                            if (x44.r(zni.B((h5b) obj), "indicator")) {
                                break;
                            }
                            i3++;
                        }
                        h5b h5bVar3 = (h5b) obj;
                        if (h5bVar3 != null) {
                            if (!((iL >= 0) & (iM02 >= 0))) {
                                d39.a("width and height must be >= 0");
                            }
                            c3dVarU = h5bVar3.u(sl4.h(iL, iL, iM02, iM02));
                        } else {
                            c3dVarU = null;
                        }
                        pz7 pz7Var = this.b;
                        if (pz7Var != null) {
                            int size4 = list2.size();
                            for (int i4 = 0; i4 < size4; i4++) {
                                h5b h5bVar4 = (h5b) list.get(i4);
                                if (x44.r(zni.B(h5bVar4), "label")) {
                                    c3dVarU2 = h5bVar4.u(jA);
                                }
                            }
                            throw ij0.q(str2);
                        }
                        c3dVarU2 = null;
                        nm6 nm6Var = nm6.E;
                        if (pz7Var == null) {
                            final int iM03 = rl4.h(j) == Integer.MAX_VALUE ? (q5bVar.M0(ryb.g) * 2) + c3dVarU3.E : rl4.h(j);
                            final int iF = sl4.f(q5bVar.M0(ryb.a), j);
                            final int i5 = (iM03 - c3dVarU3.E) / 2;
                            final int i6 = (iF - c3dVarU3.F) / 2;
                            final int i7 = (iM03 - c3dVarU4.E) / 2;
                            final int i8 = (iF - c3dVarU4.F) / 2;
                            return q5bVar.U(iM03, iF, nm6Var, new bz7() { // from class: nyb
                                @Override // defpackage.bz7
                                public final Object invoke(Object obj2) {
                                    b3d b3dVar = (b3d) obj2;
                                    c3d c3dVar = c3dVarU;
                                    if (c3dVar != null) {
                                        b3d.k(b3dVar, c3dVar, (iM03 - c3dVar.E) / 2, (iF - c3dVar.F) / 2);
                                    }
                                    b3d.k(b3dVar, c3dVarU3, i5, i6);
                                    b3d.k(b3dVar, c3dVarU4, i7, i8);
                                    return iei.a;
                                }
                            });
                        }
                        c3dVarU2.getClass();
                        float f5 = c3dVarU3.F;
                        float f6 = ryb.e;
                        float fQ0 = q5bVar.q0(f6) + f5;
                        float f7 = ryb.c;
                        float fQ02 = q5bVar.q0(f7) + fQ0 + c3dVarU2.F;
                        float fI = (rl4.i(j) - fQ02) / f3;
                        float fQ03 = q5bVar.q0(f6);
                        if (fI < fQ03) {
                            fI = fQ03;
                        }
                        float f8 = (fI * f3) + fQ02;
                        final boolean z = this.c;
                        final float f9 = (1.0f - f4) * ((z ? fI : (f8 - c3dVarU3.F) / f3) - fI);
                        final float fQ04 = q5bVar.q0(f7) + q5bVar.q0(f6) + c3dVarU3.F + fI;
                        final int iM04 = rl4.h(j) == Integer.MAX_VALUE ? (q5bVar.M0(ryb.g) * 2) + c3dVarU3.E : rl4.h(j);
                        final int i9 = (iM04 - c3dVarU2.E) / 2;
                        final int i10 = (iM04 - c3dVarU3.E) / 2;
                        final int i11 = (iM04 - c3dVarU4.E) / 2;
                        final float fQ05 = fI - q5bVar.q0(f6);
                        final c3d c3dVar = c3dVarU2;
                        final c3d c3dVar2 = c3dVarU;
                        final float f10 = fI;
                        return q5bVar.U(iM04, mwa.L(f8), nm6Var, new bz7() { // from class: myb
                            @Override // defpackage.bz7
                            public final Object invoke(Object obj2) {
                                b3d b3dVar = (b3d) obj2;
                                c3d c3dVar3 = c3dVar2;
                                float f11 = f9;
                                float f12 = f10;
                                if (c3dVar3 != null) {
                                    b3d.k(b3dVar, c3dVar3, (iM04 - c3dVar3.E) / 2, mwa.L((f12 - b3dVar.M0(ryb.e)) + f11));
                                }
                                if (z || f4 != MTTypesetterKt.kLineSkipLimitMultiplier) {
                                    b3d.k(b3dVar, c3dVar, i9, mwa.L(fQ04 + f11));
                                }
                                b3d.k(b3dVar, c3dVarU3, i10, mwa.L(f12 + f11));
                                b3d.k(b3dVar, c3dVarU4, i11, mwa.L(fQ05 + f11));
                                return iei.a;
                            }
                        });
                    }
                    i2++;
                    f2 = f3;
                    str = str2;
                }
                throw ij0.q(str);
            }
            i++;
        }
    }
}
