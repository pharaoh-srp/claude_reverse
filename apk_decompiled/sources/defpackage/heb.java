package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class heb implements s7b, r7b {
    public final s7b[] E;
    public final boolean[] F;
    public final IdentityHashMap G;
    public final yl4 H;
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public r7b K;
    public w3i L;
    public s7b[] M;
    public de4 N;

    public heb(yl4 yl4Var, long[] jArr, s7b... s7bVarArr) {
        this.H = yl4Var;
        this.E = s7bVarArr;
        yl4Var.getClass();
        iz8 iz8Var = nz8.F;
        vde vdeVar = vde.I;
        this.N = new de4(vdeVar, vdeVar);
        this.G = new IdentityHashMap();
        this.M = new s7b[0];
        this.F = new boolean[s7bVarArr.length];
        for (int i = 0; i < s7bVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.F[i] = true;
                this.E[i] = new yph(s7bVarArr[i], j);
            }
        }
    }

    @Override // defpackage.r7b
    public final void a(s7b s7bVar) {
        ArrayList arrayList = this.I;
        arrayList.remove(s7bVar);
        if (arrayList.isEmpty()) {
            s7b[] s7bVarArr = this.E;
            int i = 0;
            for (s7b s7bVar2 : s7bVarArr) {
                i += s7bVar2.m().a;
            }
            v3i[] v3iVarArr = new v3i[i];
            int i2 = 0;
            for (int i3 = 0; i3 < s7bVarArr.length; i3++) {
                w3i w3iVarM = s7bVarArr[i3].m();
                int i4 = w3iVarM.a;
                int i5 = 0;
                while (i5 < i4) {
                    v3i v3iVarA = w3iVarM.a(i5);
                    int i6 = v3iVarA.a;
                    jw7[] jw7VarArr = new jw7[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        jw7 jw7Var = v3iVarA.d[i7];
                        iw7 iw7VarA = jw7Var.a();
                        String str = jw7Var.m;
                        s7b[] s7bVarArr2 = s7bVarArr;
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(":");
                        String str2 = jw7Var.a;
                        if (str2 == null) {
                            str2 = "";
                        }
                        sb.append(str2);
                        iw7VarA.a = sb.toString();
                        if (str != null) {
                            iw7VarA.l = i3 + ":" + str;
                        }
                        jw7VarArr[i7] = new jw7(iw7VarA);
                        i7++;
                        s7bVarArr = s7bVarArr2;
                    }
                    s7b[] s7bVarArr3 = s7bVarArr;
                    v3i v3iVar = new v3i(i3 + ":" + v3iVarA.b, jw7VarArr);
                    this.J.put(v3iVar, v3iVarA);
                    v3iVarArr[i2] = v3iVar;
                    i5++;
                    i2++;
                    s7bVarArr = s7bVarArr3;
                }
            }
            this.L = new w3i(v3iVarArr);
            r7b r7bVar = this.K;
            r7bVar.getClass();
            r7bVar.a(this);
        }
    }

    @Override // defpackage.anf
    public final boolean b() {
        return this.N.b();
    }

    @Override // defpackage.s7b
    public final long c(f87[] f87VarArr, boolean[] zArr, b4f[] b4fVarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[f87VarArr.length];
        int[] iArr3 = new int[f87VarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = f87VarArr.length;
            identityHashMap = this.G;
            if (i2 >= length) {
                break;
            }
            b4f b4fVar = b4fVarArr[i2];
            Integer num = b4fVar == null ? null : (Integer) identityHashMap.get(b4fVar);
            iArr2[i2] = num == null ? -1 : num.intValue();
            f87 f87Var = f87VarArr[i2];
            if (f87Var != null) {
                String str = f87Var.a().b;
                iArr3[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = f87VarArr.length;
        b4f[] b4fVarArr2 = new b4f[length2];
        b4f[] b4fVarArr3 = new b4f[f87VarArr.length];
        f87[] f87VarArr2 = new f87[f87VarArr.length];
        s7b[] s7bVarArr = this.E;
        ArrayList arrayList = new ArrayList(s7bVarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < s7bVarArr.length) {
            int i4 = i;
            while (i4 < f87VarArr.length) {
                b4fVarArr3[i4] = iArr2[i4] == i3 ? b4fVarArr[i4] : null;
                if (iArr3[i4] == i3) {
                    f87 f87Var2 = f87VarArr[i4];
                    f87Var2.getClass();
                    iArr = iArr2;
                    v3i v3iVar = (v3i) this.J.get(f87Var2.a());
                    v3iVar.getClass();
                    f87VarArr2[i4] = new geb(f87Var2, v3iVar);
                } else {
                    iArr = iArr2;
                    f87VarArr2[i4] = null;
                }
                i4++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            s7b[] s7bVarArr2 = s7bVarArr;
            int i5 = i3;
            long jC = s7bVarArr2[i3].c(f87VarArr2, zArr, b4fVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jC;
            } else if (jC != j2) {
                sz6.j("Children enabled at different positions.");
                return 0L;
            }
            boolean z = false;
            for (int i6 = 0; i6 < f87VarArr.length; i6++) {
                if (iArr3[i6] == i5) {
                    b4f b4fVar2 = b4fVarArr3[i6];
                    b4fVar2.getClass();
                    b4fVarArr2[i6] = b4fVarArr3[i6];
                    identityHashMap.put(b4fVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr4[i6] == i5) {
                    fd9.M(b4fVarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList.add(s7bVarArr2[i5]);
            }
            i3 = i5 + 1;
            s7bVarArr = s7bVarArr2;
            iArr2 = iArr4;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(b4fVarArr2, i7, b4fVarArr, i7, length2);
        this.M = (s7b[]) arrayList.toArray(new s7b[i7]);
        AbstractList abstractListL = ywj.l(arrayList, new rl7(24));
        this.H.getClass();
        this.N = new de4(arrayList, abstractListL);
        return j2;
    }

    @Override // defpackage.anf
    public final long d() {
        return this.N.d();
    }

    @Override // defpackage.s7b
    public final long e(long j, wef wefVar) {
        s7b[] s7bVarArr = this.M;
        return (s7bVarArr.length > 0 ? s7bVarArr[0] : this.E[0]).e(j, wefVar);
    }

    @Override // defpackage.s7b
    public final void f() {
        for (s7b s7bVar : this.E) {
            s7bVar.f();
        }
    }

    @Override // defpackage.s7b
    public final long g(long j) {
        long jG = this.M[0].g(j);
        int i = 1;
        while (true) {
            s7b[] s7bVarArr = this.M;
            if (i >= s7bVarArr.length) {
                return jG;
            }
            if (s7bVarArr[i].g(jG) != jG) {
                sz6.j("Unexpected child seekToUs result.");
                return 0L;
            }
            i++;
        }
    }

    @Override // defpackage.s7b
    public final void h(long j) {
        for (s7b s7bVar : this.M) {
            s7bVar.h(j);
        }
    }

    @Override // defpackage.r7b
    public final void i(anf anfVar) {
        r7b r7bVar = this.K;
        r7bVar.getClass();
        r7bVar.i(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        r7 = r10;
     */
    @Override // defpackage.s7b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long k() {
        /*
            r18 = this;
            r0 = r18
            s7b[] r1 = r0.M
            int r2 = r1.length
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r7 = r3
            r6 = r5
        Ld:
            if (r6 >= r2) goto L66
            r9 = r1[r6]
            long r10 = r9.k()
            int r12 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            r13 = 0
            java.lang.String r15 = "Unexpected child seekToUs result."
            if (r12 == 0) goto L4e
            int r12 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r12 != 0) goto L41
            s7b[] r7 = r0.M
            int r8 = r7.length
            r12 = r5
        L25:
            r16 = r3
            if (r12 >= r8) goto L3f
            r3 = r7[r12]
            if (r3 != r9) goto L2e
            goto L3f
        L2e:
            long r3 = r3.g(r10)
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 != 0) goto L3b
            int r12 = r12 + 1
            r3 = r16
            goto L25
        L3b:
            defpackage.sz6.j(r15)
            return r13
        L3f:
            r7 = r10
            goto L61
        L41:
            r16 = r3
            int r3 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r3 != 0) goto L48
            goto L61
        L48:
            java.lang.String r0 = "Conflicting discontinuities."
            defpackage.sz6.j(r0)
            return r13
        L4e:
            r16 = r3
            int r3 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r3 == 0) goto L61
            long r3 = r9.g(r7)
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L5d
            goto L61
        L5d:
            defpackage.sz6.j(r15)
            return r13
        L61:
            int r6 = r6 + 1
            r3 = r16
            goto Ld
        L66:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.heb.k():long");
    }

    @Override // defpackage.s7b
    public final void l(r7b r7bVar, long j) {
        this.K = r7bVar;
        ArrayList arrayList = this.I;
        s7b[] s7bVarArr = this.E;
        Collections.addAll(arrayList, s7bVarArr);
        for (s7b s7bVar : s7bVarArr) {
            s7bVar.l(this, j);
        }
    }

    @Override // defpackage.s7b
    public final w3i m() {
        w3i w3iVar = this.L;
        w3iVar.getClass();
        return w3iVar;
    }

    @Override // defpackage.anf
    public final boolean o(oca ocaVar) {
        ArrayList arrayList = this.I;
        if (arrayList.isEmpty()) {
            return this.N.o(ocaVar);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((s7b) arrayList.get(i)).o(ocaVar);
        }
        return false;
    }

    @Override // defpackage.anf
    public final long p() {
        return this.N.p();
    }

    @Override // defpackage.anf
    public final void r(long j) {
        this.N.r(j);
    }
}
