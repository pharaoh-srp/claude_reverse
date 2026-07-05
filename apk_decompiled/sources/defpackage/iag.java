package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class iag implements o5b {
    public final /* synthetic */ mag a;

    public iag(mag magVar) {
        this.a = magVar;
    }

    @Override // defpackage.o5b
    public final p5b b(q5b q5bVar, List list, long j) {
        int iMax;
        int iMax2;
        int i;
        int i2;
        int iL;
        mag magVar = this.a;
        int i3 = magVar.a;
        float[] fArr = magVar.g;
        ukc ukcVar = magVar.m;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            h5b h5bVar = (h5b) list.get(i4);
            if (zni.B(h5bVar) == w9g.E) {
                final c3d c3dVarU = h5bVar.u(j);
                int size2 = list.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    h5b h5bVar2 = (h5b) list.get(i5);
                    if (zni.B(h5bVar2) == w9g.F) {
                        boolean z = true;
                        ukc ukcVar2 = ukc.E;
                        final c3d c3dVarU2 = ukcVar == ukcVar2 ? h5bVar2.u(rl4.a(0, 0, 0, 0, 14, sl4.j(0, -c3dVarU.F, 1, j))) : h5bVar2.u(rl4.a(0, 0, 0, 0, 11, sl4.j(-c3dVarU.E, 0, 2, j)));
                        final bae baeVar = new bae();
                        float fC = magVar.c();
                        fArr.getClass();
                        if (!x44.o(fC, fArr.length == 0 ? null : Float.valueOf(fArr[0])) && !x44.o(fC, mp0.P0(fArr))) {
                            z = false;
                        }
                        int iR = c3dVarU2.R(lag.f);
                        int i6 = iR != Integer.MIN_VALUE ? iR : 0;
                        if (ukcVar == ukcVar2) {
                            iMax = Math.max(c3dVarU2.E, c3dVarU.E);
                            int i7 = c3dVarU.F;
                            int i8 = c3dVarU2.F;
                            iMax2 = i7 + i8;
                            i = (iMax - c3dVarU2.E) / 2;
                            i2 = i7 / 2;
                            iL = (iMax - c3dVarU.E) / 2;
                            baeVar.E = (i3 <= 0 || z) ? mwa.L(i8 * fC) : mwa.L((i8 - (i6 * 2)) * fC) + i6;
                        } else {
                            iMax = c3dVarU.E + c3dVarU2.E;
                            iMax2 = Math.max(c3dVarU2.F, c3dVarU.F);
                            i = c3dVarU.E / 2;
                            i2 = (iMax2 - c3dVarU2.F) / 2;
                            iL = (i3 <= 0 || z) ? mwa.L(c3dVarU2.E * fC) : mwa.L((c3dVarU2.E - (i6 * 2)) * fC) + i6;
                            baeVar.E = (iMax2 - c3dVarU.F) / 2;
                        }
                        final int i9 = i2;
                        final int i10 = i;
                        final int i11 = iL;
                        magVar.h.i(iMax);
                        magVar.i.i(iMax2);
                        return q5bVar.U(iMax, iMax2, nm6.E, new bz7() { // from class: hag
                            @Override // defpackage.bz7
                            public final Object invoke(Object obj) {
                                b3d b3dVar = (b3d) obj;
                                b3d.k(b3dVar, c3dVarU2, i10, i9);
                                b3d.k(b3dVar, c3dVarU, i11, baeVar.E);
                                return iei.a;
                            }
                        });
                    }
                }
                throw ij0.q("Collection contains no element matching the predicate.");
            }
        }
        throw ij0.q("Collection contains no element matching the predicate.");
    }
}
